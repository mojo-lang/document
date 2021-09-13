package document

func (m *Document) AppendBlock(block *Block) {
	if m != nil {
		m.Blocks = append(m.Blocks, block)
	}
}

func (m *Document) AppendBlocks(blocks ...*Block) {
	if m != nil {
		m.Blocks = append(m.Blocks, blocks...)
	}
}

func (m *Document) AppendPain(plain *Plain) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewPainBlock(plain))
	}
}

func (m *Document) AppendHeader(header *Header) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewHeaderBlock(header))
	}
}

func (m *Document) AppendHeaderFrom(level int64, header string) {
	m.AppendHeader(&Header{
		Level: level,
		Text:  []*Inline{NewTextInlineFrom(header)},
	})
}

func (m *Document) AppendBlockQuote(blockQuote *BlockQuote) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewBlockQuoteBlock(blockQuote))
	}
}

func (m *Document) AppendCodeBlock(codeBlock *CodeBlock) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewCodeBlockBlock(codeBlock))
	}
}

func (m *Document) AppendOrderedList(list *OrderedList) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewOrderedListBlock(list))
	}
}

func (m *Document) AppendBulletList(list *BulletList) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewBulletListBlock(list))
	}
}

func (m *Document) AppendParagraph(paragraph *Paragraph) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewParagraphBlock(paragraph))
	}
}

func (m *Document) AppendLineBlock(lineBlock *LineBlock) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewLineBlockBlock(lineBlock))
	}
}

func (m *Document) AppendDivision(division *Division) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewDivisionBlock(division))
	}
}

func (m *Document) AppendTable(table *Table) {
	if m != nil {
		m.Blocks = append(m.Blocks, NewTableBlock(table))
	}
}
