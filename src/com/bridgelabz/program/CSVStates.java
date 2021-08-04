package com.bridgelabz.program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.exceptions.CustomizedExceptions;
import com.fileoperations.FileReaderWriter;
public class CSVStates {
    public static void main(String[] args) {
        String filePath =  "C:\\Users\\admin\\Downloads\\india-districts-census.csv";
        CSVStates csvStates = new CSVStates();
    }
   
    public int getNumberOfRecords(String filePath) throws CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        int count = fileReaderWriter.getTotalRecords(filePath);

        return count;
    }

    public boolean delimiterChecker(String filePath) throws CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        boolean flag = fileReaderWriter.checkDelimiter(filePath);
        return flag;
    }

   
    public  boolean csvHeaderChecker(String filePath) throws IOException, CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();

        // To compare actual CSV Headers with the headers in list
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("SrNo","State","Name","TIN","code"));
        boolean flag = fileReaderWriter.checkCSVHeader(filePath, stringArrayList);
        return flag;
    }

}