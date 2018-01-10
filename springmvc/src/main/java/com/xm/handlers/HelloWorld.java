package com.xm.handlers;

import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @ClassName: HelloWorld
 * @Description: Controller 实例
 * @author xiaomu
 * @date 2018年1月8日 下午7:15:05
 *
 */
@Controller
public class HelloWorld {
	/**
	 * 
	 * @Title: hello @Description: 使用requestMapping注解映射请求' 2、返回值
	 * 会通过视图解析器解析为物理视图，对于InternalResourceViewResolver 视图解析器，会做如下的解析 prefix +
	 * returnVal + 后缀 这样的 方式得到实际的物理试图，然后做转发操作 （注意是转发，不是重定向) @param @return
	 * 设定文件 @return String 返回类型 @throws
	 */
	@RequestMapping(value = "/helloworld", method = RequestMethod.POST)
	public String hello() {
		System.out.println("hello wordld");
		return "success";
	}

	@RequestMapping(value = "/testParamsAndHeaders", params = { "username", "age!=10" })
	public String testParamsAndHeaders() {

		return "success";
	}

	@RequestMapping(value = "/testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath");

		return "success";
	}

	@RequestMapping("testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") int id) {
		System.out.println("testPathVariable");
		System.out.println(id);
		return "success";
	}
}
