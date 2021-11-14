package com.andi;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.andi.grpcserver.pingpong.PingPongMessage;
import com.andi.grpcserver.pingpong.PingPongServiceGrpc;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    private static final String HOST = "localhost";

    private static final String PLAY_VALUE = "ping";

    private static final int PORT = 10051;

    private final PingPongServiceGrpc.PingPongServiceBlockingStub blockingStub;

    public App(Channel channel) {
	blockingStub = PingPongServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) throws InterruptedException {
	final String target = HOST + ":" + PORT;

	ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();

	try {
	    App client = new App(channel);
	    client.play();
	} finally {
	    channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
	}

    }

    public void play() {
	logger.info("Will try to play...");
	PingPongMessage message = PingPongMessage.newBuilder().setPingpong(PLAY_VALUE).build();
	PingPongMessage response;
	try {
	    response = blockingStub.play(message);
	} catch (StatusRuntimeException e) {
	    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
	    return;
	}
	logger.info("Response: " + response.getPingpong());
    }

}
