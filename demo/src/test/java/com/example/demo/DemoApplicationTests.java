package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DemoApplicationTests {

	@Test
	void addsNumbers() {
		// Act
		int result = Trial.add(1,2);
		// Assert
		assertThat(result).isEqualTo(3);
	}

}
