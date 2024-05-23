package com.epsi.ubeer.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class SecurityConfig {

    /*
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authz -> authz
                        .requestMatchers("/", "/home", "/login", "/error").permitAll()
                        .anyRequest().authenticated())
                .logout((logout) -> logout.permitAll());
        return http.build();
    }

     */
}