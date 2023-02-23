package com.department.department_service.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;
    public Department getDepartmentById(Integer id){
        return departmentRepository.findById(id).get();
    }
}
