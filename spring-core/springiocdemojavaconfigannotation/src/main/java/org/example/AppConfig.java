package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"org.example","com.demo"})
public class AppConfig {
    @Bean
    @Qualifier(value = "myTeam1")
    public Team team1(){
        return new Team();
    }
    @Bean
    @Qualifier(value = "myTeam2")
    public Team team2(){
        return new Team();
    }
}
