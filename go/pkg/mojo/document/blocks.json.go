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
	jsoniter.RegisterTypeDecoder("document.Blocks", &BlocksCodec{})
	jsoniter.RegisterTypeEncoder("document.Blocks", &BlocksCodec{})
}

type BlocksCodec struct {
}

func (codec *BlocksCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	blocks := (*Blocks)(ptr)
	if any.ValueType() == jsoniter.ArrayValue {
		any.ToVal(&blocks.Vals)
	}
}

func (codec *BlocksCodec) IsEmpty(ptr unsafe.Pointer) bool {
	blocks := (*Blocks)(ptr)
	return blocks == nil || len(blocks.Vals) == 0
}

func (codec *BlocksCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	blocks := (*Blocks)(ptr)

	stream.WriteArrayStart()
	for i, v := range blocks.Vals {
		if i > 0 {
			stream.WriteMore()
		}
		stream.WriteVal(v)
	}
	stream.WriteArrayEnd()
}
