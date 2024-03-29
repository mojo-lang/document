// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/document/document.proto

package org.mojolang.mojo.document;

public interface InlineOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.document.Inline)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.document.Text text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>.mojo.document.Text text = 1;</code>
   * @return The text.
   */
  org.mojolang.mojo.document.Text getText();
  /**
   * <code>.mojo.document.Text text = 1;</code>
   */
  org.mojolang.mojo.document.TextOrBuilder getTextOrBuilder();

  /**
   * <code>.mojo.document.Emphasized emphasized = 2;</code>
   * @return Whether the emphasized field is set.
   */
  boolean hasEmphasized();
  /**
   * <code>.mojo.document.Emphasized emphasized = 2;</code>
   * @return The emphasized.
   */
  org.mojolang.mojo.document.Emphasized getEmphasized();
  /**
   * <code>.mojo.document.Emphasized emphasized = 2;</code>
   */
  org.mojolang.mojo.document.EmphasizedOrBuilder getEmphasizedOrBuilder();

  /**
   * <code>.mojo.document.Strong strong = 3;</code>
   * @return Whether the strong field is set.
   */
  boolean hasStrong();
  /**
   * <code>.mojo.document.Strong strong = 3;</code>
   * @return The strong.
   */
  org.mojolang.mojo.document.Strong getStrong();
  /**
   * <code>.mojo.document.Strong strong = 3;</code>
   */
  org.mojolang.mojo.document.StrongOrBuilder getStrongOrBuilder();

  /**
   * <code>.mojo.document.Strikeout strikeout = 4;</code>
   * @return Whether the strikeout field is set.
   */
  boolean hasStrikeout();
  /**
   * <code>.mojo.document.Strikeout strikeout = 4;</code>
   * @return The strikeout.
   */
  org.mojolang.mojo.document.Strikeout getStrikeout();
  /**
   * <code>.mojo.document.Strikeout strikeout = 4;</code>
   */
  org.mojolang.mojo.document.StrikeoutOrBuilder getStrikeoutOrBuilder();

  /**
   * <code>.mojo.document.Superscript superscript = 5;</code>
   * @return Whether the superscript field is set.
   */
  boolean hasSuperscript();
  /**
   * <code>.mojo.document.Superscript superscript = 5;</code>
   * @return The superscript.
   */
  org.mojolang.mojo.document.Superscript getSuperscript();
  /**
   * <code>.mojo.document.Superscript superscript = 5;</code>
   */
  org.mojolang.mojo.document.SuperscriptOrBuilder getSuperscriptOrBuilder();

  /**
   * <code>.mojo.document.Subscript subscript = 6;</code>
   * @return Whether the subscript field is set.
   */
  boolean hasSubscript();
  /**
   * <code>.mojo.document.Subscript subscript = 6;</code>
   * @return The subscript.
   */
  org.mojolang.mojo.document.Subscript getSubscript();
  /**
   * <code>.mojo.document.Subscript subscript = 6;</code>
   */
  org.mojolang.mojo.document.SubscriptOrBuilder getSubscriptOrBuilder();

  /**
   * <code>.mojo.document.SmallCaps small_caps = 7;</code>
   * @return Whether the smallCaps field is set.
   */
  boolean hasSmallCaps();
  /**
   * <code>.mojo.document.SmallCaps small_caps = 7;</code>
   * @return The smallCaps.
   */
  org.mojolang.mojo.document.SmallCaps getSmallCaps();
  /**
   * <code>.mojo.document.SmallCaps small_caps = 7;</code>
   */
  org.mojolang.mojo.document.SmallCapsOrBuilder getSmallCapsOrBuilder();

  /**
   * <code>.mojo.document.Quoted quoted = 8;</code>
   * @return Whether the quoted field is set.
   */
  boolean hasQuoted();
  /**
   * <code>.mojo.document.Quoted quoted = 8;</code>
   * @return The quoted.
   */
  org.mojolang.mojo.document.Quoted getQuoted();
  /**
   * <code>.mojo.document.Quoted quoted = 8;</code>
   */
  org.mojolang.mojo.document.QuotedOrBuilder getQuotedOrBuilder();

  /**
   * <code>.mojo.document.Cite cite = 9;</code>
   * @return Whether the cite field is set.
   */
  boolean hasCite();
  /**
   * <code>.mojo.document.Cite cite = 9;</code>
   * @return The cite.
   */
  org.mojolang.mojo.document.Cite getCite();
  /**
   * <code>.mojo.document.Cite cite = 9;</code>
   */
  org.mojolang.mojo.document.CiteOrBuilder getCiteOrBuilder();

  /**
   * <code>.mojo.document.Code code = 10;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <code>.mojo.document.Code code = 10;</code>
   * @return The code.
   */
  org.mojolang.mojo.document.Code getCode();
  /**
   * <code>.mojo.document.Code code = 10;</code>
   */
  org.mojolang.mojo.document.CodeOrBuilder getCodeOrBuilder();

  /**
   * <code>.mojo.document.Space space = 11;</code>
   * @return Whether the space field is set.
   */
  boolean hasSpace();
  /**
   * <code>.mojo.document.Space space = 11;</code>
   * @return The space.
   */
  org.mojolang.mojo.document.Space getSpace();
  /**
   * <code>.mojo.document.Space space = 11;</code>
   */
  org.mojolang.mojo.document.SpaceOrBuilder getSpaceOrBuilder();

  /**
   * <code>.mojo.document.LineBreak line_break = 12;</code>
   * @return Whether the lineBreak field is set.
   */
  boolean hasLineBreak();
  /**
   * <code>.mojo.document.LineBreak line_break = 12;</code>
   * @return The lineBreak.
   */
  org.mojolang.mojo.document.LineBreak getLineBreak();
  /**
   * <code>.mojo.document.LineBreak line_break = 12;</code>
   */
  org.mojolang.mojo.document.LineBreakOrBuilder getLineBreakOrBuilder();

  /**
   * <code>.mojo.document.Link link = 13;</code>
   * @return Whether the link field is set.
   */
  boolean hasLink();
  /**
   * <code>.mojo.document.Link link = 13;</code>
   * @return The link.
   */
  org.mojolang.mojo.document.Link getLink();
  /**
   * <code>.mojo.document.Link link = 13;</code>
   */
  org.mojolang.mojo.document.LinkOrBuilder getLinkOrBuilder();

  /**
   * <code>.mojo.document.Image image = 14;</code>
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   * <code>.mojo.document.Image image = 14;</code>
   * @return The image.
   */
  org.mojolang.mojo.document.Image getImage();
  /**
   * <code>.mojo.document.Image image = 14;</code>
   */
  org.mojolang.mojo.document.ImageOrBuilder getImageOrBuilder();

  /**
   * <code>.mojo.document.Note note = 15;</code>
   * @return Whether the note field is set.
   */
  boolean hasNote();
  /**
   * <code>.mojo.document.Note note = 15;</code>
   * @return The note.
   */
  org.mojolang.mojo.document.Note getNote();
  /**
   * <code>.mojo.document.Note note = 15;</code>
   */
  org.mojolang.mojo.document.NoteOrBuilder getNoteOrBuilder();

  /**
   * <code>.mojo.document.Span span = 16;</code>
   * @return Whether the span field is set.
   */
  boolean hasSpan();
  /**
   * <code>.mojo.document.Span span = 16;</code>
   * @return The span.
   */
  org.mojolang.mojo.document.Span getSpan();
  /**
   * <code>.mojo.document.Span span = 16;</code>
   */
  org.mojolang.mojo.document.SpanOrBuilder getSpanOrBuilder();

  public org.mojolang.mojo.document.Inline.InlineCase getInlineCase();
}
