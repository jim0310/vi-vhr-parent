package com.five.monkey.vi.vhr.common.enums.occur;

import java.util.Objects;

/**
 * 奖罚类型枚举
 * @author jim
 * @date 2021/3/25 10:39
 */
public enum OccurTypeEnum {

	// 1:奖励;2:惩罚
	REWARD((byte) 1, "奖励"),

	PENALIZE((byte) 2, "惩罚");

	private Byte	occurType;

	private String	desc;

	OccurTypeEnum(Byte occurType, String desc) {
		this.occurType = occurType;
		this.desc = desc;
	}

	public Byte getOccurType() {
		return occurType;
	}

	public String getDesc() {
		return desc;
	}

	public static OccurTypeEnum of(Byte occurType) {
		OccurTypeEnum occurTypeEnum = null;
		OccurTypeEnum[] occurTypeEnums = OccurTypeEnum.values();
		for (OccurTypeEnum typeEnum : occurTypeEnums) {
			if (typeEnum.getOccurType().equals(occurType)) {
				occurTypeEnum = typeEnum;
				break;
			}
		}
		if (Objects.isNull(occurTypeEnum)) {
			throw new IllegalArgumentException(
					"class \'OccurTypeEnum\', method \'of(Byte occurType)\' throw IllegalArgumentException, param occurType = "
							+ occurType);
		}
		return occurTypeEnum;
	}
}
