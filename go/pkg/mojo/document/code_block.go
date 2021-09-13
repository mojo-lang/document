package document

import (
	"bytes"
	"strings"
)

func NewCodeBlock(lang string, lines ...string) *CodeBlock {
	codeBlock := &CodeBlock{Language: lang}
	for _, line := range lines {
		ls := strings.Split(line, "\n")
		for _, l := range ls {
			codeBlock.Lines = append(codeBlock.Lines, &Line{
				Values: []*Inline{NewTextInlineFrom(l)},
			})
		}
	}
	return codeBlock
}

func (m *CodeBlock) AppendLine(line string) {
	if m != nil {
		ls := strings.Split(line, "\n")
		for _, l := range ls {
			m.Lines = append(m.Lines, &Line{
				Values: []*Inline{NewTextInlineFrom(l)},
			})
		}
	}
}

func (m *CodeBlock) GetCode() []byte {
	if m == nil {
		return []byte{}
	}

	buffer := bytes.Buffer{}
	for _, line := range m.Lines {
		for _, inline := range line.Values {
			if text := inline.GetText(); text != nil {
				buffer.WriteString(text.Value)
			}
		}
	}

	return buffer.Bytes()
}
