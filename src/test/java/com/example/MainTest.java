package com.example;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;


class MainTest extends Main {

	@Test
	void test() {
		String str = "Java Getting Started on Heroku";
		assertThat(str, is("Java Getting Started on Heroku"));
	}

}
