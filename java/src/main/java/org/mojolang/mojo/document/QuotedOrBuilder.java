// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

public interface QuotedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.document.Quoted)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.document.Quoted.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.mojo.document.Quoted.Type type = 1;</code>
   * @return The type.
   */
  org.mojolang.mojo.document.Quoted.Type getType();

  /**
   * <code>repeated .mojo.document.Inline text = 2;</code>
   */
  java.util.List<org.mojolang.mojo.document.Inline> 
      getTextList();
  /**
   * <code>repeated .mojo.document.Inline text = 2;</code>
   */
  org.mojolang.mojo.document.Inline getText(int index);
  /**
   * <code>repeated .mojo.document.Inline text = 2;</code>
   */
  int getTextCount();
  /**
   * <code>repeated .mojo.document.Inline text = 2;</code>
   */
  java.util.List<? extends org.mojolang.mojo.document.InlineOrBuilder> 
      getTextOrBuilderList();
  /**
   * <code>repeated .mojo.document.Inline text = 2;</code>
   */
  org.mojolang.mojo.document.InlineOrBuilder getTextOrBuilder(
      int index);
}
