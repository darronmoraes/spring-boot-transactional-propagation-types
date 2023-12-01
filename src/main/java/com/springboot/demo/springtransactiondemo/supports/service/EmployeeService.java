package com.springboot.demo.springtransactiondemo.supports.service;

import com.springboot.demo.springtransactiondemo.models.Employee;
import com.springboot.demo.springtransactiondemo.repository.EmployeeRepository;
import com.springboot.demo.springtransactiondemo.service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public void insertEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
