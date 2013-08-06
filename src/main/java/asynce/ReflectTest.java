package asynce;

import java.lang.reflect.Method;

public class ReflectTest {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("asynce.Task");
		System.out.println(clazz.getName());
		
		Method method = clazz.getMethod("call", null);
		System.out.println(method.toString());
		method.invoke(new Task(), null);
	}
}
