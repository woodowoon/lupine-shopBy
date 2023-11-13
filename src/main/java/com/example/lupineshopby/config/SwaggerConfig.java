/*
K-Deal version 1.0

Copyright© 2023 kt corp. All rights reserved.

This is a proprietary software of kt corp, and you may not use this file except in
compliance with license agreement with kt corp. Any redistribution or use of this
software, with or without modification shall be strictly prohibited without prior written
approval of kt corp, and the copyright notice above does not evidence any actual or
intended publication of such software.
 */
package com.example.lupineshopby.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket zuulApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("gateway")
                .apiInfo(
                        new ApiInfoBuilder()
                                .title("Lupine-ShopBy 모듈 API")
                                .description("")
                                .termsOfServiceUrl("")
                                .version("1.0")
                                .license("shopBy")
                                .license("https://github.com/woodowoon/lupine-shopBy")
                                .build()
                )
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/*/v1/**"))
                .paths(PathSelectors.ant("/*/v1/*/**"))
                .build();
    }
}
