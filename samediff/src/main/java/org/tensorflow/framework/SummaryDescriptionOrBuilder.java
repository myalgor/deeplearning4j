// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: summary.proto

package org.tensorflow.framework;

public interface SummaryDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SummaryDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hint on how plugins should process the data in this series.
   * Supported values include "scalar", "histogram", "image", "audio"
   * </pre>
   *
   * <code>string type_hint = 1;</code>
   */
  String getTypeHint();
  /**
   * <pre>
   * Hint on how plugins should process the data in this series.
   * Supported values include "scalar", "histogram", "image", "audio"
   * </pre>
   *
   * <code>string type_hint = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeHintBytes();
}
