package com.appleframework.core.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ������ - Spring
 */

public class SpringUtility implements ApplicationContextAware, DisposableBean {

	private static ApplicationContext applicationContext = null;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringUtility.applicationContext = applicationContext;
	}
	
	public void destroy() throws Exception {
		applicationContext = null;
	}

	/**
	 * ��ȡapplicationContext
	 * 
	 * @return applicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * ����Bean���ƻ�ȡʵ��
	 * 
	 * @param name
	 *            Beanע������
	 * 
	 * @return beanʵ��
	 * 
	 * @throws BeansException
	 */
	public static Object getBean(String name) throws BeansException {
		return applicationContext.getBean(name);
	}

}