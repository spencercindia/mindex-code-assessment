package com.mindex.challenge.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.service.EmployeeService;

@Service
public class CompensationServiceImpl implements CompensationService {

    @Autowired
    CompensationRepository compensationRepository;
    @Autowired
    EmployeeService employeeService;

    @Override
    public Compensation create(Compensation comp) {
        Employee emp = employeeService.read(comp.getEmployee().getEmployeeId());
        comp.setEmployee(emp);
        comp.setEffectiveDate(LocalDateTime.now());
        compensationRepository.insert(comp);
        return comp;
    }

    @Override
    public Compensation read(Employee emp) {
        Compensation comp = compensationRepository.findCompByEmployee(emp);
        if (comp == null) {
            throw new RuntimeException("Invalid request: " + emp);
        }
        return comp;
    }

}
