package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.binarySearch.BinarySearch;
import com.dsaWithJava.dsa.linearSearch.LinearSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);



		int[] ary = { 1,11,22,23,55,66,77,88,99,100 };
		char target = 10;

		boolean indexAt = BinarySearch.binarySearchInt(ary, target);
		System.out.println("Have you Found the Val: "+indexAt);
	}

}
