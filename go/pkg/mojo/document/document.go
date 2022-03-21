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

func (m *Document) AppendPain(inlines ...*Inline) {
    if m != nil {
        m.Blocks = append(m.Blocks, NewPainBlock(inlines...))
    }
}

func (m *Document) AppendHeader(header *Header) {
    if m != nil {
        m.Blocks = append(m.Blocks, NewHeaderBlock(header))
    }
}

func (m *Document) AppendHeaderFrom(level int64, inlines ...*Inline) {
    m.AppendHeader(&Header{
        Level: level,
        Text:  inlines,
    })
}

func (m *Document) AppendHeaderFromText(level int64, header string) {
    m.AppendHeader(&Header{
        Level: level,
        Text:  []*Inline{NewTextInline(header)},
    })
}

func (m *Document) AppendBlockQuote(blocks ...*Block) {
    if m != nil {
        m.Blocks = append(m.Blocks, NewQuoteBlockBlock(blocks...))
    }
}

func (m *Document) AppendCodeBlock(codeBlock *CodeBlock) {
    if m != nil {
        m.Blocks = append(m.Blocks, NewCodeBlockBlock(codeBlock))
    }
}

func (m *Document) AppendCodeBlockFrom(lang string, lines ...string) {
    m.AppendCodeBlock(NewCodeBlock(lang, lines...))
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

func (m *Document) AppendParagraph(inlines ...*Inline) {
    if m != nil {
        m.Blocks = append(m.Blocks, NewParagraphBlock(inlines...))
    }
}

func (m *Document) AppendLineBlock(lines ...*Line) {
    if m != nil {
        m.Blocks = append(m.Blocks, NewLineBlockBlock(lines...))
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
