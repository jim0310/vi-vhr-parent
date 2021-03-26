package com.five.monkey.vi.vhr.web.controller.remove;

import com.five.monkey.vi.vhr.service.remove.RemoveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jim
 * @date 2021/3/25 17:41
 */
@RestController
@RequestMapping("/remove/info")
public class RemoveInfoController {

    @Autowired
    @Qualifier("removeInfoServiceImpl")
    private RemoveInfoService removeInfoServiceImpl;

    @Autowired
    @Qualifier("removeInfoServiceProxy")
    private RemoveInfoService removeInfoServiceProxy;
}
