package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main m =new Main();
		String out=m.input_string("AAbcdef");
		assertEquals("bcdef",out);
		
		String out1=m.input_string("aAbcdef");
		assertEquals("abcdef",out1);
		
		String out2=m.input_string("aabcdef");
		assertEquals("aabcdef",out2);
		
		String out3=m.input_string("Aabcdef");
		assertEquals("abcdef",out3);
	}

}
