package com.nps.sdk.java.response;


import lombok.Data;

/**
 * @author chenchao
 */
@Data
public class Result<T> implements BaseResponse {
	private int code;
	private T data;
}
