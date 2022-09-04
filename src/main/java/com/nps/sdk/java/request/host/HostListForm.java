package com.nps.sdk.java.request.host;

import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseListForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.HostListResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenchao
 */
@Getter
@ToString
public class HostListForm extends BaseListForm {


	@Setter
	private String search;

	public HostListForm(int offset, int limit) {
		super("/index/hostlist/", Method.POST, offset, limit);
	}

	@Override
	public HostListResult submit(Config config) {
		return execute(config, new TypeReference<HostListResult>() {
		});
	}
}
