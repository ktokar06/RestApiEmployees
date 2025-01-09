package com.spring.rest.service;

import com.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    /*Добавляем Пользователя*/
    public List<Employee> getAllEmployees();
    /*Сохраняем*/
    public void saveEmployee(Employee employee);
    /*Изменяем*/
    public Employee getEmployee(int id);
    /*Удаляем*/
    public void  deleteEmployee(int id);
}
