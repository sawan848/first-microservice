package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside save department of department service");
        return departmentRepository.save(department);
    }

   public Department findByDepartmentId(Long departmentId){
        log.info("Inside find department by id method of department controller");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
