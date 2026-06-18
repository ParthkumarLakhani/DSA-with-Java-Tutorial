package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.linear_binary_search_05.linearSearch.LinearSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		LinearSearch l1 = new LinearSearch();
		l1.richestCustomer();
	}

}
