package com.company;
import java.io.IOException;
public class task4 {
    public static void main(String[] args) throws IOException {
        DataManagement dm = new DataManagement();
        dm.ReadData();
        dm.ReadDataFromFile();
        dm.WriteDataToFile();
        System.out.println("_____");
        dm.ReadDataFromFile();
    }
}
