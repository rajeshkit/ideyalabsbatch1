package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        addEmployee();
        //getEmployeeById();
       // deleteEmployeeById();
        //updateNameAndSalaryEmployeeById();
       // getAllEmployees();
    }

    private static void getAllEmployees() {
        Configuration configuration=new Configuration().configure("app.hibernate.config.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Employee> query=session.createQuery("FROM employee_info");
        List<Employee> list = query.list();
        for (Employee e:
             list) {
            System.out.println(e);
        }
        // list.stream().forEach(System.out::println);
        session.getTransaction().commit();
        session.close();
    }

    private static void updateNameAndSalaryEmployeeById() {
        Configuration configuration=new Configuration().configure("app.hibernate.config.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the employee id want to update");
        int empId=s.nextInt();
        s.nextLine();
        System.out.println("Enter the new name to be updated");
        String empName=s.nextLine();
        System.out.println("Enter the employee new salary to be updated");
        int newSalary=s.nextInt();
        Employee e = session.get(Employee.class,empId);

        if(e!=null){
            e.setEmployeeName(empName);
            e.setEmployeeSalary(newSalary);
            session.persist(e);

        }else{
            System.out.println("employee does not exists!!! update is failed");
        }
        session.getTransaction().commit();
        session.close();
    }

    private static void deleteEmployeeById() {
        Configuration configuration=new Configuration().configure("app.hibernate.config.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the employee id want to delete");
        int empId=s.nextInt();
        Employee e = session.get(Employee.class,empId);
        if(e!=null){
            session.remove(e);
        }else{
            System.out.println("employee does not exists!!! delete is failed");
        }
        session.getTransaction().commit();
        session.close();
    }

    private static void getEmployeeById() {
        Configuration configuration=new Configuration().configure("app.hibernate.config.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //hibernate query method
        Employee e=session.find(Employee.class,1004);
        session.getTransaction().commit();
        session.close();
        if(e!=null){
            System.out.println(e);
        }else{
            System.out.println("employee id is not exists");
        }
    }

    private static void addEmployee() {
        Configuration configuration=new Configuration();
        configuration.configure("app.hibernate.config.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory(); //3 connections
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Employee e=new Employee();
        e.setEmployeeName("xyz");
        e.setEmployeeSalary(20000);

        Project p=new Project();
        p.setProjectName("iciciapp");
        p.setReleaseDate(new Date());
        p.setEmployee(e);
        e.setProject(p);
        session.persist(e);//INSERT
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
