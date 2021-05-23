///
/// data structure for format-neutral representation of documents.
///
type Document {
    ///
    meta_data: MetaData @1
    
    ///
    blocks: [Block] @2
}
