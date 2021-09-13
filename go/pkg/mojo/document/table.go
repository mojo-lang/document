package document

func NewTextCell(text string) *Table_Cell {
	return &Table_Cell{Values: []*Block{NewTextPlainBlock(text)}}
}
