package com.ryan.springboothello.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  新建一個Class
 *  在class上添加注解，@ControllerAdvice;
 *  在class添加方法
 *  在方法上添加@ExceptionHandler攔截相應的異常信息
 *  如果返回的是view 方法的返回的是modelandview
 *  如果返回的是String或者json數據，那麽需要在方法上添加@ResponseBody注解
 * @author Laird
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ResponseBody
	@ExceptionHandler
	public String defaultExceptionHandler(HttpServletRequest req,Exception e ){
		return "對不起，服務器繁忙";
	}
}
