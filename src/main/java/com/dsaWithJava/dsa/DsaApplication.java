package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.linear_binary_search_05.BinaryProblems.BinaryProblems;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		BinaryProblems l1 = new BinaryProblems();

		System.out.println(l1.elementPosition());
	}

}
