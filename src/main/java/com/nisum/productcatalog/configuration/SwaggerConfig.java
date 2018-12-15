package com.nisum.productcatalog.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.RequestHandlerCombiner;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by yc04292 on 12/14/18.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
            //basePackage("com.nisum.productcatalog.controller"))
        .paths(PathSelectors.any())
        .build();
  }


}
