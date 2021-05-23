///
/// Attributes: identifier, classes, key-value pairs
///
type Attribute {
    ///
    identifier: String @1
    
    ///
    classes: [String] @2
    
    ///
    properties: {String: Value} @3
}
