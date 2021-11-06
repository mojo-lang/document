package document

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestInline_SetText(t *testing.T) {
	foo := NewTextInline(NewText("")).SetText("foo")
	assert.Equal(t, "foo", foo.GetText().Value)
}