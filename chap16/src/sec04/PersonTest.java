package sec04;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		Member member1 = person1.getMember(
				
				(str) -> {
					return new Member(str);
				}
				
				);
		
		System.out.println(member1);
		
		Member member2 = person1.getMember2(
				Member:: new
				);
		
		System.out.println(member2);
	}

}
