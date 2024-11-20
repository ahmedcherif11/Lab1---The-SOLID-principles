// Reader Interface
package com.directi.training.dip.exercise;

public interface Reader {
    String read() throws Exception;
}

// Writer Interface
package com.directi.training.dip.exercise;

public interface Writer {
    void write(String data) throws Exception;
}