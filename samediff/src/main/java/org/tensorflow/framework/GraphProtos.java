// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graph.proto

package org.tensorflow.framework;

public final class GraphProtos {
  private GraphProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013graph.proto\022\ntensorflow\032\016node_def.prot" +
      "o\032\016function.proto\032\016versions.proto\"\235\001\n\010Gr" +
      "aphDef\022!\n\004node\030\001 \003(\0132\023.tensorflow.NodeDe" +
      "f\022(\n\010versions\030\004 \001(\0132\026.tensorflow.Version" +
      "Def\022\023\n\007version\030\003 \001(\005B\002\030\001\022/\n\007library\030\002 \001(" +
      "\0132\036.tensorflow.FunctionDefLibraryB,\n\030org" +
      ".tensorflow.frameworkB\013GraphProtosP\001\370\001\001b" +
      "\006proto3"
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
          NodeProto.getDescriptor(),
          org.tensorflow.framework.FunctionProtos.getDescriptor(),
          org.tensorflow.framework.VersionsProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_GraphDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_GraphDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphDef_descriptor,
        new String[] { "Node", "Versions", "Version", "Library", });
    NodeProto.getDescriptor();
    org.tensorflow.framework.FunctionProtos.getDescriptor();
    org.tensorflow.framework.VersionsProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
