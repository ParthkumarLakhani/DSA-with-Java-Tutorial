package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.linearSearch.LinearSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		int[] ary = {10,45,4,8,8,4,12,20,56,89,78,100};
		char target = 100;

		int startIndex = 4;
		int endIndex = 6;

		boolean indexAt = LinearSearch.linearSearchRange(ary,target, startIndex, endIndex);
		System.out.println("Have you Found the Val: "+indexAt);
	}

}
