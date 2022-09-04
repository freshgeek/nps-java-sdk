package com.nps.sdk.java.request.host;

import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.StatusResult;
import lombok.Getter;
import lombok.Setter;

/**
 * @author chenchao
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "SpellCheckingInspection"})
@Setter
@Getter
public class HostAddForm extends BaseForm {
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 域名
	 */
	private String host;
	/**
	 * 协议类型(三种 all http https)
	 */
	private String scheme;
	/**
	 * url路由 空则为不限制
	 */
	private String location;
	/**
	 * 客户端id
	 */
	private Integer client_id;
	/**
	 * 内网目标(ip:端口)
	 */
	private String target;
	/**
	 * request header 请求头
	 */
	private String header;
	/**
	 * request host 请求主机
	 */
	private String hostchange;

	public HostAddForm() {
		super("/index/addhost/", Method.POST);
	}

	@Override
	public StatusResult submit(Config config) {
		return execute(config, new TypeReference<StatusResult>() {
		});
	}
}
