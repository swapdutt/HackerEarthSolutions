package com.hackerearth.ds.array1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryQueries {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Taking input from the system

		String[] token = br.readLine().split(" "); // Splitting the input taken from system and storing it in string array 
		int a = Integer.parseInt(token[0]); 
		int b = Integer.parseInt(token[1]);
		String[] str = br.readLine().split(" ");

		while (b --> 0) {
			String[] query = br.readLine().split(" ");
			if (query[0].equals("0")) {
				System.out.println(str[Integer.parseInt(query[2]) - 1].equals("1") ? "ODD" : "EVEN");
			} else {
				str[Integer.parseInt(query[1]) - 1] = str[Integer.parseInt(query[1]) - 1].equals("1") ? "0" : "1";
			}
		}
	}
}
