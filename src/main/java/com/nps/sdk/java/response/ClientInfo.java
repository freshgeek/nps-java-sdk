package com.nps.sdk.java.response;

import lombok.Data;

/**
 * @author chenchao
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "SpellCheckingInspection"})
@Data
public class ClientInfo implements BaseResponse {

	private ClientCnf Cnf;
	private int Id;
	private String VerifyKey;
	private String Addr;
	private String Remark;
	private boolean Status;
	private boolean IsConnect;
	/**
	 * 带宽限制
	 */
	private int RateLimit;
	private ClientFlow Flow;
	private ClientRate Rate;
	private boolean NoStore;
	private boolean NoDisplay;
	private int MaxConn;
	private int NowConn;
	private String WebUserName;
	private String WebPassword;
	private boolean ConfigConnAllow;
	private int MaxTunnelNum;
	private String Version;

	@Data
	public static class ClientRate {
		private int NowRate;
	}

	@Data
	public static class ClientFlow {

		private int ExportFlow;
		private long InletFlow;
		private int FlowLimit;
	}

	@Data
	public static class ClientCnf {
		private String U;
		private String P;
		private boolean Compress;
		private boolean Crypt;
	}
}
