package com.nps.sdk.java.request.tunnel;

import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.TunnelInfoResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenchao
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
@Setter
@ToString
public class TunnelGetForm extends BaseForm {

	private Integer id;

	public TunnelGetForm() {
		super("/index/getonetunnel/", Method.POST);
	}

	@Override
	public TunnelInfoResult submit(Config config) {
		return execute(config, new TypeReference<TunnelInfoResult>() {
		});
	}
}
