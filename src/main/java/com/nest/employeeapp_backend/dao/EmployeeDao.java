package com.nest.employeeapp_backend.dao;

import com.nest.employeeapp_backend.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `company_name`, `designation`, `empcode`, `mobno`, `name`, `password`, `salary`, `username` FROM `employee` WHERE `empcode` LIKE %:empcode%", nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empcode") Integer empcode);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employee` WHERE `id`=:id",nativeQuery = true)
    void deleteEmployee(@Param("id") Integer id);
}
