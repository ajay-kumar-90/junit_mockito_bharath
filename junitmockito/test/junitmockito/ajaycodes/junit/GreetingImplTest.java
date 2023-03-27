package junitmockito.ajaycodes.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GreetingImplTest {


	@Test
	public void greetShouldReturnValidOutput() {
		Greeting greeting = new GreetingImpl();
		String result = greeting.greet("Junit");
		assertNotNull("result must not be null", result);
		assertEquals("Hello Junit", result);




	}

}
