package document

import "github.com/mojo-lang/core/go/pkg/mojo/core"

func NewAttribute() *Attribute {
	return &Attribute{
		Properties: make(map[string]*core.Value),
	}
}

func (m *Attribute) HasProperty(key string) bool {
	return m != nil && m.Properties != nil && m.Properties[key] != nil
}

func (m *Attribute) GetStringProperty(key string) (string, error) {
	if m != nil && m.Properties != nil {
		if v, ok := m.Properties[key]; ok {
			return v.GetString(), nil
		}
	}
	return "", &core.NotFoundError{}
}

func (m *Attribute) GetIntProperty(key string) (int64, error) {
	if m != nil && m.Properties != nil {
		if v, ok := m.Properties[key]; ok {
			return v.GetInt64(), nil
		}
	}
	return 0, &core.NotFoundError{}
}

func (m *Attribute) GetBoolProperty(key string) (bool, error) {
	if m != nil && m.Properties != nil {
		if v, ok := m.Properties[key]; ok {
			return v.GetBool(), nil
		}
	}
	return false, &core.NotFoundError{}
}

func (m *Attribute) SetStringProperty(key string, value string) *Attribute {
	if m != nil {
		if m.Properties == nil {
			m.Properties = make(map[string]*core.Value)
		}
		m.Properties[key] = core.NewStringValue(value)
	}
	return m
}

func (m *Attribute) SetIntProperty(key string, value int64) *Attribute {
	if m != nil {
		if m.Properties == nil {
			m.Properties = make(map[string]*core.Value)
		}
		m.Properties[key] = core.NewInt64Value(value)
	}
	return m
}

func (m *Attribute) SetBoolProperty(key string, value bool) *Attribute {
	if m != nil {
		if m.Properties == nil {
			m.Properties = make(map[string]*core.Value)
		}
		m.Properties[key] = core.NewBoolValue(value)
	}
	return m
}
