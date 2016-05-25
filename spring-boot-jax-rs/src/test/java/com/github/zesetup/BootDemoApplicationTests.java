package com.github.zesetup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.zesetup.bootjaxrs.BootDemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootDemoApplication.class)
@WebAppConfiguration
public class BootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
