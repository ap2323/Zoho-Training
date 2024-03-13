class SwitchCaseTest {
private static int getNumber(int a) {
	try {
		switch (a) {

		case 1:
			return 100;
		case 2:

			return 200;

		default: 
			throw new RuntimeException();
		} 
	} catch (Exception e) {
		return 400;
	} finally {
		return 500;
	}
}
public static void main(String[] args) { 

	System.out.println(getNumber(2));
	int a = 10;
	a = Integer.valueOf("100");
	System.out.println(a);
}

}
