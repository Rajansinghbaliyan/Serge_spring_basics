//package io.cherrytechnologies.user_api.configuration.swagger;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//
//public class SwaggerConfig {
//
//    Contact contact = new Contact(
//            "Sergey Kargopolov",
//            "http://www.appsdeveloperblog.com",
//            "developer@appsdeveloperblog.com"
//    );
//
//    List<VendorExtension> vendorExtensions = new ArrayList<>();
//
//    ApiInfo apiInfo = new ApiInfo(
//            "Photo app RESTful Web Service documentation",
//            "This pages documents Photo app RESTful Web Service endpoints",
//            "1.0",
//            "http://www.appsdeveloperblog.com/service.html",
//            contact,
//            "Apache 2.0",
//            "http://www.apache.org/licenses/LICENSE-2.0",
//            vendorExtensions);
//
//    @Bean
//    public Docket apiDocket() {
//
//        Docket docket = new Docket(DocumentationType.SWAGGER_2)
//                .protocols(new HashSet<>(Arrays.asList("HTTP","HTTPs")))
//                .apiInfo(apiInfo)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("io.cherrytechnologies.user_api")).paths(PathSelectors.any())
//                .build();
//
//        return docket;
//
//    }
//
//}
