package com.STEPS.Sprintboot_tutorial.Controller;


import com.STEPS.Sprintboot_tutorial.Entity.Department;
import com.STEPS.Sprintboot_tutorial.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
@PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
    return departmentService.saveDepartment(department);
}
@GetMapping("/departments")
public List<Department> fetchDepartmentList(){
    return departmentService.fetchDepartmentList();
}
@GetMapping("/departments/{id}")
public  Department fetchDepartmentById(@PathVariable("id") long departmentId){
    return departmentService.fetchDepartmentById(departmentId);
}
@DeleteMapping("/departments/{id}")
public String deleteDepartmentById(@PathVariable("id") long departmentId){
    departmentService.deleteDepartmentById(departmentId);
    return "Department deleted successfully";
}
//@PutMapping("/departments/{id}")
//    public String updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
//return departmentService.updateDepartment(departmentId,department);
//}

}
