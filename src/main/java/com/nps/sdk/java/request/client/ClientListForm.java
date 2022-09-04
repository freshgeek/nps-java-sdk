package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.nps.sdk.java.request.base.ListForm;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenchao
 */
@ToString
@Getter
public class ClientListForm extends ListForm {
	@Setter
	String search;
	String order;

	public ClientListForm(int offset, int limit, String search, String order) {
		super("/client/list/", Method.POST, offset, limit);
		this.search = search;
		this.order = order;
	}
}
