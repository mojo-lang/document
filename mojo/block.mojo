/// Block element
type Block = Plain |
             Paragraph |
             LineBlock |
             CodeBlock |
             BlockQuote |
             OrderedList |
             BulletList |
             DefinitionList |
             Header |
             Table |
             Div |
             Null

/// Plain text, not a paragraph
type Plain : [Inline] {}

/// Paragraph
type Paragraph : [Inline] {}

/// Multiple non-breaking lines
type LineBlock : [[Inline]] {}

type CodeBlock {
    attribute: Attribute
    code: String
}

type BlockQuote : [Block] {}

/// Style of list numbers.
enum ListNumberStyle {
    Default
    Example
    Decimal
    LowerRoman
    UpperRoman
    LowerAlpha
    UpperAlpha
}

enum ListNumberDelimiter {
    Default
    Period
    OneParent
    TwoParents
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
type BulletList : [[Block]]

/// 
type DefinitionItem {
    term: [Inline]
    definitions: [[Block]]
}

/// Definition list Each list item is a pair consisting of a term (a list of inlines)
/// and one or more definitions (each a list of blocks)
type DefinitionList : [DefinitionItem]

type Header {
    level : Int
    attribute: Attribute
    text : [Inline]
}

/// Table cells are list of Blocks
type TableCell = [Block]

/// Alignment of a table column.
enum Alignment {
    AlignDefault
    AlignLeft
    AlignRight
    AlignCenter
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
type Div {
    attribute Attribute
    content: [Block]
}