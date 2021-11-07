package document

func NewTableCell(blocks... *Block) *Table_Cell {
	return &Table_Cell{Values: blocks}
}

func NewTextTableCell(text string) *Table_Cell {
	return &Table_Cell{Values: []*Block{NewTextPlainBlock(text)}}
}
