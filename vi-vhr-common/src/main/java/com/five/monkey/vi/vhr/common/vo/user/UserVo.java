package com.five.monkey.vi.vhr.common.vo.user;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.five.monkey.vi.vhr.common.enums.user.SexEnum;
import com.five.monkey.vi.vhr.common.enums.user.TopDegreeEnum;
import com.five.monkey.vi.vhr.common.enums.user.WedLockEnum;

import lombok.Data;

/**
 * @author jim
 * @date 2021/3/25 18:02
 */
@Data
public class UserVo {

	private Long	id;

	private String	identifyId;

	private String	name;

	private String	phone;

	private String	email;

	private String	address;

	private Byte	sex;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date	birthday;

	private Byte	wedLock;

	private String	race;

	private String	place;

	private String	politic;

	private String	school;

	private String	specialty;

	private Byte	topDegree;

	public static void main(String[] args) {
		UserVo vo = new UserVo();
		vo.setId(0L);
		vo.setIdentifyId("61042419951101345X");
		vo.setName("jim");
		vo.setPhone("18291959614");
		vo.setEmail("jibin_0310@163.com");
		vo.setAddress("江苏省-南京市-江宁区-东山街道");
		vo.setSex(SexEnum.MALE.getSex());
		vo.setBirthday(new Date());
		vo.setWedLock(WedLockEnum.UNMARRIED.getWedLock());
		vo.setRace("汉");
		vo.setPlace("陕西省-乾县");
		vo.setPolitic("群众");
		vo.setSchool("西安建筑科技大学");
		vo.setSpecialty("软件工程");
		vo.setTopDegree(TopDegreeEnum.UNDERGRADUATE.getTopDegree());
		System.out.println(JSON.toJSONString(vo));
	}
}
