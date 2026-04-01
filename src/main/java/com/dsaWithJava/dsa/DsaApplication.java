package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.linearSearch.LinearSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

//		int[] ary = {10,5,45,2,8,2,45,65,878,213};
		int[] ary = {};
		int target = 11;

		boolean indexAt = LinearSearch.linearSearch(ary,target);
		System.out.println("Have you Found the Val: "+indexAt);
	}

}
