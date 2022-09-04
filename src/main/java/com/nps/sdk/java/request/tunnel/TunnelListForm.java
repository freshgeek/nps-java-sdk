package com.nps.sdk.java.request.tunnel;

import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseListForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.BaseResponse;
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
public class TunnelListForm extends BaseListForm {
	/**
	 * 穿透隧道的客户端id
	 */
	private Integer client_id;
	/**
	 * 类型tcp udp httpProxy socks5 secret p2p
	 */
	private String type;
	/**
	 * 搜索
	 */
	private String search;

	public TunnelListForm(int offset, int limit) {
		super("/index/gettunnel/", Method.POST, offset, limit);
	}

	@Override
	public BaseResponse submit(Config config) {
		System.out.println(execute(config, new TypeReference<String>() {
		}));
		return null;
	}
}
