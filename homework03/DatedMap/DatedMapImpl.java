package homework03.DatedMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DatedMapImpl implements DatedMap {
    private Map<String, String> keyAndValue;
    private Map<String, Date> keyAndDateTime;

    public DatedMapImpl() {
        this.keyAndValue = new HashMap<>();
        this.keyAndDateTime = new HashMap<>();
    }

    @Override
    public void put(String key, String value) {
        this.keyAndValue.put(key, value);
        this.keyAndDateTime.put(key, new Date());
    }

    @Override
    public String get(String key) {
        return keyAndValue.get(key);
    }

    @Override
    public boolean containsKey(String key) {
        return keyAndValue.containsKey(key);
    }

    @Override
    public void remove(String key) {
        keyAndValue.remove(key);
        keyAndDateTime.remove(key);
    }

    @Override
    public Set<String> keySet() {
        return keyAndValue.keySet();
    }

    @Override
    public Date getKeyLastInsertionDate(String key) {
        return keyAndDateTime.get(key);
    }

    @Override
    public String toString() {
        return this.keyAndValue.toString();
    }
}
