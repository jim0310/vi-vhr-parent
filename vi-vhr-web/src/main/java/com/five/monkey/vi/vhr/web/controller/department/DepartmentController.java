package com.five.monkey.vi.vhr.web.controller.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.five.monkey.vi.vhr.service.department.DepartmentService;

/**
 * @author jim
 * @date 2021/3/25 17:41
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    @Qualifier("departmentServiceProxy")
    private DepartmentService departmentServiceProxy;

    @Autowired
    @Qualifier("departmentServiceImpl")
    private DepartmentService departmentServiceImpl;
}
