package com.nps.sdk.java.response;

import lombok.Data;

import java.util.List;

/**
 * @author chenchao
 */
@Data
public class TunnelInfoResult implements BaseResponse {

	private int code;
	private Data data;

	@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "SpellCheckingInspection"})
	@lombok.Data
	public static class Data {

		private int Port;
		private boolean RunStatus;
		private String TargetAddr;
		private String LocalPath;
		private String HealthNextTime;
		private String Remark;
		private Target Target;
		private String StripPre;
		private int HealthMaxFail;
		private boolean NoStore;
		private Client Client;
		private String Password;
		private boolean Status;
		private int HealthCheckInterval;
		private String ServerIp;
		private String Mode;
		private String HttpHealthUrl;
		private String Ports;
		private String HealthCheckTarget;
		private int HealthCheckTimeout;
		private Flow Flow;
		private int Id;
		private String HealthCheckType;

		@lombok.Data
		public static class Target {

			private boolean LocalProxy;

			private List<String> TargetArr;
			/**
			 * 服务端端口
			 */
			private String TargetStr;
		}

		@lombok.Data
		public static class Client {

			private boolean Status;
			private boolean ConfigConnAllow;
			private Rate Rate;
			private String WebPassword;
			private String Addr;
			private String Remark;
			private Flow Flow;
			private String WebUserName;
			private int RateLimit;
			private int MaxConn;
			private String Version;
			private boolean IsConnect;
			private boolean NoStore;
			private boolean NoDisplay;
			private Cnf Cnf;
			private String VerifyKey;
			private int Id;
			private int NowConn;
			private int MaxTunnelNum;

			@lombok.Data
			public static class Rate {


				private int NowRate;
			}

			@lombok.Data
			public static class Cnf {

				private String P;
				private boolean Compress;
				private String U;
				private boolean Crypt;
			}

		}

		@lombok.Data
		public static class Flow {

			private int ExportFlow;
			private long InletFlow;
			private int FlowLimit;
		}
	}
}
