package sec04;

public class Person {
	Member getMember(Creatable1 creatable1) {
		Member m1 = creatable1.create("hong");
		return m1;
	}
	
	Member getMember2(Creatable2 creatable1) {
		Member m2 = creatable1.create("park", "parkkildong");
		return m2;
	}
}
