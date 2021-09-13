package document

func NewPainBlockFrom(inlines ...*Inline) *Block {
	return &Block{Block: &Block_Plain{Plain: &Plain{Inlines: inlines}}}
}

func NewPainBlock(plain *Plain) *Block {
	return &Block{Block: &Block_Plain{Plain: plain}}
}

func NewHeaderBlock(header *Header) *Block {
	return &Block{Block: &Block_Header{Header: header}}
}

func NewBlockQuoteBlock(blockQuote *BlockQuote) *Block {
	return &Block{Block: &Block_BlockQuote{BlockQuote: blockQuote}}
}

func NewCodeBlockBlock(block *CodeBlock) *Block {
	return &Block{Block: &Block_CodeBlock{CodeBlock: block}}
}

func NewOrderedListBlock(block *OrderedList) *Block {
	return &Block{Block: &Block_OrderedList{OrderedList: block}}
}

func NewBulletListBlock(block *BulletList) *Block {
	return &Block{Block: &Block_BulletList{BulletList: block}}
}

func NewParagraphBlock(paragraph *Paragraph) *Block {
	return &Block{Block: &Block_Paragraph{Paragraph: paragraph}}
}

func NewLineBlockBlock(block *LineBlock) *Block {
	return &Block{Block: &Block_LineBlock{LineBlock: block}}
}

func NewDivisionBlock(division *Division) *Block {
	return &Block{Block: &Block_Division{Division: division}}
}

func NewTableBlock(table *Table) *Block {
	return &Block{Block: &Block_Table{Table: table}}
}

func NewTextPlainBlock(text string) *Block {
	return NewPainBlockFrom(NewTextInlineFrom(text))
}
