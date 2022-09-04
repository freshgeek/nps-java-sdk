package com.nps.sdk.java.request.tunnel;

import cn.hutool.core.lang.Assert;
import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.StatusResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenchao
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
@Getter
@Setter
@ToString
public class TunnelAddForm extends BaseForm {

	/**
	 * 类型tcp udp httpProxy socks5 secret p2p
	 */
	private String type;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 服务端端口
	 */
	private Integer port;
	/**
	 * 目标(ip:端口)
	 */
	private String target;
	/**
	 * 客户端id
	 */
	private Integer client_id;

	public TunnelAddForm() {
		super("/index/add/", Method.POST);
	}

	@Override
	public StatusResult submit(Config config) {
		Assert.notNull(getType(), "type not null ");
		TunnelType tunnelType = TunnelType.valueOf(getType());
		Assert.notNull(tunnelType, "type not  match TunnelType");
		return execute(config, new TypeReference<StatusResult>() {
		});
	}
}
