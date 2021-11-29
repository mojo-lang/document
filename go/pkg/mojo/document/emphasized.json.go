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
	jsoniter.RegisterTypeDecoder("document.Emphasized", &EmphasizedCodec{})
	jsoniter.RegisterTypeEncoder("document.Emphasized", &EmphasizedCodec{})
}

type EmphasizedCodec struct {
}

func (codec *EmphasizedCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	emphasized := (*Emphasized)(ptr)
	if any.ValueType() == jsoniter.ArrayValue {
		any.ToVal(&emphasized.Vals)
	}
}

func (codec *EmphasizedCodec) IsEmpty(ptr unsafe.Pointer) bool {
	emphasized := (*Emphasized)(ptr)
	return emphasized == nil || len(emphasized.Vals) == 0
}

func (codec *EmphasizedCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	emphasized := (*Emphasized)(ptr)

	stream.WriteArrayStart()
	for i, v := range emphasized.Vals {
		if i > 0 {
			stream.WriteMore()
		}
		stream.WriteVal(v)
	}
	stream.WriteArrayEnd()
}
