package com.five.monkey.vi.vhr.common.vo.base;

/**
 * 接口返参基础包裹类
 * @author jim
 * @date 2021/3/25 12:00
 */
public class BaseResponseVo<T> {

	private int		code;

	private String	message;

	private T		data;

	public BaseResponseVo() {
		this(200);
	}

	public BaseResponseVo(int code) {
		this(code, null);
	}

	public BaseResponseVo(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
