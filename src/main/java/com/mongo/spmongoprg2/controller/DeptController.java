package com.mongo.spmongoprg2.controller;

import com.mongo.spmongoprg2.model.Department;
import com.mongo.spmongoprg2.model.Employee;
import com.mongo.spmongoprg2.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value="/savedept")
    public String saveEmp(@RequestBody Department department){
        departmentRepo.save(department);
        return "Dept saved";
    }
}
