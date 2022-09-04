package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.StatusResult;
import lombok.Getter;

/**
 * @author chenchao
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "unused", "SpellCheckingInspection"})
@Getter
public class ClientChangeStatusForm extends BaseForm {
	Integer id;

	int status;

	public ClientChangeStatusForm(Integer id) {
		super("/client/changestatus/", Method.POST);
		this.id = id;
	}

	public void enable() {
		status = 1;
	}

	public void disable() {
		status = 0;
	}


	@Override
	public StatusResult submit(Config config) {
		return execute(config, new TypeReference<StatusResult>() {
		});
	}
}
