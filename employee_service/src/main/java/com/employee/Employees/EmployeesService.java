package com.employee.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class EmployeesService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;
    public Employees getEmployeeById (Integer id){
        Employees employee = employeeRepository.findById(id).get();
        ResponseEntity<Department> response = restTemplate.getForEntity("http://localhost:9002/dept/"+employee.getDepartmentId(),Department.class);
        Department department = response.getBody();
        return new Employees(employee.getId(), employee.getName(), employee.getDepartmentId(), department.getName());
    }

}
