package org.ideyalabs.pms.config.security;

import org.ideyalabs.pms.service.CustomeUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
  @Autowired
  private JwtFilter jwtFilter;
  @Autowired
  private CustomeUserDetailsService customeUserDetailsService;
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf(e->e.disable());
    httpSecurity.cors(e->e.disable());
    httpSecurity.authorizeHttpRequests(authRequest ->{
        authRequest
                .requestMatchers("/user-api/v1/users","/user-api/v1/users/login").permitAll()
                .requestMatchers(HttpMethod.POST,"/product-api/v1/**").hasAnyRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE,"/product-api/v1/**").hasAnyRole("ADMIN")
                .requestMatchers("/user-api/v1/**").hasAnyRole("ADMIN","CUSTOMER")
                .anyRequest().authenticated();
    }).sessionManagement(Customizer.withDefaults())
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
            .authenticationProvider(daoAuthenticationProvider())
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
  @Bean
  public AuthenticationManager authenticationManager(List<AuthenticationProvider> authenticationProviders) {
    return new ProviderManager(authenticationProviders);
  }
  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }
}