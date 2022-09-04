package com.nps.sdk.java.response;

import lombok.Data;

/**
 * @author chenchao
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
@Data
public class ClientFlow {

	private int ExportFlow;
	private long InletFlow;
	private int FlowLimit;
}
