package com.five.monkey.vi.vhr.common.enums.employee;

import java.util.Objects;

/**
 * 在职状态枚举
 * @author jim
 * @date 2021/3/25 11:17
 */
public enum WorkStateEnum {

	// 1:在职;2:离职
	ON_THE_JOB((byte) 1, "在职"),

	RESIGN((byte) 2, "离职");

	private Byte	workState;

	private String	desc;

	WorkStateEnum(Byte workState, String desc) {
		this.workState = workState;
		this.desc = desc;
	}

	public Byte getWorkState() {
		return workState;
	}

	public String getDesc() {
		return desc;
	}

	public static WorkStateEnum of(Byte workState) {
		WorkStateEnum workStateEnum = null;
		WorkStateEnum[] workStateEnums = WorkStateEnum.values();
		for (WorkStateEnum stateEnum : workStateEnums) {
			if (stateEnum.getWorkState().equals(workState)) {
				workStateEnum = stateEnum;
				break;
			}
		}
		if (Objects.isNull(workStateEnum)) {
			throw new IllegalArgumentException(
					"class \'WorkStateEnum\', method \'of(Byte workState)\' throw IllegalArgumentException, param workState = "
							+ workState);
		}
		return workStateEnum;
	}
}
