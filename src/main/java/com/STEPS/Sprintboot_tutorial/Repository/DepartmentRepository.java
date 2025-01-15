package com.STEPS.Sprintboot_tutorial.Repository;

import com.STEPS.Sprintboot_tutorial.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
