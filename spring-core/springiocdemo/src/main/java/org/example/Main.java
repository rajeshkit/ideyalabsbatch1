package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext
                        ("application-config.xml","application-xml1.xml");
        Player player = applicationContext.getBean("p4",Player.class);
        player.createPlayer();
    /*    Team team = applicationContext.getBean("t2",Team.class);
        team.callTeam();*/
        ((ConfigurableApplicationContext)applicationContext).close();
    }
}