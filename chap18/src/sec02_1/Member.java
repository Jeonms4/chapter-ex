package sec02_1;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member implements Serializable {
	private static final long serialVerisonUID = 1L;
	
	String id;
	String name;
	
	public String toString() {
		return this.id + ", " + this.name;
	}
}
