package com.nps.sdk.java.request.base;


import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.config.Config;
import lombok.Data;

/**
 * @author chenchao
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "unused"})
@Data
public abstract class BaseForm {
	protected String url;
	protected Method method;

	public BaseForm(String url, Method method) {
		this.url = url;
		this.method = method;
	}

	public String execute(Config config) {
		return execute(config, new TypeReference<String>() {
		});
	}

	public <T> T execute(Config config, TypeReference<T> type) {
		return BaseExecutor.execute(this, config, type);
	}

}
