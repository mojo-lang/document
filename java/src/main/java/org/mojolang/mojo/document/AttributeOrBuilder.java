// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/attribute.proto

package org.mojolang.mojo.document;

public interface AttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.document.Attribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string identifier = 1;</code>
   * @return The identifier.
   */
  java.lang.String getIdentifier();
  /**
   * <code>string identifier = 1;</code>
   * @return The bytes for identifier.
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();

  /**
   * <code>repeated string classes = 2;</code>
   * @return A list containing the classes.
   */
  java.util.List<java.lang.String>
      getClassesList();
  /**
   * <code>repeated string classes = 2;</code>
   * @return The count of classes.
   */
  int getClassesCount();
  /**
   * <code>repeated string classes = 2;</code>
   * @param index The index of the element to return.
   * @return The classes at the given index.
   */
  java.lang.String getClasses(int index);
  /**
   * <code>repeated string classes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the classes at the given index.
   */
  com.google.protobuf.ByteString
      getClassesBytes(int index);

  /**
   * <code>map&lt;string, .mojo.core.Value&gt; properties = 3;</code>
   */
  int getPropertiesCount();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; properties = 3;</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Value>
  getProperties();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; properties = 3;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Value>
  getPropertiesMap();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; properties = 3;</code>
   */
  /* nullable */
org.mojolang.mojo.core.Value getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
org.mojolang.mojo.core.Value defaultValue);
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; properties = 3;</code>
   */
  org.mojolang.mojo.core.Value getPropertiesOrThrow(
      java.lang.String key);
}
