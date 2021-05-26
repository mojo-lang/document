///
/// Metadata for the document: title, authors, date.
///
type MetaData: {String: MetaValue}

///
///
///
type MetaValueObject : {String: MetaValue }
type MetaValues = [MetaValue] 
type MetaValue = MetaValueObject @1
                   | MetaValues  @2
                   | Bool            @3
                   | String          @4
                   | DateTime        @10
                   | Inlines     @14
                   | Blocks      @15

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
