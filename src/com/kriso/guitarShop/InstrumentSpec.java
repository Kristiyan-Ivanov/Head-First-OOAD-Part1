package com.kriso.guitarShop;

import com.kriso.guitarShop.enums.Builder;
import com.kriso.guitarShop.enums.Type;
import com.kriso.guitarShop.enums.Wood;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class InstrumentSpec {
    private Map<String, Object> properties;

    public InstrumentSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap<String, Object>(properties);
        }

    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext(); ) {
            String propertyName = (String) i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }
}
