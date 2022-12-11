import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MultiplicationTest {
	@Test
	public void TestMethod1() {
		StartServer startServer = new StartServer();

		int result = startServer.multiply(4, 3);

		Assert.assertEquals(12, result);
	}

	@Test
	public void TestMethod2() {
		StartServer startServer = new StartServer();

		int result = startServer.multiply(7, 3);

		Assert.assertEquals(21, result);
	}
}
