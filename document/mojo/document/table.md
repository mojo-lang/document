| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `caption` | `Array<mojo.document.Inline>` |  | 否 |  | caption for table |
| `alignment` | `string` |  | 否 |  | column alignments (required) |
| `width` | `number` | `float64` | 否 |  | relative column widths |
| `header` | `Array<Array<mojo.document.Block>>` |  | 否 |  | table header, each is column header (each a list of blocks) |
| `rows` | `Array<Array<Array<mojo.document.Block>>>` |  | 否 |  | rows, a list of row |
