package com.STEPS.Sprintboot_tutorial.Service;


import com.STEPS.Sprintboot_tutorial.Entity.Department;
import com.STEPS.Sprintboot_tutorial.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class DepartmentServiceimpl implements DepartmentService {
@Autowired
   private DepartmentRepository departmentRepository;

    @Override
    public void deleteDepartmentById(long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

//    @Override
//    public Department updateDepartment(Long departmentId, Department department) {
//        Department depDB = departmentRepository.findById(departmentId).get();
//
//
//        if(Object.nonNull(department.getDepartmentId())&&
//                !"".equalsIgnoreCase(department.getDepartmentName())){
//            depDB.setDepartmentName(department.getDepartmentName());
//        }
//    }
}
