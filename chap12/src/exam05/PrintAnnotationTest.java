package exam05;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PrintAnnotationTest {

	public static void main(String[] args) {
		System.out.println(Service.class);
		Annotation annotation [] = Service.class.getDeclaredAnnotations();
		
		for(Annotation ano : annotation) {
			System.out.println(ano.annotationType());
		}
		
		Method methods []= Service.class.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.println(method.getAnnotation(PrintAnnotation.class));
		}
	}

}
