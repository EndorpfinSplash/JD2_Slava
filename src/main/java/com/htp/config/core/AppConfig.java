package com.htp.config.core;

import com.htp.config.swagger.SwaggerConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ComponentScan("com.htp")
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@EnableTransactionManagement(proxyTargetClass = true)
@Import({DatabaseConfig.class, JdbcTemplateConfig.class, SwaggerConfig.class})
public class AppConfig {

}
