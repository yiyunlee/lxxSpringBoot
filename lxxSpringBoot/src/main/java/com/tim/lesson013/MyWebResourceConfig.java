package com.tim.lesson013;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//注意下面的注解
@Configuration
public class MyWebResourceConfig extends WebMvcConfigurationSupport {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	
		//增加自定义静态资源映射规则,当请求url以/myres/开头，则访问类路径下/myres/文件夹下的资源
		//myres文件夹添加位置》》》src/main/resource/myres
		registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
		super.addResourceHandlers(registry);
	}

}
