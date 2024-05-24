package object_ex;

public class Test {
	
	public static void main(String args[]) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.equals(obj2));
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1와 obj2는 동등");
		} else {
			System.out.println("obj1와 obj2는 동등하지 않음");
		}
		
		System.out.println("========================");
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1와 obj3는 동등");
		} else {
			System.out.println("obj1와 obj3는 동등하지 않음");
		}
	}
	
	

}
