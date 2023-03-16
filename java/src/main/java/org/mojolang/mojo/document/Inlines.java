// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

/**
 * Protobuf type {@code mojo.document.Inlines}
 */
public final class Inlines extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.document.Inlines)
    InlinesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Inlines.newBuilder() to construct.
  private Inlines(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Inlines() {
    vals_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Inlines();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Inlines_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Inlines_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.document.Inlines.class, org.mojolang.mojo.document.Inlines.Builder.class);
  }

  public static final int VALS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.mojolang.mojo.document.Inline> vals_;
  /**
   * <code>repeated .mojo.document.Inline vals = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.document.Inline> getValsList() {
    return vals_;
  }
  /**
   * <code>repeated .mojo.document.Inline vals = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.document.InlineOrBuilder> 
      getValsOrBuilderList() {
    return vals_;
  }
  /**
   * <code>repeated .mojo.document.Inline vals = 1;</code>
   */
  @java.lang.Override
  public int getValsCount() {
    return vals_.size();
  }
  /**
   * <code>repeated .mojo.document.Inline vals = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.document.Inline getVals(int index) {
    return vals_.get(index);
  }
  /**
   * <code>repeated .mojo.document.Inline vals = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.document.InlineOrBuilder getValsOrBuilder(
      int index) {
    return vals_.get(index);
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
    for (int i = 0; i < vals_.size(); i++) {
      output.writeMessage(1, vals_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, vals_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.document.Inlines)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.document.Inlines other = (org.mojolang.mojo.document.Inlines) obj;

    if (!getValsList()
        .equals(other.getValsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getValsCount() > 0) {
      hash = (37 * hash) + VALS_FIELD_NUMBER;
      hash = (53 * hash) + getValsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.document.Inlines parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Inlines parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Inlines parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.Inlines parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.document.Inlines prototype) {
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
   * Protobuf type {@code mojo.document.Inlines}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.document.Inlines)
      org.mojolang.mojo.document.InlinesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Inlines_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Inlines_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.document.Inlines.class, org.mojolang.mojo.document.Inlines.Builder.class);
    }

    // Construct using org.mojolang.mojo.document.Inlines.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (valsBuilder_ == null) {
        vals_ = java.util.Collections.emptyList();
      } else {
        vals_ = null;
        valsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_Inlines_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Inlines getDefaultInstanceForType() {
      return org.mojolang.mojo.document.Inlines.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Inlines build() {
      org.mojolang.mojo.document.Inlines result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.Inlines buildPartial() {
      org.mojolang.mojo.document.Inlines result = new org.mojolang.mojo.document.Inlines(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.mojolang.mojo.document.Inlines result) {
      if (valsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vals_ = java.util.Collections.unmodifiableList(vals_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vals_ = vals_;
      } else {
        result.vals_ = valsBuilder_.build();
      }
    }

    private void buildPartial0(org.mojolang.mojo.document.Inlines result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof org.mojolang.mojo.document.Inlines) {
        return mergeFrom((org.mojolang.mojo.document.Inlines)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.document.Inlines other) {
      if (other == org.mojolang.mojo.document.Inlines.getDefaultInstance()) return this;
      if (valsBuilder_ == null) {
        if (!other.vals_.isEmpty()) {
          if (vals_.isEmpty()) {
            vals_ = other.vals_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValsIsMutable();
            vals_.addAll(other.vals_);
          }
          onChanged();
        }
      } else {
        if (!other.vals_.isEmpty()) {
          if (valsBuilder_.isEmpty()) {
            valsBuilder_.dispose();
            valsBuilder_ = null;
            vals_ = other.vals_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValsFieldBuilder() : null;
          } else {
            valsBuilder_.addAllMessages(other.vals_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.mojolang.mojo.document.Inline m =
                  input.readMessage(
                      org.mojolang.mojo.document.Inline.parser(),
                      extensionRegistry);
              if (valsBuilder_ == null) {
                ensureValsIsMutable();
                vals_.add(m);
              } else {
                valsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<org.mojolang.mojo.document.Inline> vals_ =
      java.util.Collections.emptyList();
    private void ensureValsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vals_ = new java.util.ArrayList<org.mojolang.mojo.document.Inline>(vals_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.document.Inline, org.mojolang.mojo.document.Inline.Builder, org.mojolang.mojo.document.InlineOrBuilder> valsBuilder_;

    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public java.util.List<org.mojolang.mojo.document.Inline> getValsList() {
      if (valsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vals_);
      } else {
        return valsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public int getValsCount() {
      if (valsBuilder_ == null) {
        return vals_.size();
      } else {
        return valsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public org.mojolang.mojo.document.Inline getVals(int index) {
      if (valsBuilder_ == null) {
        return vals_.get(index);
      } else {
        return valsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder setVals(
        int index, org.mojolang.mojo.document.Inline value) {
      if (valsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValsIsMutable();
        vals_.set(index, value);
        onChanged();
      } else {
        valsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder setVals(
        int index, org.mojolang.mojo.document.Inline.Builder builderForValue) {
      if (valsBuilder_ == null) {
        ensureValsIsMutable();
        vals_.set(index, builderForValue.build());
        onChanged();
      } else {
        valsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder addVals(org.mojolang.mojo.document.Inline value) {
      if (valsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValsIsMutable();
        vals_.add(value);
        onChanged();
      } else {
        valsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder addVals(
        int index, org.mojolang.mojo.document.Inline value) {
      if (valsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValsIsMutable();
        vals_.add(index, value);
        onChanged();
      } else {
        valsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder addVals(
        org.mojolang.mojo.document.Inline.Builder builderForValue) {
      if (valsBuilder_ == null) {
        ensureValsIsMutable();
        vals_.add(builderForValue.build());
        onChanged();
      } else {
        valsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder addVals(
        int index, org.mojolang.mojo.document.Inline.Builder builderForValue) {
      if (valsBuilder_ == null) {
        ensureValsIsMutable();
        vals_.add(index, builderForValue.build());
        onChanged();
      } else {
        valsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder addAllVals(
        java.lang.Iterable<? extends org.mojolang.mojo.document.Inline> values) {
      if (valsBuilder_ == null) {
        ensureValsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vals_);
        onChanged();
      } else {
        valsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder clearVals() {
      if (valsBuilder_ == null) {
        vals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public Builder removeVals(int index) {
      if (valsBuilder_ == null) {
        ensureValsIsMutable();
        vals_.remove(index);
        onChanged();
      } else {
        valsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public org.mojolang.mojo.document.Inline.Builder getValsBuilder(
        int index) {
      return getValsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public org.mojolang.mojo.document.InlineOrBuilder getValsOrBuilder(
        int index) {
      if (valsBuilder_ == null) {
        return vals_.get(index);  } else {
        return valsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.document.InlineOrBuilder> 
         getValsOrBuilderList() {
      if (valsBuilder_ != null) {
        return valsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vals_);
      }
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public org.mojolang.mojo.document.Inline.Builder addValsBuilder() {
      return getValsFieldBuilder().addBuilder(
          org.mojolang.mojo.document.Inline.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public org.mojolang.mojo.document.Inline.Builder addValsBuilder(
        int index) {
      return getValsFieldBuilder().addBuilder(
          index, org.mojolang.mojo.document.Inline.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.document.Inline vals = 1;</code>
     */
    public java.util.List<org.mojolang.mojo.document.Inline.Builder> 
         getValsBuilderList() {
      return getValsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.document.Inline, org.mojolang.mojo.document.Inline.Builder, org.mojolang.mojo.document.InlineOrBuilder> 
        getValsFieldBuilder() {
      if (valsBuilder_ == null) {
        valsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.document.Inline, org.mojolang.mojo.document.Inline.Builder, org.mojolang.mojo.document.InlineOrBuilder>(
                vals_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vals_ = null;
      }
      return valsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.document.Inlines)
  }

  // @@protoc_insertion_point(class_scope:mojo.document.Inlines)
  private static final org.mojolang.mojo.document.Inlines DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.document.Inlines();
  }

  public static org.mojolang.mojo.document.Inlines getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Inlines>
      PARSER = new com.google.protobuf.AbstractParser<Inlines>() {
    @java.lang.Override
    public Inlines parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Inlines> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Inlines> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.document.Inlines getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

