package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "myTeam3")
public class Team {

    public void createTeam(){
        System.out.println("create team method is called");
    }

}
