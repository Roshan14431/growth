//package management_growth.controller;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableWebMvc
//@EnableSwagger2
//public class SwaggerConfig implements WebMvcConfigurer {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("management_growth"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(apiInfoMetaData());
//    }
////    
//////    @Configuration
//////    @EnableSwagger2
//////    public class SwaggerConfig2 {
//////        @Bean
//////        public Docket docket() {
//////            return new Docket(DocumentationType.SWAGGER_2)
//////                    .enable(true)
//////                    .apiInfo(new ApiInfoBuilder()
//////                            .title("Swagger Super")
//////                            .description("Swagger Description details")
//////                            .version("1.0").build())
//////                    .select()
//////                    .apis(RequestHandlerSelectors.basePackage("com.example.swagger.controller"))
//////                    .paths(PathSelectors.any()).build();
//////        }
////    
////
////    public ApiInfo apiInfoMetaData() {
////
////        return new ApiInfoBuilder().title("SWAGGER CONFIG")
////                .description("API Endpoint Decoration").contact("roshan dev team")
////                //.contact(new Contact("Dev-Team", "https://www.dev-team.com/", "dev-team@gmail.com"))
////                .license("Apache 3.0")
////               // .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
////               // .version("1.0.0")
////                .build();
////    }
//}