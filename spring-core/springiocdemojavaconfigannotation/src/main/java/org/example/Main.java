package org.example;


import com.demo.TeamManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(AppConfig.class);
        Player player = applicationContext.getBean(Player.class);
        player.createPlayer();


        ((ConfigurableApplicationContext)applicationContext).close();
    }
}