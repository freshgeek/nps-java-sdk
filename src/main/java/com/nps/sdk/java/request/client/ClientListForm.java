package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.base.BaseListForm;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.ClientListResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenchao
 */
@ToString
@Getter
public class ClientListForm extends BaseListForm {
	@Setter
	String search;
	String order;

	public ClientListForm(int offset, int limit, String search, String order) {
		super("/client/list/", Method.POST, offset, limit);
		this.search = search;
		this.order = order;
	}


	@Override
	public ClientListResult submit(Config config) {
		return super.execute(config, new TypeReference<ClientListResult>() {
		});
	}
}
