///
@discriminator('@type')
@label_format('{}')
type Inline = Text        @1
            | Emphasized  @2
            | Strong      @3
            | Strikeout   @4
            | Superscript @5
            | Subscript   @6
            | SmallCaps   @7
            | Quoted      @8
            | Cite        @9
            | Code        @10
            | Space       @11
            | LineBreak   @12
            | Link        @13
            | Image       @14
            | Note        @15
            | Span        @16

/// normal text
type Text : String

/// emphasized text
type Emphasized : [Inline]

///
type Strong: [Inline]

///
type Strikeout: [Inline]

///
type Superscript: [Inline]

///
type Subscript: [Inline]

///
type SmallCaps: [Inline]

///
type Space

///
type LineBreak

/// footnote or endnote
type Note: [Block]

///
type Quoted {
    enum Type {
        double @0
        single @1
    }

    type: Type     @1
    text: [Inline] @2
}

///
type Cite {
    citations: [Citation] @1
    inlines:   [Inline]   @2
}

///
type Citation {
    @transform_hyphen
    enum Mode {
        normal          @0
        author_in_text  @1
        suppress_author @2
    }

    id: String       @1
    prefix: [Inline] @2
    suffix: [Inline] @3
    mode: Mode       @4
    note_count: Int  @5
    hash: Int        @6
}

/// Inline code (literal)
type Code {
    attribute : Attribute @1
    content   : String    @2
}

///
type Link {
    attribute   :Attribute @1
    description :[Inline]  @2
    target      :Target    @3
}

///
type Image {
    attribute   :Attribute @1
    description :[Inline]  @2
    target      :Target    @3
}

/// Generic inline container with attributes
type Span {
    attribute : Attribute @1
    inlines   : [Inline]  @2
}

type Target {
    title: String @1
    url: Url @2
}

type Inlines : [Inline]