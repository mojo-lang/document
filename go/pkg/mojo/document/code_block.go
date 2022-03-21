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
                Vals: []*Inline{NewTextInline(l)},
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
                Vals: []*Inline{NewTextInline(l)},
            })
        }
    }
}

func (m *CodeBlock) GetCode() []byte {
    if m == nil {
        return []byte{}
    }

    buffer := bytes.Buffer{}
    for i, line := range m.Lines {
        if i > 0 {
            buffer.WriteByte('\n')
        }

        for _, inline := range line.Vals {
            if text := inline.GetText(); text != nil {
                buffer.WriteString(text.Val)
            }
        }
    }

    return buffer.Bytes()
}
