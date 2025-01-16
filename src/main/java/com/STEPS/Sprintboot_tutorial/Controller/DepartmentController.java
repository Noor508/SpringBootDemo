package com.STEPS.Sprintboot_tutorial.Controller;


import com.STEPS.Sprintboot_tutorial.Entity.Department;
import com.STEPS.Sprintboot_tutorial.Service.DepartmentService;
import com.STEPS.Sprintboot_tutorial.error.DepartmentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


@PostMapping("/departments")
    public Department saveDepartment(@Valid  @RequestBody Department department) {
    return departmentService.saveDepartment(department);
}
@GetMapping("/departments")
public List<Department> fetchDepartmentList(){
    return departmentService.fetchDepartmentList();
}
@GetMapping("/departments/{id}")
public  Department fetchDepartmentById(@PathVariable("id") long departmentId) throws DepartmentNotFoundException {
    return departmentService.fetchDepartmentById(departmentId);
}
@DeleteMapping("/departments/{id}")
public String deleteDepartmentById(@PathVariable("id") long departmentId){
    departmentService.deleteDepartmentById(departmentId);
    return "Department deleted successfully";
}
@PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
return departmentService.updateDepartment(departmentId,department);
}
@GetMapping("/departments/name/{name}")
public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
    return departmentService.fetchDepartmentByName(departmentName);
}
}
