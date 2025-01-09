package com.spring.rest.dao;



import com.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    /*Добавляем Пользователя*/
    public List<Employee> getAllEmployees();
    /*Сохраняем*/
    public void saveEmployee(Employee employee);
    /*Изменяем*/
    public Employee getEmployee(int id);
    /*Удаляем*/
     public void deleteEmployee(int id);
}
