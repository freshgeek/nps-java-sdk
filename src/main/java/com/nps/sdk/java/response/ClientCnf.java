package com.nps.sdk.java.response;

import lombok.Data;

/**
 * @author chenchao
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
@Data
public class ClientCnf {
	private String U;
	private String P;
	private boolean Compress;
	private boolean Crypt;
}
