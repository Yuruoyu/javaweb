package com.ryan.springboothello;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 * @SpringBootApplication 指定这是一个spring的应用程序
 */
@SpringBootApplication
public class App extends WebMvcConfigurerAdapter
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
    /*
     * 继承webmvcConfigurerAdaper并重写configureMessageConverters方法
     * 可以实现fastConverter,对json数据进行格式转换。
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    	// TODO Auto-generated method stub
    	super.configureMessageConverters(converters);
    	FastJsonHttpMessageConverter fastConverter =new FastJsonHttpMessageConverter();
    	FastJsonConfig fastJsonConfig=new FastJsonConfig();
    	fastJsonConfig.setSerializerFeatures(
    			SerializerFeature.PrettyFormat);
    	fastConverter.setFastJsonConfig(fastJsonConfig);
    	converters.add(fastConverter);
    	
    }
}
