package com.georgereva.spring.boot.spring_data_rest.dao;

import com.georgereva.spring.boot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
