package com.five.monkey.vi.vhr.web.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.five.monkey.vi.vhr.common.vo.base.BaseResponseVo;
import com.five.monkey.vi.vhr.common.vo.user.UserVo;
import com.five.monkey.vi.vhr.service.user.UserService;

/**
 * @author jim
 * @date 2021/3/25 17:34
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService	userServiceImpl;

	@Autowired
	@Qualifier("userServiceProxy")
	private UserService	userServiceProxy;

	@GetMapping("/list")
	public BaseResponseVo<List<UserVo>> list(@RequestParam(value = "start", required = false, defaultValue = "0") int start,
			@RequestParam(value = "length", required = false, defaultValue = "10") int length) {
		BaseResponseVo<List<UserVo>> responseVo = new BaseResponseVo<>();
		List<UserVo> userVoList = userServiceProxy.list(start, length);
		responseVo.setData(userVoList);
		return responseVo;
	}

	@PostMapping("/add")
	public BaseResponseVo<UserVo> add(@RequestBody UserVo userVo) {
		BaseResponseVo<UserVo> responseVo = new BaseResponseVo<>();
		responseVo.setData(userServiceProxy.insertSelective(userVo));
		return responseVo;
	}
}
