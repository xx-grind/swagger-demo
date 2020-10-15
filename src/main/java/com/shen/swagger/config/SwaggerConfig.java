package com.shen.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2 //开启swagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .groupName("xy")
                .enable(true) //不启动swagger
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shen.swagger.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfo("Xy's Api Documentation",
                "愿我心中的黑暗如这包容无数灯光的黑夜一般模样",
                "1.0",
                "urn:tos",
                new Contact("xys", "", "934213076@qq.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    }

}
