package com.eureka.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Taurin on 2017/11/8.
 */
@Configuration
public class accessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        String token = requestContext.getRequest().getParameter("token");
        System.out.println("Get token value:" + token);
        requestContext.setSendZuulResponse(false);
        return null;
    }
}
