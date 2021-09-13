package document

func (m *Attribute) HasProperty(key string) bool {
	return m != nil && m.Properties[key] != nil
}

func (m *Attribute) GetStringProperty(key string) string {
	if m != nil {
		return m.Properties[key].GetString()
	}
	return ""
}

func (m *Attribute) GetIntProperty(key string) int {
	if m != nil {
		return m.Properties[key].GetInt()
	}
	return 0
}

func (m *Attribute) GetBoolProperty(key string) bool {
	if m != nil {
		return m.Properties[key].GetBool()
	}
	return false
}