package com.STEPS.Sprintboot_tutorial.Service;


import com.STEPS.Sprintboot_tutorial.Entity.Department;

import java.awt.*;
import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();
    public Department fetchDepartmentById(long departmentId);
    public  void deleteDepartmentById(long departmentId);
//    public Department updateDepartment(Department department);
}
