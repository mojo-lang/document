///
type Inline = Text
            | Emphasized
            | Strong
            | Strikeout
            | Superscript
            | Subscript
            | SmallCaps
            | Quoted
            | Cite
            | Code
            | Space
            | LineBreak
            | Link
            | Image
            | Note
            | Span

//type {
//    Text       : String
//    Emphasized : [Inline]
//    Strong     : [Inline]
//}

/// normal text
type Text : String

/// emphasized text
type Emphasized : [Inline]

///
type Strong : [Inline]

///
type Strikeout : [Inline]

///
type Superscript : [Inline]

///
type Subscript : [Inline]

///
type SmallCaps : [Inline]

///
type Space

///
type LineBreak

/// footnote or endnote
type Note: [Block]

///
type Quoted {
    enum Type {
        single
        double
    }

    type: Type
    text: [Inline]
}

///
type Cite {
    citations : [Citation]
    inline    : [Inline]
}

///
type Citation {
    @transform_hyphen
    enum Mode {
        normal
        author_in_text
        suppress_author
    }

    id: String
    prefix: [Inline]
    suffix: [Inline]
    mode: Mode
    note_count: Int
    hash: Int
}

/// Inline code (literal)
type Code {
    attribute : Attribute
    content   : String
}

///
type Link {
    attribute : Attribute @1
    inlines   : [Inline]  @2
    target    : Target    @3
}

///
type Image {
    attribute : Attribute
    inlines   : [Inline]
    target    : Target
}

/// Generic inline container with attributes
type Span {
    attribute : Attribute
    inlines   : [Inline]
}