package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.data.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {

    @Autowired
    private EmployeeService employeeService;

    public ReportingStructure read(String id) {

        System.out.println(id);

        Employee employee = employeeService.read(id);
        int totalEmpReports = employeeService.getNumberOfReports(id);

        ReportingStructure reportingStructure = new ReportingStructure(employee, totalEmpReports);

        return reportingStructure;
    }
}
