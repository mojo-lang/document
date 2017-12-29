///
type Inline : Union<Text,
                    Emphasized,
                    Strong,
                    Strikeout,
                    Superscript,
                    Subscript,
                    SmallCaps,
                    Quoted,
                    Cite,
                    Code,
                    Space,
                    LineBreak,
                    Link,
                    Image,
                    Note,
                    Span> {
}

/// normal text
type Text : String {
}

/// emphasized text
type Emphasized : [Inline] {
}

///
type Strong : [Inline] {
}

///
type Strikeout : [Inline] {
}

///
type Superscript : [Inline] {
}

///
type Subscript : [Inline] {
}

///
type SmallCaps : [Inline] {
}

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
    citations: [Citation]
    inline: [Inline]
}

///
type Citation {
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
    attribute: Attribute
    content: String
}

///
type Space {}

///
type LineBreak {}

///
type Link {
    attribute: Attr
    inlines: [Inline]
    target: Target
}

///
type Image {
    attribute: Attribute
    inlines: [Inline]
    target: Target
}

/// footnote or endnote
type Note = [Block]

/// Generic inline container with attributes
type Span {
    attribute: Attribute
    inlines: [Inline]
}