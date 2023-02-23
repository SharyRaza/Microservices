package com.department.department_service.Department;


import jakarta.persistence.*;

@Entity
@Table(name = "department_services")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
