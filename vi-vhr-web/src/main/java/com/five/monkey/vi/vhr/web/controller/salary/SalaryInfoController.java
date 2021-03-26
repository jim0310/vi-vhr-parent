package com.five.monkey.vi.vhr.web.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.five.monkey.vi.vhr.service.salary.SalaryInfoService;

/**
 * @author jim
 * @date 2021/3/25 17:38
 */
@RestController
@RequestMapping("/salary/info")
public class SalaryInfoController {

    @Autowired
    @Qualifier("salaryInfoServiceImpl")
    private SalaryInfoService salaryInfoServiceImpl;

    @Autowired
    @Qualifier("salaryInfoServiceProxy")
    private SalaryInfoService salaryInfoServiceProxy;
}
