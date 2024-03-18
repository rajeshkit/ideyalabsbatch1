package org.ideyalabs.pms.config.security;

import org.ideyalabs.pms.service.CustomeUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
  @Autowired
  private CustomeUserDetailsService customeUserDetailsService;
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf(e->e.disable());
    httpSecurity.cors(e->e.disable());
    httpSecurity.authorizeHttpRequests(authRequest ->{
        authRequest
                .requestMatchers("/user-api/v1/users").permitAll()
      //          .requestMatchers("/product-api/v1/**").hasAnyRole("ADMIN")
//                .requestMatchers("/user-api/v1/**").hasAnyRole("ADMIN","CUSTOMER")
                .anyRequest().authenticated();
    }).authenticationProvider(daoAuthenticationProvider())
    .httpBasic(Customizer.withDefaults())
            .formLogin(Customizer.withDefaults());
    return httpSecurity.build();
  }
  @Bean
  public DaoAuthenticationProvider daoAuthenticationProvider(){
    DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
    System.out.println("custom service object "+customeUserDetailsService);
    daoAuthenticationProvider.setUserDetailsService(customeUserDetailsService);
    daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
    return  daoAuthenticationProvider;
  }
//  @Bean
//  public AuthenticationManager authenticationManager(AuthenticationConfiguration config)
//          throws Exception {
//    return config.getAuthenticationManager();
//  }
  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }
}