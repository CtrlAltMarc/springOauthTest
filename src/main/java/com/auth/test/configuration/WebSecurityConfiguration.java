package com.auth.test.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors()
            .and()
                .authorizeRequests(authorizeRequests -> authorizeRequests
                    .mvcMatchers("/test")
                        .hasAuthority("SCOPE_openid")
                    .anyRequest().authenticated());
    }
    
}
