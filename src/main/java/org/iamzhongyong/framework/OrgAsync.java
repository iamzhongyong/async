package org.iamzhongyong.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * �Զ����ע��,��������ע��֮�󣬷���ִ�е�ʱ����첽��ִ��
 * @author bixiao.zy
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface OrgAsync {
	String value() default "";
}
