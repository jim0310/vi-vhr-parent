package com.five.monkey.vi.vhr.web.controller.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.five.monkey.vi.vhr.service.train.TrainInfoService;

/**
 * @author jim
 * @date 2021/3/25 17:37
 */
@RestController
@RequestMapping("/train/info")
public class TrainInfoController {

    @Autowired
    @Qualifier("trainInfoServiceImpl")
    private TrainInfoService trainInfoServiceImpl;

    @Autowired
    @Qualifier("trainInfoServiceProxy")
    private TrainInfoService trainInfoServiceProxy;
}
