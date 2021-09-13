// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

/**
 * Protobuf type {@code mojo.document.Document}
 */
public final class Document extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.document.Document)
    DocumentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Document.newBuilder() to construct.
  private Document(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Document() {
    blocks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Document();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Document(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.mojolang.mojo.document.MetaData.Builder subBuilder = null;
            if (metaData_ != null) {
              subBuilder = metaData_.toBuilder();
            }
            metaData_ = input.readMessage(org.mojolang.mojo.document.MetaData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metaData_);
              metaData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              blocks_ = new java.util.ArrayList<org.mojolang.mojo.document.Block>();
              mutable_bitField0_ |= 0x00000001;
            }
            blocks_.add(
                input.readMessage(org.mojolang.mojo.document.Block.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        blocks_ = java.util.Collections.unmodifiableList(blocks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Document_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Document_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.document.Document.class, org.mojolang.mojo.document.Document.Builder.class);
  }

  public static final int META_DATA_FIELD_NUMBER = 1;
  private org.mojolang.mojo.document.MetaData metaData_;
  /**
   * <code>.mojo.document.MetaData meta_data = 1;</code>
   * @return Whether the metaData field is set.
   */
  @java.lang.Override
  public boolean hasMetaData() {
    return metaData_ != null;
  }
  /**
   * <code>.mojo.document.MetaData meta_data = 1;</code>
   * @return The metaData.
   */
  @java.lang.Override
  public org.mojolang.mojo.document.MetaData getMetaData() {
    return metaData_ == null ? org.mojolang.mojo.document.MetaData.getDefaultInstance() : metaData_;
  }
  /**
   * <code>.mojo.document.MetaData meta_data = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.document.MetaDataOrBuilder getMetaDataOrBuilder() {
    return getMetaData();
  }

  public static final int BLOCKS_FIELD_NUMBER = 2;
  private java.util.List<org.mojolang.mojo.document.Block> blocks_;
  /**
   * <code>repeated .mojo.document.Block blocks = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.document.Block> getBlocksList() {
    return blocks_;
  }
  /**
   * <code>repeated .mojo.document.Block blocks = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.document.BlockOrBuilder> 
      getBlocksOrBuilderList() {
    return blocks_;
  }
  /**
   * <code>repeated .mojo.document.Block blocks = 2;</code>
   */
  @java.lang.Override
  public int getBlocksCount() {
    return blocks_.size();
  }
  /**
   * <code>repeated .mojo.document.Block blocks = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.document.Block getBlocks(int index) {
    return blocks_.get(index);
  }
  /**
   * <code>repeated .mojo.document.Block blocks = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.document.BlockOrBuilder getBlocksOrBuilder(
      int index) {
    return blocks_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (metaData_ != null) {
      output.writeMessage(1, getMetaData());
    }
    for (int i = 0; i < blocks_.size(); i++) {
      output.writeMessage(2, blocks_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metaData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetaData());
    }
    for (int i = 0; i < blocks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, blocks_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.document.Document)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.document.Document other = (org.mojolang.mojo.document.Document) obj;

    if (hasMetaData() != other.hasMetaData()) return false;
    if (hasMetaData()) {
      if (!getMetaData()
          .equals(other.getMetaData())) return false;
    }
    if (!getBlocksList()
        .equals(other.getBlocksList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMetaData()) {
      hash = (37 * hash) + META_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetaData().hashCode();
    }
    if (getBlocksCount() > 0) {
      hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
      hash = (53 * hash) + getBlocksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.document.Document parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Document parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Document parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Document parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Document parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Document parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Document parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Document parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Document parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Document parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Document parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Document parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mojolang.mojo.document.Document prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code mojo.document.Document}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.document.Document)
      org.mojolang.mojo.document.DocumentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Document_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.document.Document.class, org.mojolang.mojo.document.Document.Builder.class);
    }

    // Construct using org.mojolang.mojo.document.Document.newBuilder()
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
        getBlocksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metaDataBuilder_ == null) {
        metaData_ = null;
      } else {
        metaData_ = null;
        metaDataBuilder_ = null;
      }
      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        blocksBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Document_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Document getDefaultInstanceForType() {
      return org.mojolang.mojo.document.Document.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Document build() {
      org.mojolang.mojo.document.Document result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Document buildPartial() {
      org.mojolang.mojo.document.Document result = new org.mojolang.mojo.document.Document(this);
      int from_bitField0_ = bitField0_;
      if (metaDataBuilder_ == null) {
        result.metaData_ = metaData_;
      } else {
        result.metaData_ = metaDataBuilder_.build();
      }
      if (blocksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          blocks_ = java.util.Collections.unmodifiableList(blocks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.blocks_ = blocks_;
      } else {
        result.blocks_ = blocksBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mojolang.mojo.document.Document) {
        return mergeFrom((org.mojolang.mojo.document.Document)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.document.Document other) {
      if (other == org.mojolang.mojo.document.Document.getDefaultInstance()) return this;
      if (other.hasMetaData()) {
        mergeMetaData(other.getMetaData());
      }
      if (blocksBuilder_ == null) {
        if (!other.blocks_.isEmpty()) {
          if (blocks_.isEmpty()) {
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBlocksIsMutable();
            blocks_.addAll(other.blocks_);
          }
          onChanged();
        }
      } else {
        if (!other.blocks_.isEmpty()) {
          if (blocksBuilder_.isEmpty()) {
            blocksBuilder_.dispose();
            blocksBuilder_ = null;
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            blocksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBlocksFieldBuilder() : null;
          } else {
            blocksBuilder_.addAllMessages(other.blocks_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.mojolang.mojo.document.Document parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.document.Document) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.mojolang.mojo.document.MetaData metaData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.document.MetaData, org.mojolang.mojo.document.MetaData.Builder, org.mojolang.mojo.document.MetaDataOrBuilder> metaDataBuilder_;
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     * @return Whether the metaData field is set.
     */
    public boolean hasMetaData() {
      return metaDataBuilder_ != null || metaData_ != null;
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     * @return The metaData.
     */
    public org.mojolang.mojo.document.MetaData getMetaData() {
      if (metaDataBuilder_ == null) {
        return metaData_ == null ? org.mojolang.mojo.document.MetaData.getDefaultInstance() : metaData_;
      } else {
        return metaDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     */
    public Builder setMetaData(org.mojolang.mojo.document.MetaData value) {
      if (metaDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metaData_ = value;
        onChanged();
      } else {
        metaDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     */
    public Builder setMetaData(
        org.mojolang.mojo.document.MetaData.Builder builderForValue) {
      if (metaDataBuilder_ == null) {
        metaData_ = builderForValue.build();
        onChanged();
      } else {
        metaDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     */
    public Builder mergeMetaData(org.mojolang.mojo.document.MetaData value) {
      if (metaDataBuilder_ == null) {
        if (metaData_ != null) {
          metaData_ =
            org.mojolang.mojo.document.MetaData.newBuilder(metaData_).mergeFrom(value).buildPartial();
        } else {
          metaData_ = value;
        }
        onChanged();
      } else {
        metaDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     */
    public Builder clearMetaData() {
      if (metaDataBuilder_ == null) {
        metaData_ = null;
        onChanged();
      } else {
        metaData_ = null;
        metaDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     */
    public org.mojolang.mojo.document.MetaData.Builder getMetaDataBuilder() {
      
      onChanged();
      return getMetaDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     */
    public org.mojolang.mojo.document.MetaDataOrBuilder getMetaDataOrBuilder() {
      if (metaDataBuilder_ != null) {
        return metaDataBuilder_.getMessageOrBuilder();
      } else {
        return metaData_ == null ?
            org.mojolang.mojo.document.MetaData.getDefaultInstance() : metaData_;
      }
    }
    /**
     * <code>.mojo.document.MetaData meta_data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.document.MetaData, org.mojolang.mojo.document.MetaData.Builder, org.mojolang.mojo.document.MetaDataOrBuilder> 
        getMetaDataFieldBuilder() {
      if (metaDataBuilder_ == null) {
        metaDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.document.MetaData, org.mojolang.mojo.document.MetaData.Builder, org.mojolang.mojo.document.MetaDataOrBuilder>(
                getMetaData(),
                getParentForChildren(),
                isClean());
        metaData_ = null;
      }
      return metaDataBuilder_;
    }

    private java.util.List<org.mojolang.mojo.document.Block> blocks_ =
      java.util.Collections.emptyList();
    private void ensureBlocksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        blocks_ = new java.util.ArrayList<org.mojolang.mojo.document.Block>(blocks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.document.Block, org.mojolang.mojo.document.Block.Builder, org.mojolang.mojo.document.BlockOrBuilder> blocksBuilder_;

    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public java.util.List<org.mojolang.mojo.document.Block> getBlocksList() {
      if (blocksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(blocks_);
      } else {
        return blocksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public int getBlocksCount() {
      if (blocksBuilder_ == null) {
        return blocks_.size();
      } else {
        return blocksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public org.mojolang.mojo.document.Block getBlocks(int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);
      } else {
        return blocksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder setBlocks(
        int index, org.mojolang.mojo.document.Block value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.set(index, value);
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder setBlocks(
        int index, org.mojolang.mojo.document.Block.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.set(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder addBlocks(org.mojolang.mojo.document.Block value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder addBlocks(
        int index, org.mojolang.mojo.document.Block value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(index, value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder addBlocks(
        org.mojolang.mojo.document.Block.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder addBlocks(
        int index, org.mojolang.mojo.document.Block.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder addAllBlocks(
        java.lang.Iterable<? extends org.mojolang.mojo.document.Block> values) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blocks_);
        onChanged();
      } else {
        blocksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder clearBlocks() {
      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        blocksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public Builder removeBlocks(int index) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.remove(index);
        onChanged();
      } else {
        blocksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public org.mojolang.mojo.document.Block.Builder getBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public org.mojolang.mojo.document.BlockOrBuilder getBlocksOrBuilder(
        int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);  } else {
        return blocksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.document.BlockOrBuilder> 
         getBlocksOrBuilderList() {
      if (blocksBuilder_ != null) {
        return blocksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(blocks_);
      }
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public org.mojolang.mojo.document.Block.Builder addBlocksBuilder() {
      return getBlocksFieldBuilder().addBuilder(
          org.mojolang.mojo.document.Block.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public org.mojolang.mojo.document.Block.Builder addBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().addBuilder(
          index, org.mojolang.mojo.document.Block.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.document.Block blocks = 2;</code>
     */
    public java.util.List<org.mojolang.mojo.document.Block.Builder> 
         getBlocksBuilderList() {
      return getBlocksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.document.Block, org.mojolang.mojo.document.Block.Builder, org.mojolang.mojo.document.BlockOrBuilder> 
        getBlocksFieldBuilder() {
      if (blocksBuilder_ == null) {
        blocksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.document.Block, org.mojolang.mojo.document.Block.Builder, org.mojolang.mojo.document.BlockOrBuilder>(
                blocks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        blocks_ = null;
      }
      return blocksBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:mojo.document.Document)
  }

  // @@protoc_insertion_point(class_scope:mojo.document.Document)
  private static final org.mojolang.mojo.document.Document DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.document.Document();
  }

  public static org.mojolang.mojo.document.Document getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Document>
      PARSER = new com.google.protobuf.AbstractParser<Document>() {
    @java.lang.Override
    public Document parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Document(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Document> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Document> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.document.Document getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

