// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PingPongService.proto

package com.bineeta.grpc.server;

public final class PingPongServiceOuterClass {
  private PingPongServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PongResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PongResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PingPongService.proto\"\033\n\013PingRequest\022\014" +
      "\n\004ping\030\001 \001(\t\"\034\n\014PongResponse\022\014\n\004pong\030\001 \001" +
      "(\t26\n\017PingPongService\022#\n\004ping\022\014.PingRequ" +
      "est\032\r.PongResponseB\033\n\027com.bineeta.grpc.s" +
      "erverP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_PingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PingRequest_descriptor,
        new java.lang.String[] { "Ping", });
    internal_static_PongResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PongResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PongResponse_descriptor,
        new java.lang.String[] { "Pong", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
