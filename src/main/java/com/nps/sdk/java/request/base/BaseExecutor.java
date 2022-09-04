package com.nps.sdk.java.request.base;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.config.Config;

import java.util.Map;


/**
 * 执行器
 * @author chenchao
 */
public class BaseExecutor {

	public static <T> T execute(BaseForm formBean, Config config, TypeReference<T> type) {
		Assert.notNull(formBean.getUrl(), "url is not null");
		Assert.notNull(formBean.getMethod(), "method is not null");
		Map<String, Object> form = BeanUtil.beanToMap(formBean);
		long time = System.currentTimeMillis() / 1000;
		form.put("timestamp", String.valueOf(time));
		form.put("auth_key", SecureUtil.md5(config.getServerKey() + time));
		if (formBean.getMethod() == Method.POST) {
			return JSON.parseObject(HttpUtil.createPost(config.getServerBaseUrl() + formBean.getUrl())
					.form(form).execute().body(), type);
		} else if (formBean.getMethod() == Method.GET) {
			return JSON.parseObject(HttpUtil.createGet(config.getServerBaseUrl() + formBean.getUrl()).form(form).execute().body(), type);
		}
		throw new RuntimeException("not support method ");
	}

}
