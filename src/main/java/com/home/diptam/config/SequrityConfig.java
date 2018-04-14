package com.home.diptam.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SequrityConfig extends WebSecurityConfigurerAdapter{

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth.inMemoryAuthentication().withUser("admin").password("password").roles("ADMIN");

    }

    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers("/api/**")
                .hasRole("ADMIN");
    }
}
