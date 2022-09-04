package com.nps.sdk.java.request.client;

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
@ToString
public class ClientDelForm extends BaseForm {

	@Setter
	@Getter
	private Integer id;

	public ClientDelForm() {
		super("/client/del/", Method.POST);
	}

	public ClientDelForm(Integer id) {
		super("/client/del/", Method.POST);
		this.id = id;
	}


	@Override
	public StatusResult submit(Config config) {
		return execute(config, new TypeReference<StatusResult>() {
		});
	}
}
