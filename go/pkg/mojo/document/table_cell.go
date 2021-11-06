package document

func NewTextTableCell(text string) *Table_Cell {
	return &Table_Cell{Values: []*Block{NewTextPlainBlock(text)}}
}

