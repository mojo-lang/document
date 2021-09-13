/// Block element
@discriminator('@type')
@label_format('{}')
type Block = Plain          @1
           | Paragraph      @2
           | LineBlock      @3
           | CodeBlock      @4
           | BlockQuote     @5
           | OrderedList    @6
           | BulletList     @7
           | DefinitionList @8
           | Header         @9
           | Table          @10
           | Division       @11
           //| Null           @12


type Line: [Inline]

/// Plain text, not a paragraph
type Plain {
    inlines: [Inline] @2
}

/// Paragraph
type Paragraph {
    inlines: [Inline] @2
}

/// Multiple non-breaking lines
type LineBlock {
    lines : [Line] @2
}

type CodeBlock {
    attribute: Attribute @1
    language: String @2

    lines: [Line] @3
}

type BlockQuote {
    blocks: [Block] @2
}

/// List attributes.
type ListAttribute {
    /// Style of list numbers.
    @transform_hyphen
    enum NumberStyle {
        unspecified @0
        example     @1
        decimal     @2
        lower_roman @3 //@alias('lower-roman')
        upper_roman @4 //@alias('upper-roman')
        lower_alpha @5 //@alias('lower-alpha')
        upper_alpha @6 //@alias('upper-alpha')
    }

    @transform_hyphen
    enum NumberDelimiter {
        unspecified @1
        period      @2
        one_parent  @3 @alias('one-parent')
        two_parents @4 @alias('two-parent')
    }

    begin_number: Int @1
    number_style: NumberStyle @2
    number_delimiter: NumberDelimiter @3
}

/// 
type OrderedList {
    attribute: ListAttribute @1
    items: [[Block]] @2
}

/// Bullet list (list of items, each a list of blocks)
type BulletList {
    items: [[Block]] @2
}

/// Definition list Each list item is a pair consisting of a term (a list of inlines)
/// and one or more definitions (each a list of blocks)
type DefinitionList {
    ///
    type Item {
        term: [Inline] @1
        definitions: [[Block]] @2
    }

    items: [Item] @2
}

type Header {
    attribute: Attribute @1

    level : Int @2
    text : [Inline] @3
}

///
type Table {
    /// Alignment of a table column.
    enum Alignment {
        unspecified @1
        left   @2
        right  @3
        center @4
    }

    /// Table cells are list of Blocks
    type Cell: [Block]

    /// row, list of blocks
    type Row: [Cell]

    type Header: [Cell]

    caption: [Inline] @1 //< caption for table

    alignment: Alignment @2 //< column alignments (required)

    width: Double @3 = 0 //< relative column widths

    header: Header @4 //< table header, each is column header (each a list of blocks)

    rows: [Row] @5 //< rows, a list of row
}

/// Generic block container with attributes
type Division {
    attribute: Attribute @1
    
    content: [Block] @2
}

type Blocks = [Block]
