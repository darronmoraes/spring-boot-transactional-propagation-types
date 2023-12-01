package com.springboot.demo.springtransactiondemo.notsupported.service;

import com.springboot.demo.springtransactiondemo.models.Employee;
import com.springboot.demo.springtransactiondemo.models.EmployeeHealthInsurance;
import com.springboot.demo.springtransactiondemo.service.HealthInsuranceService;
import com.springboot.demo.springtransactiondemo.service.interfaces.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrganizationService implements IOrganizationService {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    HealthInsuranceService healthInsuranceService;


    @Override
    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
        employeeService.insertEmployee(employee);

        if (employee.getId() == 1) {
            throw new RuntimeException("Transaction Rollback : test");
        }

        // Create a repository and then implement health.save and other methods
        // healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
    }

    @Override
    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
        employeeService.deleteEmployee(employee.getId());
        // Create a repository and then implement health.deleteById and other methods
        // healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance);
    }
}
