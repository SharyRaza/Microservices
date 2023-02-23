package com.department.department_service.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Integer id){
        return departmentService.getDepartmentById(id);
    }
}
