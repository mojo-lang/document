package document

func NewTextTableHeader(texts... string) *Table_Header {
	header := &Table_Header{}
	for _, text := range texts {
		header.Values = append(header.Values, NewTextTableCell(text))
	}
	return header
}
