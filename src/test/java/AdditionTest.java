import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AdditionTest {
	@Test
	public void TestMethod1() {
		StartServer startServer = new StartServer();

		int result = startServer.addition(4, 3);

		Assert.assertEquals(7, result);
	}

	@Test
	public void TestMethod2() {
		StartServer startServer = new StartServer();

		int result = startServer.addition(7, 8);

		Assert.assertEquals(15, result);
	}
}
