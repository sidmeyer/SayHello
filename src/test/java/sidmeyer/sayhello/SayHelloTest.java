package sidmeyer.sayhello;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

/**
 * Tests for SayHello class.
 */
public class SayHelloTest {

	@Test
	public void testSayHello() throws Exception {
		String expectedOutput = "Добрый день!\n";

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		SayHello sayHello = new SayHello();
		sayHello.sayHello();

		assertEquals("Message", expectedOutput, outContent.toString());
	}
}
