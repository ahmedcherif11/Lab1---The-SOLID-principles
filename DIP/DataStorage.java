// DataStorage Interface
package com.directi.training.dip.exercise;

public interface DataStorage {
    void save(String data);
}

// Concrete Database implementation
package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class DatabaseStorage implements DataStorage {
    private final Map<Integer, String> _data = new HashMap<>();
    private int _count = 0;

    @Override
    public void save(String data) {
        _data.put(++_count, data);
        System.out.println("Data saved to database: " + data);
    }
}