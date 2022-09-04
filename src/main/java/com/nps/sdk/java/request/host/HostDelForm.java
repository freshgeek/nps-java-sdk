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
public class HostDelForm extends BaseForm {

	/**
	 * 记录id
	 */
	private int id;

	public HostDelForm(int id) {
		super("/index/delhost/", Method.POST);
		this.id = id;
	}

	@Override
	public StatusResult submit(Config config) {
		return execute(config, new TypeReference<StatusResult>() {
		});
	}
}
