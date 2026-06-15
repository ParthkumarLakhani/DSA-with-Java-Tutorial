package com.dsaWithJava.dsa;

import com.dsaWithJava.dsa.passby_val_ref_03.Scopes;
import com.dsaWithJava.dsa.passby_val_ref_03.Shadow;
import com.dsaWithJava.dsa.passby_val_ref_03.VarAgrs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {


	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		VarAgrs v1 = new VarAgrs();
		v1.multipleVarArgs(2,5,"hello", "stirng");

	}

}
