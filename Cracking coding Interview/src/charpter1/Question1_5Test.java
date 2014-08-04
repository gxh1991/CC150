package charpter1;
import static org.junit.Assert.*;

import org.junit.Test;


public class Question1_5Test {

	@Test
	public void testCompressBad() {
		Question1_5 q = new Question1_5();
		assertEquals(q.compressBad("a"), "a");
		assertEquals(q.compressBad("aa"), "a2");
		assertEquals(q.compressBad("aaa"), "a3");
		assertEquals(q.compressBad("ab"), "ab");
		assertEquals(q.compressBad("aabbb"), "a2b3");
	}

	

}
