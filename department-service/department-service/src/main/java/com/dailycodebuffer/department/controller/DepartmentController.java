package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save-department")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside save department method of department controller ");
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String currentDate=dateTime.format(formatter);
        return departmentService.saveDepartment(department);

    }
  @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        log.info("Inside find department by id method of department controller");
        return departmentService.findByDepartmentId(departmentId);
    }
    @GetMapping("/")
    public List<Department> findAll(){
        return  departmentService.findAll();
    }
}

