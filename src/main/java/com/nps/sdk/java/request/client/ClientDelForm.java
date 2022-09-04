package com.nps.sdk.java.request.client;

import cn.hutool.http.Method;
import com.nps.sdk.java.request.base.BaseForm;
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

}
