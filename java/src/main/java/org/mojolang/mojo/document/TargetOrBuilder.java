// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

public interface TargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.document.Target)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>.mojo.core.Url url = 2;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>.mojo.core.Url url = 2;</code>
   * @return The url.
   */
  org.mojolang.mojo.core.Url getUrl();
  /**
   * <code>.mojo.core.Url url = 2;</code>
   */
  org.mojolang.mojo.core.UrlOrBuilder getUrlOrBuilder();
}
