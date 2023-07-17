package day08.practice;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HashMapDemoTest {
	@Test
	public void testrun() {
		String[] name = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };
		Assertions.assertTrue(Demo.runs(name));
	}

	@Test
	public void testrunnull() {
		try {
			Demo.runs(null);

		} catch (Exception ex) {
			Assertions.assertEquals(ex.getMessage(), "Array cann't be null");
		}
	}

	@Test
	public void print() {
		Assertions.assertTrue(Demo.out());
	}
}
