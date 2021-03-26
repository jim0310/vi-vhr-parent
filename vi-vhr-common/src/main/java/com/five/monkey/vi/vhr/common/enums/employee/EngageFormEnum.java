package com.five.monkey.vi.vhr.common.enums.employee;

import java.util.Optional;

/**
 * 聘用形式枚举
 * @author jim
 * @date 2021/3/25 11:09
 */
public enum EngageFormEnum {

	// 0:其他;1:校招;2:社招;3:内推
	OTHER((byte) 0, "其他"),

	SCHOOL((byte) 1, "校招"),

	SOCIAL((byte) 2, "社招"),

	INTRODUCE((byte) 3, "内推");

	private Byte	engageForm;

	private String	desc;

	EngageFormEnum(Byte engageForm, String desc) {
		this.engageForm = engageForm;
		this.desc = desc;
	}

	public Byte getEngageForm() {
		return engageForm;
	}

	public String getDesc() {
		return desc;
	}

	public static EngageFormEnum ofNullable(Byte engageForm) {
		EngageFormEnum engageFormEnum = null;
		EngageFormEnum[] engageFormEnums = EngageFormEnum.values();
		for (EngageFormEnum formEnum : engageFormEnums) {
			if (formEnum.getEngageForm().equals(engageForm)) {
				engageFormEnum = formEnum;
				break;
			}
		}
		return Optional.ofNullable(engageFormEnum).orElse(EngageFormEnum.OTHER);
	}
}
