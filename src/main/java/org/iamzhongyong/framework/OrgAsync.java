package org.iamzhongyong.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 自定义的注解,添加了这个注解之后，方法执行的时候会异步来执行
 * @author bixiao.zy
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface OrgAsync {
	String value() default "";
}
