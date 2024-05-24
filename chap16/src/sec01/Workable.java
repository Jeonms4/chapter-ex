package sec01;

public interface Workable {
	// 1) 매개 변수 X, return X
//	abstract void work();
	// 2) 매개 변수 O, return X
//	abstract void work(String gift);
	// 3) 매개 변수 X, return O
//	abstract String work();
	
	// 4) 매개 변수 O, return O
	abstract String work(int count);
}
