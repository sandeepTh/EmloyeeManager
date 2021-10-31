package com.example.demo;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected   void configure(HttpSecurity httpSecurity) throws Exception {
      httpSecurity
        .csrf().disable()
        .authorizeRequests()
        .anyRequest().permitAll();

    }

}
