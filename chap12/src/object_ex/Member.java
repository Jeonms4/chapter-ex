package object_ex;

public class Member {
	String id;
	
	public Member() {
		
	}
	
	public Member(String id) {
		super();
		this.id = id;
	}
	
	public boolean equals(Object obj2) {
		if(obj2 instanceof Member member) {
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
