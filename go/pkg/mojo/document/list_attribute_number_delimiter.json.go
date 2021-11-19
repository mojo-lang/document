// Code generated by mojo. DO NOT EDIT.
// Rerunning mojo will overwrite this file.
//
// Copyright 2021 Mojo-lang.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package document

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("document.ListAttribute_NumberDelimiter", &ListAttributeNumberDelimiterCodec{})
	jsoniter.RegisterTypeEncoder("document.ListAttribute_NumberDelimiter", &ListAttributeNumberDelimiterCodec{})
}

type ListAttributeNumberDelimiterCodec struct {
}

func (codec *ListAttributeNumberDelimiterCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	e := (*ListAttribute_NumberDelimiter)(ptr)
	if any.ValueType() == jsoniter.StringValue {
		e.Parse(any.ToString())
	} else if any.ValueType() == jsoniter.NumberValue {
		value := any.ToInt32()
		if _, ok := ListAttributeNumberDelimiterNames[value]; ok {
			*e = ListAttribute_NumberDelimiter(value)
		}
	}
}

func (codec *ListAttributeNumberDelimiterCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	e := (*ListAttribute_NumberDelimiter)(ptr)
	stream.WriteString(e.Format())
}

func (codec *ListAttributeNumberDelimiterCodec) IsEmpty(ptr unsafe.Pointer) bool {
	e := (*ListAttribute_NumberDelimiter)(ptr)
	return e == nil || *e == 0
}
