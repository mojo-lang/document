// Code generated by wand. DO NOT EDIT.
// Rerunning wand will overwrite this file.
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
	jsoniter.RegisterTypeDecoder("document.Table_Row", &TableRowCodec{})
	jsoniter.RegisterTypeEncoder("document.Table_Row", &TableRowCodec{})
}

type TableRowCodec struct {
}

func (codec *TableRowCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	row := (*Table_Row)(ptr)
	if any.ValueType() == jsoniter.ArrayValue {
		any.ToVal(&row.Values)
	}
}

func (codec *TableRowCodec) IsEmpty(ptr unsafe.Pointer) bool {
	row := (*Table_Row)(ptr)
	return row == nil || len(row.Values) == 0
}

func (codec *TableRowCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	row := (*Table_Row)(ptr)

	stream.WriteArrayStart()
	for i, v := range row.Values {
		if i > 0 {
			stream.WriteMore()
		}
		stream.WriteVal(v)
	}
	stream.WriteArrayEnd()
}