package com.five.monkey.vi.vhr.common.enums.train;

import java.util.Optional;

/**
 * 培训状态
 * @author jim
 * @date 2021/3/25 11:24
 */
public enum TrainStateEnum {

	// 1:未开始;2:进行中;3:已结束
	NOT_STARTED((byte) 1, "未开始"),

	PROCESSING((byte) 2, "进行中"),

	OVER((byte) 3, "已结束");

	private Byte	trainState;

	private String	desc;

	TrainStateEnum(Byte trainState, String desc) {
		this.trainState = trainState;
		this.desc = desc;
	}

	public Byte getTrainState() {
		return trainState;
	}

	public String getDesc() {
		return desc;
	}

	public static TrainStateEnum ofNullable(Byte trainState) {
		TrainStateEnum trainStateEnum = null;
		TrainStateEnum[] trainStateEnums = TrainStateEnum.values();
		for (TrainStateEnum stateEnum : trainStateEnums) {
			if (stateEnum.getTrainState().equals(trainState)) {
				trainStateEnum = stateEnum;
				break;
			}
		}
		return Optional.ofNullable(trainStateEnum).orElse(TrainStateEnum.NOT_STARTED);
	}
}
