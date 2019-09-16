package com.myapp.rest.basicauth.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //it tells spring configuration
@EnableWebSecurity // it tells this configuration file has Spring Security configuration
public class SpringSercurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() //I chose to use JWT token instead of using CSRF token (this is defined as default)
                .authorizeRequests() // autorizar requests nas seguintes condições:
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll() // autorizar todos os tipos de requests que são OPTIONS
                    .anyRequest().authenticated() // qualquer outro request, autorizar perante autenticação
                    .and()
                //.formLogin().and() - Disabling form login
                .httpBasic(); // autenticação essa baseada em Basic Authentication
    }
}
