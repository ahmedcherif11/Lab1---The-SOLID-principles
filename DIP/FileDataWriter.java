// FileWriter Implementation
package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileDataWriter implements Writer {
    private final String filePath;

    public FileDataWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        }
   
 }
}
