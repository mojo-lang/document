// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

/**
 * Protobuf type {@code mojo.document.ListAttribute}
 */
public final class ListAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.document.ListAttribute)
    ListAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAttribute.newBuilder() to construct.
  private ListAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAttribute() {
    numberStyle_ = 0;
    numberDelimiter_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAttribute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_ListAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_ListAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.document.ListAttribute.class, org.mojolang.mojo.document.ListAttribute.Builder.class);
  }

  /**
   * Protobuf enum {@code mojo.document.ListAttribute.NumberStyle}
   */
  public enum NumberStyle
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NUMBER_STYLE_UNSPECIFIED = 0;</code>
     */
    NUMBER_STYLE_UNSPECIFIED(0),
    /**
     * <code>NUMBER_STYLE_EXAMPLE = 1;</code>
     */
    NUMBER_STYLE_EXAMPLE(1),
    /**
     * <code>NUMBER_STYLE_DECIMAL = 2;</code>
     */
    NUMBER_STYLE_DECIMAL(2),
    /**
     * <code>NUMBER_STYLE_LOWER_ROMAN = 3;</code>
     */
    NUMBER_STYLE_LOWER_ROMAN(3),
    /**
     * <code>NUMBER_STYLE_UPPER_ROMAN = 4;</code>
     */
    NUMBER_STYLE_UPPER_ROMAN(4),
    /**
     * <code>NUMBER_STYLE_LOWER_ALPHA = 5;</code>
     */
    NUMBER_STYLE_LOWER_ALPHA(5),
    /**
     * <code>NUMBER_STYLE_UPPER_ALPHA = 6;</code>
     */
    NUMBER_STYLE_UPPER_ALPHA(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NUMBER_STYLE_UNSPECIFIED = 0;</code>
     */
    public static final int NUMBER_STYLE_UNSPECIFIED_VALUE = 0;
    /**
     * <code>NUMBER_STYLE_EXAMPLE = 1;</code>
     */
    public static final int NUMBER_STYLE_EXAMPLE_VALUE = 1;
    /**
     * <code>NUMBER_STYLE_DECIMAL = 2;</code>
     */
    public static final int NUMBER_STYLE_DECIMAL_VALUE = 2;
    /**
     * <code>NUMBER_STYLE_LOWER_ROMAN = 3;</code>
     */
    public static final int NUMBER_STYLE_LOWER_ROMAN_VALUE = 3;
    /**
     * <code>NUMBER_STYLE_UPPER_ROMAN = 4;</code>
     */
    public static final int NUMBER_STYLE_UPPER_ROMAN_VALUE = 4;
    /**
     * <code>NUMBER_STYLE_LOWER_ALPHA = 5;</code>
     */
    public static final int NUMBER_STYLE_LOWER_ALPHA_VALUE = 5;
    /**
     * <code>NUMBER_STYLE_UPPER_ALPHA = 6;</code>
     */
    public static final int NUMBER_STYLE_UPPER_ALPHA_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NumberStyle valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NumberStyle forNumber(int value) {
      switch (value) {
        case 0: return NUMBER_STYLE_UNSPECIFIED;
        case 1: return NUMBER_STYLE_EXAMPLE;
        case 2: return NUMBER_STYLE_DECIMAL;
        case 3: return NUMBER_STYLE_LOWER_ROMAN;
        case 4: return NUMBER_STYLE_UPPER_ROMAN;
        case 5: return NUMBER_STYLE_LOWER_ALPHA;
        case 6: return NUMBER_STYLE_UPPER_ALPHA;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NumberStyle>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NumberStyle> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NumberStyle>() {
            public NumberStyle findValueByNumber(int number) {
              return NumberStyle.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.mojolang.mojo.document.ListAttribute.getDescriptor().getEnumTypes().get(0);
    }

    private static final NumberStyle[] VALUES = values();

    public static NumberStyle valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NumberStyle(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:mojo.document.ListAttribute.NumberStyle)
  }

  /**
   * Protobuf enum {@code mojo.document.ListAttribute.NumberDelimiter}
   */
  public enum NumberDelimiter
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NUMBER_DELIMITER_UNSPECIFIED = 0;</code>
     */
    NUMBER_DELIMITER_UNSPECIFIED(0),
    /**
     * <code>NUMBER_DELIMITER_PERIOD = 1;</code>
     */
    NUMBER_DELIMITER_PERIOD(1),
    /**
     * <code>NUMBER_DELIMITER_ONE_PARENT = 2;</code>
     */
    NUMBER_DELIMITER_ONE_PARENT(2),
    /**
     * <code>NUMBER_DELIMITER_TWO_PARENTS = 3;</code>
     */
    NUMBER_DELIMITER_TWO_PARENTS(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NUMBER_DELIMITER_UNSPECIFIED = 0;</code>
     */
    public static final int NUMBER_DELIMITER_UNSPECIFIED_VALUE = 0;
    /**
     * <code>NUMBER_DELIMITER_PERIOD = 1;</code>
     */
    public static final int NUMBER_DELIMITER_PERIOD_VALUE = 1;
    /**
     * <code>NUMBER_DELIMITER_ONE_PARENT = 2;</code>
     */
    public static final int NUMBER_DELIMITER_ONE_PARENT_VALUE = 2;
    /**
     * <code>NUMBER_DELIMITER_TWO_PARENTS = 3;</code>
     */
    public static final int NUMBER_DELIMITER_TWO_PARENTS_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NumberDelimiter valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NumberDelimiter forNumber(int value) {
      switch (value) {
        case 0: return NUMBER_DELIMITER_UNSPECIFIED;
        case 1: return NUMBER_DELIMITER_PERIOD;
        case 2: return NUMBER_DELIMITER_ONE_PARENT;
        case 3: return NUMBER_DELIMITER_TWO_PARENTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NumberDelimiter>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NumberDelimiter> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NumberDelimiter>() {
            public NumberDelimiter findValueByNumber(int number) {
              return NumberDelimiter.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.mojolang.mojo.document.ListAttribute.getDescriptor().getEnumTypes().get(1);
    }

    private static final NumberDelimiter[] VALUES = values();

    public static NumberDelimiter valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NumberDelimiter(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:mojo.document.ListAttribute.NumberDelimiter)
  }

  public static final int BEGIN_NUMBER_FIELD_NUMBER = 1;
  private long beginNumber_ = 0L;
  /**
   * <code>int64 begin_number = 1;</code>
   * @return The beginNumber.
   */
  @java.lang.Override
  public long getBeginNumber() {
    return beginNumber_;
  }

  public static final int NUMBER_STYLE_FIELD_NUMBER = 2;
  private int numberStyle_ = 0;
  /**
   * <code>.mojo.document.ListAttribute.NumberStyle number_style = 2;</code>
   * @return The enum numeric value on the wire for numberStyle.
   */
  @java.lang.Override public int getNumberStyleValue() {
    return numberStyle_;
  }
  /**
   * <code>.mojo.document.ListAttribute.NumberStyle number_style = 2;</code>
   * @return The numberStyle.
   */
  @java.lang.Override public org.mojolang.mojo.document.ListAttribute.NumberStyle getNumberStyle() {
    org.mojolang.mojo.document.ListAttribute.NumberStyle result = org.mojolang.mojo.document.ListAttribute.NumberStyle.forNumber(numberStyle_);
    return result == null ? org.mojolang.mojo.document.ListAttribute.NumberStyle.UNRECOGNIZED : result;
  }

  public static final int NUMBER_DELIMITER_FIELD_NUMBER = 3;
  private int numberDelimiter_ = 0;
  /**
   * <code>.mojo.document.ListAttribute.NumberDelimiter number_delimiter = 3;</code>
   * @return The enum numeric value on the wire for numberDelimiter.
   */
  @java.lang.Override public int getNumberDelimiterValue() {
    return numberDelimiter_;
  }
  /**
   * <code>.mojo.document.ListAttribute.NumberDelimiter number_delimiter = 3;</code>
   * @return The numberDelimiter.
   */
  @java.lang.Override public org.mojolang.mojo.document.ListAttribute.NumberDelimiter getNumberDelimiter() {
    org.mojolang.mojo.document.ListAttribute.NumberDelimiter result = org.mojolang.mojo.document.ListAttribute.NumberDelimiter.forNumber(numberDelimiter_);
    return result == null ? org.mojolang.mojo.document.ListAttribute.NumberDelimiter.UNRECOGNIZED : result;
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
    if (beginNumber_ != 0L) {
      output.writeInt64(1, beginNumber_);
    }
    if (numberStyle_ != org.mojolang.mojo.document.ListAttribute.NumberStyle.NUMBER_STYLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, numberStyle_);
    }
    if (numberDelimiter_ != org.mojolang.mojo.document.ListAttribute.NumberDelimiter.NUMBER_DELIMITER_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, numberDelimiter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (beginNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, beginNumber_);
    }
    if (numberStyle_ != org.mojolang.mojo.document.ListAttribute.NumberStyle.NUMBER_STYLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, numberStyle_);
    }
    if (numberDelimiter_ != org.mojolang.mojo.document.ListAttribute.NumberDelimiter.NUMBER_DELIMITER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, numberDelimiter_);
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
    if (!(obj instanceof org.mojolang.mojo.document.ListAttribute)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.document.ListAttribute other = (org.mojolang.mojo.document.ListAttribute) obj;

    if (getBeginNumber()
        != other.getBeginNumber()) return false;
    if (numberStyle_ != other.numberStyle_) return false;
    if (numberDelimiter_ != other.numberDelimiter_) return false;
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
    hash = (37 * hash) + BEGIN_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBeginNumber());
    hash = (37 * hash) + NUMBER_STYLE_FIELD_NUMBER;
    hash = (53 * hash) + numberStyle_;
    hash = (37 * hash) + NUMBER_DELIMITER_FIELD_NUMBER;
    hash = (53 * hash) + numberDelimiter_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.document.ListAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.ListAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.ListAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.document.ListAttribute parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.document.ListAttribute prototype) {
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
   * Protobuf type {@code mojo.document.ListAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.document.ListAttribute)
      org.mojolang.mojo.document.ListAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_ListAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_ListAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.document.ListAttribute.class, org.mojolang.mojo.document.ListAttribute.Builder.class);
    }

    // Construct using org.mojolang.mojo.document.ListAttribute.newBuilder()
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
      beginNumber_ = 0L;
      numberStyle_ = 0;
      numberDelimiter_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.document.DocumentProto.internal_static_mojo_document_ListAttribute_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.ListAttribute getDefaultInstanceForType() {
      return org.mojolang.mojo.document.ListAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.document.ListAttribute build() {
      org.mojolang.mojo.document.ListAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.document.ListAttribute buildPartial() {
      org.mojolang.mojo.document.ListAttribute result = new org.mojolang.mojo.document.ListAttribute(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.document.ListAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.beginNumber_ = beginNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numberStyle_ = numberStyle_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numberDelimiter_ = numberDelimiter_;
      }
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
      if (other instanceof org.mojolang.mojo.document.ListAttribute) {
        return mergeFrom((org.mojolang.mojo.document.ListAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.document.ListAttribute other) {
      if (other == org.mojolang.mojo.document.ListAttribute.getDefaultInstance()) return this;
      if (other.getBeginNumber() != 0L) {
        setBeginNumber(other.getBeginNumber());
      }
      if (other.numberStyle_ != 0) {
        setNumberStyleValue(other.getNumberStyleValue());
      }
      if (other.numberDelimiter_ != 0) {
        setNumberDelimiterValue(other.getNumberDelimiterValue());
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
            case 8: {
              beginNumber_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              numberStyle_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              numberDelimiter_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long beginNumber_ ;
    /**
     * <code>int64 begin_number = 1;</code>
     * @return The beginNumber.
     */
    @java.lang.Override
    public long getBeginNumber() {
      return beginNumber_;
    }
    /**
     * <code>int64 begin_number = 1;</code>
     * @param value The beginNumber to set.
     * @return This builder for chaining.
     */
    public Builder setBeginNumber(long value) {
      
      beginNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 begin_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeginNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      beginNumber_ = 0L;
      onChanged();
      return this;
    }

    private int numberStyle_ = 0;
    /**
     * <code>.mojo.document.ListAttribute.NumberStyle number_style = 2;</code>
     * @return The enum numeric value on the wire for numberStyle.
     */
    @java.lang.Override public int getNumberStyleValue() {
      return numberStyle_;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberStyle number_style = 2;</code>
     * @param value The enum numeric value on the wire for numberStyle to set.
     * @return This builder for chaining.
     */
    public Builder setNumberStyleValue(int value) {
      numberStyle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberStyle number_style = 2;</code>
     * @return The numberStyle.
     */
    @java.lang.Override
    public org.mojolang.mojo.document.ListAttribute.NumberStyle getNumberStyle() {
      org.mojolang.mojo.document.ListAttribute.NumberStyle result = org.mojolang.mojo.document.ListAttribute.NumberStyle.forNumber(numberStyle_);
      return result == null ? org.mojolang.mojo.document.ListAttribute.NumberStyle.UNRECOGNIZED : result;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberStyle number_style = 2;</code>
     * @param value The numberStyle to set.
     * @return This builder for chaining.
     */
    public Builder setNumberStyle(org.mojolang.mojo.document.ListAttribute.NumberStyle value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      numberStyle_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberStyle number_style = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberStyle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numberStyle_ = 0;
      onChanged();
      return this;
    }

    private int numberDelimiter_ = 0;
    /**
     * <code>.mojo.document.ListAttribute.NumberDelimiter number_delimiter = 3;</code>
     * @return The enum numeric value on the wire for numberDelimiter.
     */
    @java.lang.Override public int getNumberDelimiterValue() {
      return numberDelimiter_;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberDelimiter number_delimiter = 3;</code>
     * @param value The enum numeric value on the wire for numberDelimiter to set.
     * @return This builder for chaining.
     */
    public Builder setNumberDelimiterValue(int value) {
      numberDelimiter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberDelimiter number_delimiter = 3;</code>
     * @return The numberDelimiter.
     */
    @java.lang.Override
    public org.mojolang.mojo.document.ListAttribute.NumberDelimiter getNumberDelimiter() {
      org.mojolang.mojo.document.ListAttribute.NumberDelimiter result = org.mojolang.mojo.document.ListAttribute.NumberDelimiter.forNumber(numberDelimiter_);
      return result == null ? org.mojolang.mojo.document.ListAttribute.NumberDelimiter.UNRECOGNIZED : result;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberDelimiter number_delimiter = 3;</code>
     * @param value The numberDelimiter to set.
     * @return This builder for chaining.
     */
    public Builder setNumberDelimiter(org.mojolang.mojo.document.ListAttribute.NumberDelimiter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      numberDelimiter_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.document.ListAttribute.NumberDelimiter number_delimiter = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberDelimiter() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numberDelimiter_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:mojo.document.ListAttribute)
  }

  // @@protoc_insertion_point(class_scope:mojo.document.ListAttribute)
  private static final org.mojolang.mojo.document.ListAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.document.ListAttribute();
  }

  public static org.mojolang.mojo.document.ListAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAttribute>
      PARSER = new com.google.protobuf.AbstractParser<ListAttribute>() {
    @java.lang.Override
    public ListAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.document.ListAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

