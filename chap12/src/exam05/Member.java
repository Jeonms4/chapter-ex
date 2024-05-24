package exam05;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data  // @Getter @Setter @ToString 대체
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Member {
	//final private String id;
	@NonNull
	private String id;
	private String name;
	private int age;
	
//	public Member(String id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
	
	public String toString() {
		return "회원 ID : " + this.id + "회원 이름 : " + this.name + "회원 나이 : " + this.age;
	}
	
}
