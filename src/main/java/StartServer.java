public class StartServer {
	public static void main(String[] args) {
		StartServer startServer = new StartServer();
		System.out.println("Start server 1");
		System.out.println(startServer.addition(1, 2));
		System.out.println(startServer.addition(5, 1));
		System.out.println(startServer.addition(4, 3));
	}

	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	public int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

}
