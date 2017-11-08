package com.eureka.store.appconfig;

import com.eureka.store.support.DemoInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Taurin on 2017/8/14.
 */
@Configuration
public class ServletConfig extends WebMvcConfigurerAdapter {
    @Autowired
    DemoInterceptor demoInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(demoInterceptor);
    }
}
