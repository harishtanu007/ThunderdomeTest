import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SubtractionTest {
	@Test
	public void TestMethod1() {
		StartServer startServer = new StartServer();

		int result = startServer.subtraction(4, 3);

		Assert.assertEquals(1, result);
	}

	@Test
	public void TestMethod2() {
		StartServer startServer = new StartServer();

		int result = startServer.subtraction(7, 8);

		Assert.assertEquals(-1, result);
	}
}
