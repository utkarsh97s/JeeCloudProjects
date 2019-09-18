package com.cg.junit5basics.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.junit5basics.service.CalculatorService;
import com.cg.junit5basics.service.CalculatorServiceImpl;


import org.junit.jupiter.api.Test;

class EmployeeTest {
	CalculatorService service;
	@BeforeEach
	public void beforeTest() {
		service= new CalculatorServiceImpl();
	}
	@Test
	void test() {
		
	}

}
