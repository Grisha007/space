package com.eversis.spaceagencydatahub.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("adminpassword").roles("ContentManager");
        auth.inMemoryAuthentication().withUser("user").password("userpassword").roles("Customer");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/v1/mission/**").hasAnyRole("ContentManager").anyRequest().fullyAuthenticated().and().httpBasic();
        http.authorizeRequests().antMatchers("/v1/product/**").hasAnyRole("ContentManager").anyRequest().fullyAuthenticated().and().httpBasic();
        http.authorizeRequests().antMatchers("/v1/findProduct/**").hasAnyRole("Customer").anyRequest().fullyAuthenticated().and().httpBasic();
    }
}
