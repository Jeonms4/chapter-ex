package exam05;

public class SystemEx {

	public static void main(String[] args) {
//		System.exit(0);
//		System.out.println("hi");
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<100000; i++) {
			System.out.println("hi");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println(System.getProperties());
		System.out.println("===========");
		System.out.println(System.getenv());
	}
	
	static void hi() {
		System.out.println("hihi");
	}

}
