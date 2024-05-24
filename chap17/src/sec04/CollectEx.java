package sec04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import sec04.Student;

public class CollectEx {

	public static void main(String[] args) {
		List<Student> stuList = Arrays.asList(new Student("홍일동", "남", 90),
				new Student("홍이동","여", 80),
				new Student("홍삼동","남", 79),
				new Student("홍사동","여", 70));
		
		List<Student> resultList = stuList.stream().filter((x)->{return x.getSung().equals("남");}).collect(Collectors.toList());
		
		resultList.stream().forEach((x)->{System.out.println(x.getName());});
		
		List<Student> resultList2 = stuList.stream().filter((x)->{return x.getSung().equals("여");}).toList();
		resultList2.stream().forEach((x)->{System.out.println(x.getName());});
		
		Map<String, Integer> map1 = stuList.stream().filter((x)->{return x.getSung().equals("남");}).collect(Collectors.toMap((x)->{return x.getName();}, (x)->{return x.getScore();}));
		
		System.out.println(map1.get("홍삼동"));
		
		Map<String, List<Student>> map2 = stuList.stream().collect(Collectors.groupingBy((x)->{return x.getSung();}));
		
		map2.get("남").stream().forEach((x)->{System.out.println(x.getName());});
		
		stuList.stream().collect(Collectors.groupingBy(null));
	}

}
