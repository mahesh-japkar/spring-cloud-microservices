package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.DummyServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DummyServiceApplication.class)
@WebAppConfiguration
public class DummyServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
