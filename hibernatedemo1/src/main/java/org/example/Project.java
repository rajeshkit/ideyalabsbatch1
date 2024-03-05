package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private int projectId;
    private String projectName;
    private Date releaseDate;
    @OneToOne //One project map to a many employees
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
