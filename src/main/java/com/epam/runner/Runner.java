package com.epam.runner;

import java.io.File;
import java.util.ArrayList;

import com.epam.analyzers.FileAnalyzer;
import com.epam.result.CaseResult;

public class Runner {
	
	public static void main(String[] args) {
        System.out.println("Start");
        
        File directory = new File("./src/test/resources");
        
        File[] fList = directory.listFiles();
        
        ArrayList<CaseResult> listOfCaseResults = new ArrayList<CaseResult>();
        
        for (File file : fList) {
        	if (file.isFile()) {
        		System.out.println(String.format("Analyzing file '%s'", file.getName()));
        		listOfCaseResults.add(new FileAnalyzer().getStatus(file));
        	}
        }
        
        for (CaseResult caseResult : listOfCaseResults) {
        	System.out.println(caseResult.toString());
        }
        
		System.out.println("Finish");
    }

}