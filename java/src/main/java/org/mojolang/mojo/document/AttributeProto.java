// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/attribute.proto

package org.mojolang.mojo.document;

public final class AttributeProto {
  private AttributeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_document_Attribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_document_Attribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_document_Attribute_PropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_document_Attribute_PropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035mojo/document/attribute.proto\022\rmojo.do" +
      "cument\032\025mojo/core/value.proto\"\263\001\n\tAttrib" +
      "ute\022\022\n\nidentifier\030\001 \001(\t\022\017\n\007classes\030\002 \003(\t" +
      "\022<\n\nproperties\030\003 \003(\0132(.mojo.document.Att" +
      "ribute.PropertiesEntry\032C\n\017PropertiesEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\037\n\005value\030\002 \001(\0132\020.mojo.cor" +
      "e.Value:\0028\001Bk\n\032org.mojolang.mojo.documen" +
      "tB\016AttributeProtoP\001Z;github.com/mojo-lan" +
      "g/document/go/pkg/mojo/document;document" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.ValueProto.getDescriptor(),
        });
    internal_static_mojo_document_Attribute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_document_Attribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_document_Attribute_descriptor,
        new java.lang.String[] { "Identifier", "Classes", "Properties", });
    internal_static_mojo_document_Attribute_PropertiesEntry_descriptor =
      internal_static_mojo_document_Attribute_descriptor.getNestedTypes().get(0);
    internal_static_mojo_document_Attribute_PropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_document_Attribute_PropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.mojolang.mojo.core.ValueProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
