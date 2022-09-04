package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.ClientInfo;
import com.nps.sdk.java.response.Result;
import lombok.Getter;

/**
 * 获取单个客户端信息
 *
 * @author chenchao
 */
@SuppressWarnings("SpellCheckingInspection")
@Getter
public class ClientGetForm extends BaseForm {
	Integer id;

	public ClientGetForm(Integer id) {
		super("/client/getclient/", Method.POST);
		this.id = id;
	}


	@Override
	public Result<ClientInfo> submit(Config config) {
		return super.execute(config, new TypeReference<Result<ClientInfo>>() {
		});
	}
}

