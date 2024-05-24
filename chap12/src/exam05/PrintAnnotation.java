package exam05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// 이 어노테이션을 어디에 사용할 것인가(대상, Target)
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)  // 자바에서 컴파일 하는 과정(소스-컴파일-클래스파일-실행-)
public @interface PrintAnnotation {
	String value() default "-";
	int name() default 15;
}
