// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

public interface MetaDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.document.MetaData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; vals = 1;</code>
   */
  int getValsCount();
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; vals = 1;</code>
   */
  boolean containsVals(
      java.lang.String key);
  /**
   * Use {@link #getValsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue>
  getVals();
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; vals = 1;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.document.MetaValue>
  getValsMap();
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; vals = 1;</code>
   */

  org.mojolang.mojo.document.MetaValue getValsOrDefault(
      java.lang.String key,
      org.mojolang.mojo.document.MetaValue defaultValue);
  /**
   * <code>map&lt;string, .mojo.document.MetaValue&gt; vals = 1;</code>
   */

  org.mojolang.mojo.document.MetaValue getValsOrThrow(
      java.lang.String key);
}
