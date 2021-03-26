package com.five.monkey.vi.vhr.common.enums.user;

import java.util.Optional;

/**
 * 员工性别枚举
 * @author jim
 * @date 2021/3/25 10:04
 */
public enum SexEnum {

	// 员工性别。0:未知;1:男性;2:女性
	UN_KNOW((byte) 0, "未知"),

	MALE((byte) 1, "男"),

	FEMALE((byte) 2, "女");

	private Byte	sex;

	private String	desc;

	SexEnum(Byte sex, String desc) {
		this.sex = sex;
		this.desc = desc;
	}

	public Byte getSex() {
		return sex;
	}

	public String getDesc() {
		return desc;
	}

	public static SexEnum ofNullable(Byte sex) {
		SexEnum sexEnum = null;
		SexEnum[] sexEnums = SexEnum.values();
		for (SexEnum anEnum : sexEnums) {
			if (anEnum.getSex().equals(sex)) {
				sexEnum = anEnum;
				break;
			}
		}
		return Optional.ofNullable(sexEnum).orElse(SexEnum.UN_KNOW);
	}
}
