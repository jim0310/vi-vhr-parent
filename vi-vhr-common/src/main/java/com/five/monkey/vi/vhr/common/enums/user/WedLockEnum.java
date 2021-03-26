package com.five.monkey.vi.vhr.common.enums.user;

import java.util.Optional;

/**
 * 婚姻状况枚举
 * @author jim
 * @date 2021/3/25 10:16
 */
public enum WedLockEnum {

	// 0:未婚;1:已婚;2:丧偶
	UNMARRIED((byte) 0, "未婚"),

	MARRIED((byte) 1, "已婚"),

	WIDOWED((byte) 2, "丧偶");

	private Byte	wedLock;

	private String	desc;

	WedLockEnum(Byte wedLock, String desc) {
		this.wedLock = wedLock;
		this.desc = desc;
	}

	public Byte getWedLock() {
		return wedLock;
	}

	public String getDesc() {
		return desc;
	}

	public static WedLockEnum ofNullable(Byte wedLock) {
		WedLockEnum wedLockEnum = null;
		WedLockEnum[] wedLockEnums = WedLockEnum.values();
		for (WedLockEnum lockEnum : wedLockEnums) {
			if (lockEnum.getWedLock().equals(wedLock)) {
				wedLockEnum = lockEnum;
				break;
			}
		}
		return Optional.ofNullable(wedLockEnum).orElse(WedLockEnum.UNMARRIED);
	}
}
