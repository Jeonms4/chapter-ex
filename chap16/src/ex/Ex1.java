package ex;

public class Ex1 {

	public static void main(String[] args) {
		// 1. 4 선택사항임
		// 2. 4  매개변수 타입과 가지고 있는 생성자를 찾아 실행함
		// 3. 2
		// 4. 
		for (int i = 0; i < 3; i++) {
            System.out.println("작업 스레드가 실행됩니다.");
        }
		
		// 5. 
//		btnOk.setClickListener(()-> {
//            System.out.println("Ok 버튼을 클릭했습니다");
//        });
//        
//         btnCancel.setClickListener(()->{
//            System.out.println("Cancel 버튼을 클릭했습니다.");
//        });
		// 6.
//		@FunctionalInterface
//
//		public interface Function {
//		    double apply(double x, double y);
//		}
		// 7.
//		((x, y) -> Math.max(x, y));
//		((x, y) -> Math.min(x, y));
		// 8.
//	    public static double avg(Function<Student> function) {
//	        int sum = 0;
//	        for(Student student : students) {
//	            sum += function.apply(student);
//	        }
//	        double avg = (double) sum / students.length;
//	        return avg;
		// 9. Student::getEnglishScore, Student::getMathScore
	}

}
