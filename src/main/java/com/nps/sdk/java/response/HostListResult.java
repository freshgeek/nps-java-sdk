package com.nps.sdk.java.response;

import lombok.Data;

import java.util.List;

/**
 * @author chenchao
 */
@Data
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class HostListResult implements BaseResponse {

	private int total;
	private List<Rows> rows;

	@Data
	public static class Rows {
		private String Scheme;
		private String HeaderChange;
		private boolean IsClose;
		private String Host;
		private String Remark;
		private Flow Flow;
		private String HostChange;
		private Target Target;
		private String KeyFilePath;
		private String CertFilePath;
		private boolean NoStore;
		private int Id;
		private Client Client;
		private String Location;

		@Data
		public static class Flow {
			private int ExportFlow;
			private int InletFlow;
			private int FlowLimit;
		}

		@Data
		public static class Target {
			private boolean LocalProxy;
			private String TargetStr;
		}

		@Data
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

			@Data
			public static class Cnf {
				private String P;
				private boolean Compress;
				private String U;
				private boolean Crypt;
			}

			@Data
			public static class Rate {
				private int NowRate;
			}
		}
	}
}
