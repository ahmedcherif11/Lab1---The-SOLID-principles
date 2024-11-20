package com.directi.training.dip.exercise;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        // File-to-File Encoding
        Reader fileReader = new FileDataReader("beforeEncryption.txt");
        Writer fileWriter = new FileDataWriter("afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter, null);
        fileEncodingModule.encode();

        // Network-to-Database Encoding
        Reader networkReader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        DataStorage databaseStorage = new DatabaseStorage();
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, null, databaseStorage);
        networkEncodingModule.encode();
    }
}