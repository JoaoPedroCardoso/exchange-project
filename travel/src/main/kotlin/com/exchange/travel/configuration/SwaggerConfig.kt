package com.exchange.travel.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.exchange.travel.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo())
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfo(
            "Exchange Travel",
            "This is a simple api to control services about travels.",
            "1.0",
            "Terms of service",
            Contact(
                "Joao Pedro Cardoso",
                "https://github.com/JoaoPedroCardoso/exchange-project/tree/master/travel",
                "joaopedrocar@hotmail.com"
            ),
            "License of API", "API license URL", emptyList()
        )
    }
}