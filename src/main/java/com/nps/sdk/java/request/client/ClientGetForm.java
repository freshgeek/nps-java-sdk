package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.nps.sdk.java.request.base.BaseForm;
import lombok.Getter;

/**
 * 获取单个客户端信息
 */
@Getter
public class ClientGetForm extends BaseForm {
	Long id;

	public ClientGetForm(Long id) {
		super("/client/getclient/", Method.POST);
		this.id = id;
	}
}

