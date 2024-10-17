package com.demo.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class TestBufferReader {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader (new FileReader("test1.txt"));){
			String s=br.readLine();
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
