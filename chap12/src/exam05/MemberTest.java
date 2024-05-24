package exam05;

public class MemberTest {

	public static void main(String[] args) {
		Member m = new Member("333");
		Member m1 = new Member("111","홍길동", 22);
		
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
		System.out.println(m1.toString());
		
		m.setId("444");
		System.out.println(m.getId());
		
		try {
			m.setId(null);
		} catch (Exception e) {
			System.out.println("@NonNull임");
		}
	}

}
