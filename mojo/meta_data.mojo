///
/// Metadata for the document: title, authors, date.
///
type MetaData = {String, MetaDataValue}

///
///
///
type MetaDataValue = {String, MetaDataValue} | [MetaDataValue] | Bool | String | [Inline] | [Block]

///
/// Extract document title from `MetaData`
///
func docTitle(meta:MetaData) -> [Inline]

///
/// Extract document authors from `MetaData`
///
func docAuthors(meta:MetaData) -> [[Inline]]

///
/// Extract date from `MetaData`
///
func docDate(meta:MetaData) -> [Inline]
