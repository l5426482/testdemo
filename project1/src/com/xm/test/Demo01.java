package com.xm.test;
/**
 * 
* @ClassName: Demo01 
* @Description: 测试reflection 
* @author xiaomu 
* @date 2018年1月9日 上午9:48:57 
*
 */
@SuppressWarnings("all")
public class Demo01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("com.xm.test.bean.User");

		System.out.println(clazz);
	}
}
