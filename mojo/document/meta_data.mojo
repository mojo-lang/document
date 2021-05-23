///
/// Metadata for the document: title, authors, date.
///
type MetaData = {String: MetaDataValue}

///
///
///
type MetaDataValue = {String: MetaDataValue} @1
                   | [MetaDataValue] @2
                   | Bool            @3
                   | String          @4
                   | DateTime        @10
                   | [Inline]        @14
                   | [Block]         @15

///
/// Extract document title from `MetaData`
///
//func docTitle(meta:MetaData) -> [Inline]

///
/// Extract document authors from `MetaData`
///
//func docAuthors(meta:MetaData) -> [[Inline]]

///
/// Extract date from `MetaData`
///
//func docDate(meta:MetaData) -> [Inline]
