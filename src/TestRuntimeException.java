
public class TestRuntimeException {
public static void main(String[] args) {
	try {
		int j = 10/0;
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("After catching Runtime Exception");
}
}
