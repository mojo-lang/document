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
	jsoniter.RegisterTypeDecoder("document.Table_Cell", &TableCellCodec{})
	jsoniter.RegisterTypeEncoder("document.Table_Cell", &TableCellCodec{})
}

type TableCellCodec struct {
}

func (codec *TableCellCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	cell := (*Table_Cell)(ptr)
	if any.ValueType() == jsoniter.ArrayValue {
		any.ToVal(&cell.Values)
	}
}

func (codec *TableCellCodec) IsEmpty(ptr unsafe.Pointer) bool {
	cell := (*Table_Cell)(ptr)
	return cell == nil || len(cell.Values) == 0
}

func (codec *TableCellCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	cell := (*Table_Cell)(ptr)

	stream.WriteArrayStart()
	for i, v := range cell.Values {
		if i > 0 {
			stream.WriteMore()
		}
		stream.WriteVal(v)
	}
	stream.WriteArrayEnd()
}
