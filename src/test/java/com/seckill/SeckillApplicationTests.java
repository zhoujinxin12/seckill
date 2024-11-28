package com.seckill;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.seckill.utils.MD5Util.*;

@SpringBootTest
class SeckillApplicationTests {

	@Test
	void testMD5() {
		// ce21b747de5af71ab5c2e20ff0a60eea
		System.out.println(inputPassToFromPass("123456"));
		System.out.println(fromPassToDBPass("ce21b747de5af71ab5c2e20ff0a60eea", "1a2b3c4d"));
		System.out.println(inputPassToDBPass("123456", "1a2b3c4d"));
	}

}
