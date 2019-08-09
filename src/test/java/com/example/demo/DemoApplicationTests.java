package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	private int value1,value2;
	
	protected void setup() {
		value1 = 3;
		value2 = 3;
	}
	
	@Test
	public void contextLoads() {
		int resoult = value1+value2;
		System.out.println(resoult);
		assertFalse(resoult==1);
}
}
