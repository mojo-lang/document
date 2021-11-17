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
	"strconv"
)

var ListAttributeNumberDelimiterNames = map[int32]string{
	1: "period",
	2: "one-parent",
	3: "two-parents",
}

var ListAttributeNumberDelimiterValues = map[string]ListAttribute_NumberDelimiter{
	"period":      ListAttribute_NUMBER_DELIMITER_PERIOD,
	"one-parent":  ListAttribute_NUMBER_DELIMITER_ONE_PARENT,
	"two-parents": ListAttribute_NUMBER_DELIMITER_TWO_PARENTS,
}

func (x ListAttribute_NumberDelimiter) Format() string {
	s, ok := ListAttributeNumberDelimiterNames[int32(x)]
	if ok {
		return s
	}
	if int(x) == 0 {
		return "unspecified"
	}
	return strconv.Itoa(int(x))
}

func (x *ListAttribute_NumberDelimiter) Parse(value string) {
	if x != nil {
		s, ok := ListAttributeNumberDelimiterValues[value]
		if ok {
			*x = s
		} else {
			*x = ListAttribute_NUMBER_DELIMITER_PERIOD
		}
	} else {
		*x = ListAttribute_NUMBER_DELIMITER_PERIOD
	}
}
