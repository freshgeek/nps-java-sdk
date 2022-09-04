package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.nps.sdk.java.request.base.BaseForm;
import lombok.Getter;

/**
 * @author chenchao
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "unused"})
@Getter
public class ClientChangeStatusForm extends BaseForm {
	Long id;

	int status;

	public ClientChangeStatusForm(Long id) {
		super("/client/changestatus/", Method.POST);
		this.id = id;
	}

	public void enable() {
		status = 1;
	}

	public void disable() {
		status = 0;
	}

}
