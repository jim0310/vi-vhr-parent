package com.five.monkey.vi.vhr.common.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * 自定义运行时异常
 * @author jim
 * @date 2021/3/27 10:01
 */
public class MyRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -483631010185689754L;

	public MyRuntimeException() {
		this(StringUtils.EMPTY);
	}

	public MyRuntimeException(String message) {
		super(message);
	}
}
