public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Welcome to my First Java Code");
		for(int i = 1; i<=10; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i+")HelloWorld");

		}
}