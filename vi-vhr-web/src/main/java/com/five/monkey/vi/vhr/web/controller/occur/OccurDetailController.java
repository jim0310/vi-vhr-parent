package com.five.monkey.vi.vhr.web.controller.occur;

import com.five.monkey.vi.vhr.service.occur.OccurDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jim
 * @date 2021/3/25 17:39
 */
@RestController
@RequestMapping("/occur/detail")
public class OccurDetailController {

    @Autowired
    @Qualifier("occurDetailServiceImpl")
    private OccurDetailService occurDetailServiceImpl;

    @Autowired
    @Qualifier("occurDetailServiceProxy")
    private OccurDetailService occurDetailServiceProxy;
}
