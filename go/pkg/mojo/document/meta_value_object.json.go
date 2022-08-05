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
	"unsafe"

	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

func init() {
	core.RegisterJSONTypeDecoder("document.MetaValueObject", &MetaValueObjectCodec{})
	core.RegisterJSONTypeEncoder("document.MetaValueObject", &MetaValueObjectCodec{})
}

type MetaValueObjectCodec struct {
}

func (codec *MetaValueObjectCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	metaValueObject := (*MetaValueObject)(ptr)
	if any.ValueType() == jsoniter.ObjectValue {
		any.ToVal(&metaValueObject.Vals)
	}
}

func (codec *MetaValueObjectCodec) IsEmpty(ptr unsafe.Pointer) bool {
	metaValueObject := (*MetaValueObject)(ptr)
	return metaValueObject == nil || len(metaValueObject.Vals) == 0
}

func (codec *MetaValueObjectCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	metaValueObject := (*MetaValueObject)(ptr)
	stream.WriteVal(metaValueObject.Vals)
}
