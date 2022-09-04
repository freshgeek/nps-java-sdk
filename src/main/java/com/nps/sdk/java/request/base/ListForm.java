package com.nps.sdk.java.request.base;


import cn.hutool.http.Method;
import lombok.Getter;
import lombok.Setter;

/**
 * @author chenchao
 */
@Getter
public abstract class ListForm extends BaseForm {

	/**
	 * 当前分页 0开始
	 */
	@Setter
	int offset;

	int limit;

	public ListForm(String url, Method method, int offset, int limit) {
		super(url, method);
		this.offset = offset;
		this.limit = limit;
	}
}
