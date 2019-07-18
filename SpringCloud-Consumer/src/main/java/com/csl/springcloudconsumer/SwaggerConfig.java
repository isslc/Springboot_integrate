package com.csl.springcloudconsumer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http://localhost:8200/swagger-ui.html
 * @author csl
 * @create 2019-07-18 11:06
 */
@EnableSwagger2  //启动Swagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //扫描文档注解的包路径
                .apis(RequestHandlerSelectors.basePackage("com.csl.springcloudconsumer.Controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 添加摘要信息
     * 这里是接口的描述配置，不重要
     * @return
     */
    private ApiInfo apiInfo()
    {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                .title("XXX系统_接口文档")
                .description("用于XXX统开发组生成RESTapi风格的接口...")
//                .contact(new Contact(Global.getName(), null, null))
//                .version("版本号:" + Global.getVersion())
                .build();
    }

}
