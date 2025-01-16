package com.STEPS.Sprintboot_tutorial.Service;

import com.STEPS.Sprintboot_tutorial.Entity.Department;
import com.STEPS.Sprintboot_tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    Department fetchDepartmentById(Long departmentId); // Use Long for consistency with the Entity

    Department fetchDepartmentById(long departmentId) throws DepartmentNotFoundException;

    Department saveDepartment(Department department);

    void deleteDepartmentById(Long departmentId); // Consistent with fetchDepartmentById

    void deleteDepartmentById(long departmentId);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
