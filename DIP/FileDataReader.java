// FileReader Implementation
package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileDataReader implements Reader {
    private final String filePath;

    public FileDataReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws Exception {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}