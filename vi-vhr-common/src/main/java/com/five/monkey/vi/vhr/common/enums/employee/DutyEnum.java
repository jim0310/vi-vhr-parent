package com.five.monkey.vi.vhr.common.enums.employee;

import java.util.Objects;

/**
 * 职级枚举
 * @author jim
 * @date 2021/3/25 10:55
 */
public enum DutyEnum {

	// 0:助理;1:初级;2:中级;3:高级;4:架构;5:资深;6:专家
	ASSISTANT_MANAGER((byte) 0, "助理"),

	PRIMARY((byte) 1, "初级"),

	INTERMEDIATE((byte) 2, "中级"),

	ADVANCED((byte) 3, "高级"),

	ARCHITECTURE((byte) 4, "架构"),

	SENIOR((byte) 5, "资深"),

	EXPERT((byte) 6, "专家");

	private Byte	duty;

	private String	desc;

	DutyEnum(Byte duty, String desc) {
		this.duty = duty;
		this.desc = desc;
	}

	public Byte getDuty() {
		return duty;
	}

	public String getDesc() {
		return desc;
	}

	public static DutyEnum of(Byte duty) {
		DutyEnum dutyEnum = null;
		DutyEnum[] dutyEnums = DutyEnum.values();
		for (DutyEnum anEnum : dutyEnums) {
			if (anEnum.getDuty().equals(duty)) {
				dutyEnum = anEnum;
				break;
			}
		}
		if (Objects.isNull(dutyEnum)) {
			throw new IllegalArgumentException(
					"class \'DutyEnum\', method \'of(Byte duty)\' throw IllegalArgumentException, param duty = " + duty);
		}
		return dutyEnum;
	}
}
