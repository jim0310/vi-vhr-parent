package com.five.monkey.vi.vhr.web.controller.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.five.monkey.vi.vhr.service.employee.EmployeeService;

/**
 * @author jim
 * @date 2021/3/25 17:36
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    @Qualifier("employeeServiceImpl")
    private EmployeeService employeeServiceImpl;

    @Autowired
    @Qualifier("employeeServiceProxy")
    private EmployeeService employeeServiceProxy;
}
