package org.ideyalabs.pms.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppSecurityConfig {
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf(e->e.disable());
    httpSecurity.authorizeHttpRequests(authRequest ->{
        authRequest
                .requestMatchers("/product-api/v1/**").hasAnyRole("ADMIN")
                .requestMatchers("/user-api/v2/**").hasAnyRole("ADMIN","CUSTOMER")
                .anyRequest().authenticated();
    }).httpBasic(Customizer.withDefaults());
    return httpSecurity.build();
  }
  @Bean
  public UserDetailsService userDetailsService(){
    UserDetails userDetails1= User.builder()
              .username("rajesh")
              .password(passwordEncoder().encode("rajesh@123"))
              .roles("ADMIN","CUSTOMER")
              .build();
    UserDetails userDetails2= User.builder()
            .username("ajay")
            .password(passwordEncoder().encode("ajay@123"))
            .roles("CUSTOMER")
            .build();
      return new InMemoryUserDetailsManager(userDetails1,userDetails2);
  }
  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }
}