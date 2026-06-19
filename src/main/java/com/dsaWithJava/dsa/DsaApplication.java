package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.linear_binary_search_05.binarySearch.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		BinarySearch l1 = new BinarySearch();

		System.out.println(l1.searchItemInOrderAgonist());
	}

}
