package com.five.monkey.vi.vhr.common.enums.user;

import java.util.Optional;

/**
 * 最高学历枚举
 * @author jim
 * @date 2021/3/25 10:24
 */
public enum TopDegreeEnum {

	// 0:暂无;1:小学;2:初中;3:职高;4:高中;5:专科;6:本科;7:研究生;8:博士;9:博士后
	UN_KNOW((byte) 0, "暂无"),

	PRIMARY_SCHOOL((byte) 1, "小学"),

	JUNIOR_HIGH_SCHOOL((byte) 2, "初中"),

	VOCATIONAL_HIGH_SCHOOL((byte) 3, "职高"),

	HIGH_SCHOOL((byte) 4, "高中"),

	SPECIALIST((byte) 5, "专科"),

	UNDERGRADUATE((byte) 6, "本科"),

	POSTGRADUATE((byte) 7, "研究生"),

	DOCTOR((byte) 8, "博士"),

	POST_DOC((byte) 9, "博士后");

	private Byte	topDegree;

	private String	desc;

	TopDegreeEnum(Byte topDegree, String desc) {
		this.topDegree = topDegree;
		this.desc = desc;
	}

	public Byte getTopDegree() {
		return topDegree;
	}

	public String getDesc() {
		return desc;
	}

	public static TopDegreeEnum ofNullable(Byte topDegree) {
		TopDegreeEnum topDegreeEnum = null;
		TopDegreeEnum[] topDegreeEnums = TopDegreeEnum.values();
		for (TopDegreeEnum degreeEnum : topDegreeEnums) {
			if (degreeEnum.getTopDegree().equals(topDegree)) {
				topDegreeEnum = degreeEnum;
				break;
			}
		}
		return Optional.ofNullable(topDegreeEnum).orElse(TopDegreeEnum.UN_KNOW);
	}
}
