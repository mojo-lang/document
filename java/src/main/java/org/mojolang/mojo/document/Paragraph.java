// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

/**
 * Protobuf type {@code mojo.document.Paragraph}
 */
public final class Paragraph extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.document.Paragraph)
    ParagraphOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Paragraph.newBuilder() to construct.
  private Paragraph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Paragraph() {
    inlines_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Paragraph();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Paragraph(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              inlines_ = new java.util.ArrayList<org.mojolang.mojo.document.Inline>();
              mutable_bitField0_ |= 0x00000001;
            }
            inlines_.add(
                input.readMessage(org.mojolang.mojo.document.Inline.parser(), extensionRegistry));
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
        inlines_ = java.util.Collections.unmodifiableList(inlines_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Paragraph_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Paragraph_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.document.Paragraph.class, org.mojolang.mojo.document.Paragraph.Builder.class);
  }

  public static final int INLINES_FIELD_NUMBER = 2;
  private java.util.List<org.mojolang.mojo.document.Inline> inlines_;
  /**
   * <code>repeated .mojo.document.Inline inlines = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.document.Inline> getInlinesList() {
    return inlines_;
  }
  /**
   * <code>repeated .mojo.document.Inline inlines = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.document.InlineOrBuilder> 
      getInlinesOrBuilderList() {
    return inlines_;
  }
  /**
   * <code>repeated .mojo.document.Inline inlines = 2;</code>
   */
  @java.lang.Override
  public int getInlinesCount() {
    return inlines_.size();
  }
  /**
   * <code>repeated .mojo.document.Inline inlines = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.document.Inline getInlines(int index) {
    return inlines_.get(index);
  }
  /**
   * <code>repeated .mojo.document.Inline inlines = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.document.InlineOrBuilder getInlinesOrBuilder(
      int index) {
    return inlines_.get(index);
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
    for (int i = 0; i < inlines_.size(); i++) {
      output.writeMessage(2, inlines_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inlines_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, inlines_.get(i));
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
    if (!(obj instanceof org.mojolang.mojo.document.Paragraph)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.document.Paragraph other = (org.mojolang.mojo.document.Paragraph) obj;

    if (!getInlinesList()
        .equals(other.getInlinesList())) return false;
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
    if (getInlinesCount() > 0) {
      hash = (37 * hash) + INLINES_FIELD_NUMBER;
      hash = (53 * hash) + getInlinesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.document.Paragraph parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Paragraph parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Paragraph parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Paragraph parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.document.Paragraph prototype) {
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
   * Protobuf type {@code mojo.document.Paragraph}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.document.Paragraph)
      org.mojolang.mojo.document.ParagraphOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Paragraph_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Paragraph_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.document.Paragraph.class, org.mojolang.mojo.document.Paragraph.Builder.class);
    }

    // Construct using org.mojolang.mojo.document.Paragraph.newBuilder()
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
        getInlinesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inlinesBuilder_ == null) {
        inlines_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inlinesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Paragraph_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Paragraph getDefaultInstanceForType() {
      return org.mojolang.mojo.document.Paragraph.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Paragraph build() {
      org.mojolang.mojo.document.Paragraph result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Paragraph buildPartial() {
      org.mojolang.mojo.document.Paragraph result = new org.mojolang.mojo.document.Paragraph(this);
      int from_bitField0_ = bitField0_;
      if (inlinesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inlines_ = java.util.Collections.unmodifiableList(inlines_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inlines_ = inlines_;
      } else {
        result.inlines_ = inlinesBuilder_.build();
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
      if (other instanceof org.mojolang.mojo.document.Paragraph) {
        return mergeFrom((org.mojolang.mojo.document.Paragraph)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.document.Paragraph other) {
      if (other == org.mojolang.mojo.document.Paragraph.getDefaultInstance()) return this;
      if (inlinesBuilder_ == null) {
        if (!other.inlines_.isEmpty()) {
          if (inlines_.isEmpty()) {
            inlines_ = other.inlines_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInlinesIsMutable();
            inlines_.addAll(other.inlines_);
          }
          onChanged();
        }
      } else {
        if (!other.inlines_.isEmpty()) {
          if (inlinesBuilder_.isEmpty()) {
            inlinesBuilder_.dispose();
            inlinesBuilder_ = null;
            inlines_ = other.inlines_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inlinesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInlinesFieldBuilder() : null;
          } else {
            inlinesBuilder_.addAllMessages(other.inlines_);
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
      org.mojolang.mojo.document.Paragraph parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.document.Paragraph) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.mojolang.mojo.document.Inline> inlines_ =
      java.util.Collections.emptyList();
    private void ensureInlinesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inlines_ = new java.util.ArrayList<org.mojolang.mojo.document.Inline>(inlines_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.document.Inline, org.mojolang.mojo.document.Inline.Builder, org.mojolang.mojo.document.InlineOrBuilder> inlinesBuilder_;

    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public java.util.List<org.mojolang.mojo.document.Inline> getInlinesList() {
      if (inlinesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inlines_);
      } else {
        return inlinesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public int getInlinesCount() {
      if (inlinesBuilder_ == null) {
        return inlines_.size();
      } else {
        return inlinesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public org.mojolang.mojo.document.Inline getInlines(int index) {
      if (inlinesBuilder_ == null) {
        return inlines_.get(index);
      } else {
        return inlinesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder setInlines(
        int index, org.mojolang.mojo.document.Inline value) {
      if (inlinesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInlinesIsMutable();
        inlines_.set(index, value);
        onChanged();
      } else {
        inlinesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder setInlines(
        int index, org.mojolang.mojo.document.Inline.Builder builderForValue) {
      if (inlinesBuilder_ == null) {
        ensureInlinesIsMutable();
        inlines_.set(index, builderForValue.build());
        onChanged();
      } else {
        inlinesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder addInlines(org.mojolang.mojo.document.Inline value) {
      if (inlinesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInlinesIsMutable();
        inlines_.add(value);
        onChanged();
      } else {
        inlinesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder addInlines(
        int index, org.mojolang.mojo.document.Inline value) {
      if (inlinesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInlinesIsMutable();
        inlines_.add(index, value);
        onChanged();
      } else {
        inlinesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder addInlines(
        org.mojolang.mojo.document.Inline.Builder builderForValue) {
      if (inlinesBuilder_ == null) {
        ensureInlinesIsMutable();
        inlines_.add(builderForValue.build());
        onChanged();
      } else {
        inlinesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder addInlines(
        int index, org.mojolang.mojo.document.Inline.Builder builderForValue) {
      if (inlinesBuilder_ == null) {
        ensureInlinesIsMutable();
        inlines_.add(index, builderForValue.build());
        onChanged();
      } else {
        inlinesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder addAllInlines(
        java.lang.Iterable<? extends org.mojolang.mojo.document.Inline> values) {
      if (inlinesBuilder_ == null) {
        ensureInlinesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inlines_);
        onChanged();
      } else {
        inlinesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder clearInlines() {
      if (inlinesBuilder_ == null) {
        inlines_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inlinesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public Builder removeInlines(int index) {
      if (inlinesBuilder_ == null) {
        ensureInlinesIsMutable();
        inlines_.remove(index);
        onChanged();
      } else {
        inlinesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public org.mojolang.mojo.document.Inline.Builder getInlinesBuilder(
        int index) {
      return getInlinesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public org.mojolang.mojo.document.InlineOrBuilder getInlinesOrBuilder(
        int index) {
      if (inlinesBuilder_ == null) {
        return inlines_.get(index);  } else {
        return inlinesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.document.InlineOrBuilder> 
         getInlinesOrBuilderList() {
      if (inlinesBuilder_ != null) {
        return inlinesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inlines_);
      }
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public org.mojolang.mojo.document.Inline.Builder addInlinesBuilder() {
      return getInlinesFieldBuilder().addBuilder(
          org.mojolang.mojo.document.Inline.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public org.mojolang.mojo.document.Inline.Builder addInlinesBuilder(
        int index) {
      return getInlinesFieldBuilder().addBuilder(
          index, org.mojolang.mojo.document.Inline.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.document.Inline inlines = 2;</code>
     */
    public java.util.List<org.mojolang.mojo.document.Inline.Builder> 
         getInlinesBuilderList() {
      return getInlinesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.document.Inline, org.mojolang.mojo.document.Inline.Builder, org.mojolang.mojo.document.InlineOrBuilder> 
        getInlinesFieldBuilder() {
      if (inlinesBuilder_ == null) {
        inlinesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.document.Inline, org.mojolang.mojo.document.Inline.Builder, org.mojolang.mojo.document.InlineOrBuilder>(
                inlines_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inlines_ = null;
      }
      return inlinesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.document.Paragraph)
  }

  // @@protoc_insertion_point(class_scope:mojo.document.Paragraph)
  private static final org.mojolang.mojo.document.Paragraph DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.document.Paragraph();
  }

  public static org.mojolang.mojo.document.Paragraph getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Paragraph>
      PARSER = new com.google.protobuf.AbstractParser<Paragraph>() {
    @java.lang.Override
    public Paragraph parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Paragraph(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Paragraph> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Paragraph> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.document.Paragraph getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

