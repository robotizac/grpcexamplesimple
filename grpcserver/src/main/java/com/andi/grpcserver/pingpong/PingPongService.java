package com.andi.grpcserver.pingpong;

import com.andi.grpcserver.pingpong.PingPongServiceGrpc.PingPongServiceImplBase;

import io.grpc.stub.StreamObserver;

public class PingPongService extends PingPongServiceImplBase {

    private static final String RESPONSE_VALUE = "pong";

    @Override
    public void play(PingPongMessage request, StreamObserver<PingPongMessage> responseObserver) {
	System.out.println("Got request: " + request);
	var response = PingPongMessage.newBuilder().setPingpong(RESPONSE_VALUE).build();
	responseObserver.onNext(response);
	responseObserver.onCompleted();
    }

}
