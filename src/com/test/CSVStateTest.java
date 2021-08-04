package com.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.program.CSVStates;
import com.exceptions.CustomizedExceptions;

public class CSVStateTest {
	CSVStates id = new CSVStates();

	@Test
	public void givenTheStateCensusCSVFileEnsuresNumberOfRecordsMatches() throws CustomizedExceptions {
		
		String filePath = "C:\\Users\\admin\\Downloads\\india-districts-census.csv";
		int result = id.getNumberOfRecords(filePath);
		Assert.assertEquals(38, result);
	}

	
	 @Test
	    public void givenStateCensusCSVFileIfIncorrectReturnsCustomException() {
	        //File Name is Incorrect
	        String filePath ="C:\\Users\\admin\\Downloads\\india-districts-cenus.csv";
	        try {
	            int result = id.getNumberOfRecords(filePath);
	            Assert.assertEquals(38, result);
	        } catch (CustomizedExceptions exceptions) {
	            exceptions.printStackTrace();
	        }
	    }
	 
	    
	    @Test
	    public void givenStateCensusCSVFileWhenCorrectButTypeIncorrectReturnsCustomExceptions() {
	        //File Type is different (.pdf)
	        String filePath = "C:\\Users\\admin\\Desktop\\Eclipse data\\Indian States Censius Analayzer\\src\\files\\StateCode.pdf";

	        try {
	            int result = id.getNumberOfRecords(filePath);

	            Assert.assertEquals(38, result);
	        } catch (CustomizedExceptions exceptions) {
	            exceptions.printStackTrace();
	        }

	    }
	    
	    @Test
	    public void givenTheStateCensusCSVFileWhenCorrectButDelimeterIncorrectReturnsCustomizedExceptions() {
	        String filePath = "C:\\Users\\admin\\Desktop\\Eclipse data\\Indian States Censius Analayzer\\src\\files\\StateCode.csv";
	        try {
	            boolean result = id.delimiterChecker(filePath);
	            Assert.assertEquals(false, result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	    @Test
	    public void givenTheStateCensusCSVFileWhenCorrectButCSVHeaderIncorrectReturnsCustomException() {
	        String filePath = "C:\\Users\\admin\\Desktop\\Eclipse data\\Indian States Censius Analayzer\\src\\files\\StateCode.csv";
	        try {
	            boolean result = id.csvHeaderChecker(filePath);
	            Assert.assertEquals(false, result);
	        } catch (IOException | CustomizedExceptions e) {
	            e.printStackTrace();
	        }
	    }
}
