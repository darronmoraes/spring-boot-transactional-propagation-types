package com.springboot.demo.springtransactiondemo.service.interfaces;

import com.springboot.demo.springtransactiondemo.models.Employee;

public interface IEmployeeService {

    void insertEmployee(Employee employee);

    void deleteEmployee(Integer id);
}
