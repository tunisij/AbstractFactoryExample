package com.tunisij.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tunisij.factory.AbstractComponentFactory;
import com.tunisij.factory.Word00Factory;
import com.tunisij.factory.Word10Factory;
import com.tunisij.factory.Word18Factory;
import com.tunisij.factory.Word90Factory;

public class TestSuite {
	
	public static final String WORD_90 = "Word90";
	public static final String WORD_00 = "Word00";
	public static final String WORD_10 = "Word10";
	public static final String WORD_18 = "Word18";
	
	public List<String> getTestFromConfigFile(String testFilename) {
		List<String> tests = new ArrayList<>();
		File file = new File("src/com/tunisij/resources/" + testFilename);
		String line;
		
		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
			while ((line = br.readLine()) != null) {
				tests.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return tests;
	}
	
	public void runTest(AbstractComponentFactory factory) {
		if (factory == null) {
			return;
		}
		
		factory.testButton();
		factory.testPanel();
		factory.testTextBox();
	}
	
	public void runTest(List<String> testList) {
		for (String test : testList) {
			if (WORD_90.equals(test)) {
				runTest(Word90Factory.getFactory());
			} else if (WORD_00.equals(test)) {
				runTest(Word00Factory.getFactory());
			} else if (WORD_10.equals(test)) {
				runTest(Word10Factory.getFactory());
			} else if (WORD_18.equals(test)) {
				runTest(Word18Factory.getFactory());
			}
		}
	}
	
	public static void main(String[] args) {
		TestSuite ts = new TestSuite();
		List<String> test = ts.getTestFromConfigFile("test1.txt");
		ts.runTest(test);
	}
}
