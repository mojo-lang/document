package document

func NewTextInlineFrom(value string) *Inline {
	return &Inline{Inline: &Inline_Text{Text: &Text{Value: value}}}
}

func NewTextInline(text *Text) *Inline {
	return &Inline{Inline: &Inline_Text{Text: text}}
}

func NewCodeInline(code *Code) *Inline {
	return &Inline{Inline: &Inline_Code{Code: code}}
}

func NewLinkInline(link *Link) *Inline {
	return &Inline{Inline: &Inline_Link{Link: link}}
}

func NewImageInline(image *Image) *Inline {
	return &Inline{Inline: &Inline_Image{Image: image}}
}

func NewEmphasizedInline(emphasized *Emphasized) *Inline {
	return &Inline{Inline: &Inline_Emphasized{Emphasized: emphasized}}
}

func NewStrongInline(strong *Strong) *Inline {
	return &Inline{Inline: &Inline_Strong{Strong: strong}}
}