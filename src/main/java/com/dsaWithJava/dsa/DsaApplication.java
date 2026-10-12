package com.dsaWithJava.dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		String[] ary = {"c","f","j"};
		char target = 'f';

		DsaApplication dsa = new DsaApplication();
		System.out.println(dsa.smallestLetter(ary,target));

	}

	public String smallestLetter(String[] ary, char target){

		int aryLength = ary.length - 1;
		int start = 0;
		int end = aryLength;

		while(start<=end){
			int mid = start + ( end - start ) / 2;

			if (target < ary[mid].charAt(0)){
				end = mid - 1;
			} else  {
				start = mid + 1;
			}
		}

		return ary[start%ary.length];
	}



}
