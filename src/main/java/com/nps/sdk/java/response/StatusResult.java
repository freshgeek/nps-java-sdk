package com.nps.sdk.java.response;

import lombok.Data;

/**
 * @author chenchao
 */
@Data
public class StatusResult implements BaseResponse {
	private String msg;
	private int status;

	public boolean success() {
		return status == 1;
	}
}
