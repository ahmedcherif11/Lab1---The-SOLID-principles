package com.directi.training.dip.exercise;

import java.util.Base64;

public class EncodingModule {
    private final Reader reader;
    private final Writer writer;
    private final DataStorage dataStorage;

    public EncodingModule(Reader reader, Writer writer, DataStorage dataStorage) {
        this.reader = reader;
        this.writer = writer;
        this.dataStorage = dataStorage;
    }

    public void encode() throws Exception {
        String input = reader.read();
        String encodedData = Base64.getEncoder().encodeToString(input.getBytes());
        if (writer != null) {
            writer.write(encodedData);
        }
        if (dataStorage != null) {
            dataStorage.save(encodedData);
        }
    }
}