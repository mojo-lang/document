// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

/**
 * Protobuf type {@code mojo.document.MetaValueObject}
 */
public final class MetaValueObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.document.MetaValueObject)
    MetaValueObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaValueObject.newBuilder() to construct.
  private MetaValueObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaValueObject() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetaValueObject();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaValueObject(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = com.google.protobuf.MapField.newMapField(
                  ValuesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.document.MetaValue>
            values__ = input.readMessage(
                ValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            values_.getMutableMap().put(
                values__.getKey(), values__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_MetaValueObject_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_MetaValueObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.document.MetaValueObject.class, org.mojolang.mojo.document.MetaValueObject.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private static final class ValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.mojolang.mojo.document.MetaValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.mojolang.mojo.document.MetaValue>newDefaultInstance(
                org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_MetaValueObject_ValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.mojolang.mojo.document.MetaValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, org.mojolang.mojo.document.MetaValue> values_;
  private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.document.MetaValue>
  internalGetValues() {
    if (values_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValuesDefaultEntryHolder.defaultEntry);
    }
    return values_;
  }

  public int getValuesCount() {
    return internalGetValues().getMap().size();
  }
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
   */

  @java.lang.Override
  public boolean containsValues(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> getValues() {
    return getValuesMap();
  }
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> getValuesMap() {
    return internalGetValues().getMap();
  }
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.document.MetaValue getValuesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.document.MetaValue defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> map =
        internalGetValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
   */
  @java.lang.Override

  public org.mojolang.mojo.document.MetaValue getValuesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> map =
        internalGetValues().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetValues(),
        ValuesDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, org.mojolang.mojo.document.MetaValue> entry
         : internalGetValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.mojolang.mojo.document.MetaValue>
      values__ = ValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, values__);
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
    if (!(obj instanceof org.mojolang.mojo.document.MetaValueObject)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.document.MetaValueObject other = (org.mojolang.mojo.document.MetaValueObject) obj;

    if (!internalGetValues().equals(
        other.internalGetValues())) return false;
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
    if (!internalGetValues().getMap().isEmpty()) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValues().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.MetaValueObject parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.document.MetaValueObject prototype) {
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
   * Protobuf type {@code mojo.document.MetaValueObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.document.MetaValueObject)
      org.mojolang.mojo.document.MetaValueObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_MetaValueObject_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_MetaValueObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.document.MetaValueObject.class, org.mojolang.mojo.document.MetaValueObject.Builder.class);
    }

    // Construct using org.mojolang.mojo.document.MetaValueObject.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableValues().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_MetaValueObject_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.MetaValueObject getDefaultInstanceForType() {
      return org.mojolang.mojo.document.MetaValueObject.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.document.MetaValueObject build() {
      org.mojolang.mojo.document.MetaValueObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.MetaValueObject buildPartial() {
      org.mojolang.mojo.document.MetaValueObject result = new org.mojolang.mojo.document.MetaValueObject(this);
      int from_bitField0_ = bitField0_;
      result.values_ = internalGetValues();
      result.values_.makeImmutable();
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
      if (other instanceof org.mojolang.mojo.document.MetaValueObject) {
        return mergeFrom((org.mojolang.mojo.document.MetaValueObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.document.MetaValueObject other) {
      if (other == org.mojolang.mojo.document.MetaValueObject.getDefaultInstance()) return this;
      internalGetMutableValues().mergeFrom(
          other.internalGetValues());
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
      org.mojolang.mojo.document.MetaValueObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mojolang.mojo.document.MetaValueObject) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, org.mojolang.mojo.document.MetaValue> values_;
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.document.MetaValue>
    internalGetValues() {
      if (values_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      return values_;
    }
    private com.google.protobuf.MapField<java.lang.String, org.mojolang.mojo.document.MetaValue>
    internalGetMutableValues() {
      onChanged();;
      if (values_ == null) {
        values_ = com.google.protobuf.MapField.newMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      if (!values_.isMutable()) {
        values_ = values_.copy();
      }
      return values_;
    }

    public int getValuesCount() {
      return internalGetValues().getMap().size();
    }
    /**
     * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
     */

    @java.lang.Override
    public boolean containsValues(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetValues().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValuesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> getValues() {
      return getValuesMap();
    }
    /**
     * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> getValuesMap() {
      return internalGetValues().getMap();
    }
    /**
     * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.document.MetaValue getValuesOrDefault(
        java.lang.String key,
        org.mojolang.mojo.document.MetaValue defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> map =
          internalGetValues().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
     */
    @java.lang.Override

    public org.mojolang.mojo.document.MetaValue getValuesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> map =
          internalGetValues().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearValues() {
      internalGetMutableValues().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
     */

    public Builder removeValues(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValues().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue>
    getMutableValues() {
      return internalGetMutableValues().getMutableMap();
    }
    /**
     * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
     */
    public Builder putValues(
        java.lang.String key,
        org.mojolang.mojo.document.MetaValue value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValues().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .mojo.document.MetaValue&gt; values = 1;</code>
     */

    public Builder putAllValues(
        java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue> values) {
      internalGetMutableValues().getMutableMap()
          .putAll(values);
      return this;
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


    // @@protoc_insertion_point(builder_scope:mojo.document.MetaValueObject)
  }

  // @@protoc_insertion_point(class_scope:mojo.document.MetaValueObject)
  private static final org.mojolang.mojo.document.MetaValueObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.document.MetaValueObject();
  }

  public static org.mojolang.mojo.document.MetaValueObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaValueObject>
      PARSER = new com.google.protobuf.AbstractParser<MetaValueObject>() {
    @java.lang.Override
    public MetaValueObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetaValueObject(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaValueObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaValueObject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.document.MetaValueObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

