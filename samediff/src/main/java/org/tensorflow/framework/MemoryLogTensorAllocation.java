// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: log_memory.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.MemoryLogTensorAllocation}
 */
public  final class MemoryLogTensorAllocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.MemoryLogTensorAllocation)
    MemoryLogTensorAllocationOrBuilder {
  // Use MemoryLogTensorAllocation.newBuilder() to construct.
  private MemoryLogTensorAllocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemoryLogTensorAllocation() {
    stepId_ = 0L;
    kernelName_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MemoryLogTensorAllocation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            stepId_ = input.readInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            kernelName_ = s;
            break;
          }
          case 26: {
            TensorDescription.Builder subBuilder = null;
            if (tensor_ != null) {
              subBuilder = tensor_.toBuilder();
            }
            tensor_ = input.readMessage(TensorDescription.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tensor_);
              tensor_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MemoryLogTensorAllocation.class, Builder.class);
  }

  public static final int STEP_ID_FIELD_NUMBER = 1;
  private long stepId_;
  /**
   * <pre>
   * Process-unique step id.
   * </pre>
   *
   * <code>int64 step_id = 1;</code>
   */
  public long getStepId() {
    return stepId_;
  }

  public static final int KERNEL_NAME_FIELD_NUMBER = 2;
  private volatile Object kernelName_;
  /**
   * <pre>
   * Name of the kernel making the allocation as set in GraphDef,
   * e.g., "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   */
  public String getKernelName() {
    Object ref = kernelName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      kernelName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the kernel making the allocation as set in GraphDef,
   * e.g., "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKernelNameBytes() {
    Object ref = kernelName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      kernelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENSOR_FIELD_NUMBER = 3;
  private TensorDescription tensor_;
  /**
   * <pre>
   * Allocated tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 3;</code>
   */
  public boolean hasTensor() {
    return tensor_ != null;
  }
  /**
   * <pre>
   * Allocated tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 3;</code>
   */
  public TensorDescription getTensor() {
    return tensor_ == null ? TensorDescription.getDefaultInstance() : tensor_;
  }
  /**
   * <pre>
   * Allocated tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 3;</code>
   */
  public org.tensorflow.framework.TensorDescriptionOrBuilder getTensorOrBuilder() {
    return getTensor();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stepId_ != 0L) {
      output.writeInt64(1, stepId_);
    }
    if (!getKernelNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kernelName_);
    }
    if (tensor_ != null) {
      output.writeMessage(3, getTensor());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stepId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, stepId_);
    }
    if (!getKernelNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kernelName_);
    }
    if (tensor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTensor());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MemoryLogTensorAllocation)) {
      return super.equals(obj);
    }
    MemoryLogTensorAllocation other = (MemoryLogTensorAllocation) obj;

    boolean result = true;
    result = result && (getStepId()
        == other.getStepId());
    result = result && getKernelName()
        .equals(other.getKernelName());
    result = result && (hasTensor() == other.hasTensor());
    if (hasTensor()) {
      result = result && getTensor()
          .equals(other.getTensor());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STEP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStepId());
    hash = (37 * hash) + KERNEL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKernelName().hashCode();
    if (hasTensor()) {
      hash = (37 * hash) + TENSOR_FIELD_NUMBER;
      hash = (53 * hash) + getTensor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MemoryLogTensorAllocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemoryLogTensorAllocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemoryLogTensorAllocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MemoryLogTensorAllocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MemoryLogTensorAllocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MemoryLogTensorAllocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MemoryLogTensorAllocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MemoryLogTensorAllocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MemoryLogTensorAllocation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MemoryLogTensorAllocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.MemoryLogTensorAllocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.MemoryLogTensorAllocation)
      org.tensorflow.framework.MemoryLogTensorAllocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MemoryLogTensorAllocation.class, Builder.class);
    }

    // Construct using org.tensorflow.framework.MemoryLogTensorAllocation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      stepId_ = 0L;

      kernelName_ = "";

      if (tensorBuilder_ == null) {
        tensor_ = null;
      } else {
        tensor_ = null;
        tensorBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorAllocation_descriptor;
    }

    public MemoryLogTensorAllocation getDefaultInstanceForType() {
      return MemoryLogTensorAllocation.getDefaultInstance();
    }

    public MemoryLogTensorAllocation build() {
      MemoryLogTensorAllocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public MemoryLogTensorAllocation buildPartial() {
      MemoryLogTensorAllocation result = new MemoryLogTensorAllocation(this);
      result.stepId_ = stepId_;
      result.kernelName_ = kernelName_;
      if (tensorBuilder_ == null) {
        result.tensor_ = tensor_;
      } else {
        result.tensor_ = tensorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MemoryLogTensorAllocation) {
        return mergeFrom((MemoryLogTensorAllocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MemoryLogTensorAllocation other) {
      if (other == MemoryLogTensorAllocation.getDefaultInstance()) return this;
      if (other.getStepId() != 0L) {
        setStepId(other.getStepId());
      }
      if (!other.getKernelName().isEmpty()) {
        kernelName_ = other.kernelName_;
        onChanged();
      }
      if (other.hasTensor()) {
        mergeTensor(other.getTensor());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      MemoryLogTensorAllocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MemoryLogTensorAllocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long stepId_ ;
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     */
    public long getStepId() {
      return stepId_;
    }
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     */
    public Builder setStepId(long value) {
      
      stepId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     */
    public Builder clearStepId() {
      
      stepId_ = 0L;
      onChanged();
      return this;
    }

    private Object kernelName_ = "";
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public String getKernelName() {
      Object ref = kernelName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        kernelName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKernelNameBytes() {
      Object ref = kernelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        kernelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public Builder setKernelName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kernelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public Builder clearKernelName() {
      
      kernelName_ = getDefaultInstance().getKernelName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the kernel making the allocation as set in GraphDef,
     * e.g., "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public Builder setKernelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kernelName_ = value;
      onChanged();
      return this;
    }

    private TensorDescription tensor_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        TensorDescription, TensorDescription.Builder, org.tensorflow.framework.TensorDescriptionOrBuilder> tensorBuilder_;
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public boolean hasTensor() {
      return tensorBuilder_ != null || tensor_ != null;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public TensorDescription getTensor() {
      if (tensorBuilder_ == null) {
        return tensor_ == null ? TensorDescription.getDefaultInstance() : tensor_;
      } else {
        return tensorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder setTensor(TensorDescription value) {
      if (tensorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensor_ = value;
        onChanged();
      } else {
        tensorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder setTensor(
        TensorDescription.Builder builderForValue) {
      if (tensorBuilder_ == null) {
        tensor_ = builderForValue.build();
        onChanged();
      } else {
        tensorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder mergeTensor(TensorDescription value) {
      if (tensorBuilder_ == null) {
        if (tensor_ != null) {
          tensor_ =
            TensorDescription.newBuilder(tensor_).mergeFrom(value).buildPartial();
        } else {
          tensor_ = value;
        }
        onChanged();
      } else {
        tensorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public Builder clearTensor() {
      if (tensorBuilder_ == null) {
        tensor_ = null;
        onChanged();
      } else {
        tensor_ = null;
        tensorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public TensorDescription.Builder getTensorBuilder() {
      
      onChanged();
      return getTensorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    public org.tensorflow.framework.TensorDescriptionOrBuilder getTensorOrBuilder() {
      if (tensorBuilder_ != null) {
        return tensorBuilder_.getMessageOrBuilder();
      } else {
        return tensor_ == null ?
            TensorDescription.getDefaultInstance() : tensor_;
      }
    }
    /**
     * <pre>
     * Allocated tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        TensorDescription, TensorDescription.Builder, org.tensorflow.framework.TensorDescriptionOrBuilder>
        getTensorFieldBuilder() {
      if (tensorBuilder_ == null) {
        tensorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            TensorDescription, TensorDescription.Builder, org.tensorflow.framework.TensorDescriptionOrBuilder>(
                getTensor(),
                getParentForChildren(),
                isClean());
        tensor_ = null;
      }
      return tensorBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.MemoryLogTensorAllocation)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.MemoryLogTensorAllocation)
  private static final MemoryLogTensorAllocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MemoryLogTensorAllocation();
  }

  public static MemoryLogTensorAllocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemoryLogTensorAllocation>
      PARSER = new com.google.protobuf.AbstractParser<MemoryLogTensorAllocation>() {
    public MemoryLogTensorAllocation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MemoryLogTensorAllocation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemoryLogTensorAllocation> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MemoryLogTensorAllocation> getParserForType() {
    return PARSER;
  }

  public MemoryLogTensorAllocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

