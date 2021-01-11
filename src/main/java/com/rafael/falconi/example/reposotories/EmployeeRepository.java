package com.rafael.falconi.example.reposotories;

import com.rafael.falconi.example.entities.Activity;
import com.rafael.falconi.example.entities.Area;
import com.rafael.falconi.example.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
    public List<Employee> findEmployeesByArea(Area area);
    
    public List<Employee> findEmployeesByActivity(Activity activity);

}
