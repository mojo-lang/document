// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

public interface CitationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.document.Citation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>repeated .mojo.document.Inline prefix = 2;</code>
   */
  java.util.List<org.mojolang.mojo.document.Inline> 
      getPrefixList();
  /**
   * <code>repeated .mojo.document.Inline prefix = 2;</code>
   */
  org.mojolang.mojo.document.Inline getPrefix(int index);
  /**
   * <code>repeated .mojo.document.Inline prefix = 2;</code>
   */
  int getPrefixCount();
  /**
   * <code>repeated .mojo.document.Inline prefix = 2;</code>
   */
  java.util.List<? extends org.mojolang.mojo.document.InlineOrBuilder> 
      getPrefixOrBuilderList();
  /**
   * <code>repeated .mojo.document.Inline prefix = 2;</code>
   */
  org.mojolang.mojo.document.InlineOrBuilder getPrefixOrBuilder(
      int index);

  /**
   * <code>repeated .mojo.document.Inline suffix = 3;</code>
   */
  java.util.List<org.mojolang.mojo.document.Inline> 
      getSuffixList();
  /**
   * <code>repeated .mojo.document.Inline suffix = 3;</code>
   */
  org.mojolang.mojo.document.Inline getSuffix(int index);
  /**
   * <code>repeated .mojo.document.Inline suffix = 3;</code>
   */
  int getSuffixCount();
  /**
   * <code>repeated .mojo.document.Inline suffix = 3;</code>
   */
  java.util.List<? extends org.mojolang.mojo.document.InlineOrBuilder> 
      getSuffixOrBuilderList();
  /**
   * <code>repeated .mojo.document.Inline suffix = 3;</code>
   */
  org.mojolang.mojo.document.InlineOrBuilder getSuffixOrBuilder(
      int index);

  /**
   * <code>.mojo.document.Citation.Mode mode = 4;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.mojo.document.Citation.Mode mode = 4;</code>
   * @return The mode.
   */
  org.mojolang.mojo.document.Citation.Mode getMode();

  /**
   * <code>int64 note_count = 5;</code>
   * @return The noteCount.
   */
  long getNoteCount();

  /**
   * <code>int64 hash = 6;</code>
   * @return The hash.
   */
  long getHash();
}
