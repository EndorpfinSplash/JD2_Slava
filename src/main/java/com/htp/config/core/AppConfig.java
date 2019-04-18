package com.htp.config.core;

import com.htp.config.swagger.SwaggerConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan("com.htp")
@EnableAspectJAutoProxy
@EnableTransactionManagement(proxyTargetClass = true)
@Import({DatabaseConfig.class, JdbcTemplateConfig.class, SwaggerConfig.class})
public class AppConfig {

}
