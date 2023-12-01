package com.springboot.demo.springtransactiondemo.service.interfaces;

import com.springboot.demo.springtransactiondemo.models.Employee;
import com.springboot.demo.springtransactiondemo.models.EmployeeHealthInsurance;
import com.springboot.demo.springtransactiondemo.repository.EmployeeRepository;

public interface IOrganizationService {

    void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

    void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);
}
