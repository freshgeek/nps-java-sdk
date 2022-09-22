package com.nps.sdk.java.response;

import lombok.Data;

import java.util.List;

/**
 * @author chenchao
 */
@Data
@SuppressWarnings("ALL")
public class ClientListResult implements BaseResponse {

	private int total;
	private int bridgePort;
	private String ip;
	private String bridgeType;
	private List<ClientListResultRow> rows;

	@Data
	public static class ClientListResultRow {

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
		public static class Flow {

			private int ExportFlow;
			private long InletFlow;
			private int FlowLimit;
		}

		@Data
		public static class Rate {

			private int NowRate;
		}
	}
}
