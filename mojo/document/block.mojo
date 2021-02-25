/// Block element
type Block = Plain
           | Paragraph
           | LineBlock
           | CodeBlock
           | BlockQuote
           | OrderedList
           | BulletList
           | DefinitionList
           | Header
           | Table
           | Division
           | Null

/// Plain text, not a paragraph
type Plain : [Inline]

/// Paragraph
type Paragraph : [Inline]

/// Multiple non-breaking lines
type LineBlock : [[Inline]]

type CodeBlock {
    attribute: Attribute
    code: String
}

type BlockQuote = [Block]

/// Style of list numbers.
@transform_hyphen
enum ListNumberStyle {
    unspecified
    example
    decimal
    lower_roman //@alias('lower-roman')
    upper_roman //@alias('upper-roman')
    lower_alpha //@alias('lower-alpha')
    upper_alpha //@alias('upper-alpha')
}

@transform_hyphen
enum ListNumberDelimiter {
    unspecified
    period
    one_parent @alias('one-parent')
    two_parents @alias('two-parent')
}

/// List attributes.
type ListAttribute {
    begin_number: Int
    number_style: ListNumberStyle
    number_delimiter: ListNumberDelimiter
}

/// 
type OrderedList {
    attribute: ListAttribute
    items: [[Block]]
}

/// Bullet list (list of items, each a list of blocks)
type BulletList = [[Block]]

/// 
type DefinitionItem {
    term: [Inline]
    definitions: [[Block]]
}

/// Definition list Each list item is a pair consisting of a term (a list of inlines)
/// and one or more definitions (each a list of blocks)
type DefinitionList = [DefinitionItem]

type Header {
    level : Int
    attribute: Attribute
    text : [Inline]
}

/// Table cells are list of Blocks
type TableCell = [Block]

/// Alignment of a table column.
enum Alignment {
    unspecified
    left
    right
    center
}

///
type Table {
    caption: [Inline] //< caption for table

    alignment: Alignment //< column alignments (required)

    width: Double = 0 //< relative column widths

    headers: [TableCell] //< column headers (each a list of blocks)

    rows: [[TableCell]] //< rows, each a list of lists of blocks
}

/// Generic block container with attributes
type Division {
    attribute: Attribute
    content: [Block]
}