package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.nps.sdk.java.response.ClientInfo;
import lombok.Getter;

/**
 * @author chenchao
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "unused", "SpellCheckingInspection"})
@Getter
public class ClientEditForm extends ClientAddForm {
	Integer id;

	public ClientEditForm(String remark, String u, String p, long limit, String vkey, Integer config_conn_allow, Integer compress, Integer crypt, Long rate_limit, Long flow_limit, Long max_conn, Long max_tunnel, Integer id) {
		super(remark, u, p, limit, vkey, config_conn_allow, compress, crypt, rate_limit, flow_limit, max_conn, max_tunnel);
		this.url = "/client/edit/";
		this.method = Method.POST;
		this.id = id;
	}

	public ClientEditForm(Integer id) {
		this.url = "/client/edit/";
		this.method = Method.POST;
		this.id = id;
	}

	public ClientEditForm(ClientInfo info) {
		this(info.getId());
		this.setRemark(info.getRemark());
		this.setU(info.getCnf().getU());
		this.setP(info.getCnf().getP());
		// ?条数
		this.setLimit(1000);
		this.setVkey(info.getVerifyKey());
		this.setConfig_conn_allow(info.getMaxConn());
		this.setCompress(info.getCnf().isCompress() ? 1 : 0);
		this.setCrypt(info.getCnf().isCrypt() ? 1 : 0);
		this.setRate_limit((long) info.getRateLimit());
		this.setFlow_limit((long) info.getFlow().getFlowLimit());
		this.setMax_conn((long) info.getMaxConn());
		this.setMax_tunnel((long) info.getMaxTunnelNum());
	}
}
