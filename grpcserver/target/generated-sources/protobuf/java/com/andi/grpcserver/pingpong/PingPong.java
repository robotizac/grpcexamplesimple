// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PingPong.proto

package com.andi.grpcserver.pingpong;

public final class PingPong {
  private PingPong() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_andi_grpcserver_pingpong_PingPongMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_andi_grpcserver_pingpong_PingPongMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016PingPong.proto\022\034com.andi.grpcserver.pi" +
      "ngpong\"#\n\017PingPongMessage\022\020\n\010pingpong\030\001 " +
      "\001(\t2w\n\017PingPongService\022d\n\004play\022-.com.and" +
      "i.grpcserver.pingpong.PingPongMessage\032-." +
      "com.andi.grpcserver.pingpong.PingPongMes" +
      "sageB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_andi_grpcserver_pingpong_PingPongMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_andi_grpcserver_pingpong_PingPongMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_andi_grpcserver_pingpong_PingPongMessage_descriptor,
        new java.lang.String[] { "Pingpong", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}