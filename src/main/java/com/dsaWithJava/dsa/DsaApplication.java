package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.linearSearch.LinearSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		int[][] ary = {{0,45}, {45,4,8,80}, {10,45,4,8,80}};
		char target = 10;

		boolean indexAt = LinearSearch.linearSearch2DAry(ary, target);
		System.out.println("Have you Found the Val: "+indexAt);
	}

}
