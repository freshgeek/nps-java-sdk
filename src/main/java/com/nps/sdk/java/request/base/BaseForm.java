package com.nps.sdk.java.request.base;


import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.BaseResponse;
import lombok.Getter;
import lombok.ToString;

/**
 * @author chenchao
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "unused"})
@ToString
@Getter
public abstract class BaseForm {
	protected String url;
	protected Method method;

	public BaseForm(String url, Method method) {
		this.url = url;
		this.method = method;
	}

	/**
	 * 服务配置
	 *
	 * @param config 服务配置
	 * @return 返回参数
	 */
	public abstract BaseResponse submit(Config config);

	protected <T> T execute(Config config, TypeReference<T> type) {
		return BaseExecutor.execute(this, config, type);
	}

}
