package com.nps.sdk.java.request.client;

import com.alibaba.fastjson.JSON;
import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class ClientListFormTest extends BaseTest {

	@Test
	public void submit() {
		ClientListForm listForm = new ClientListForm(0, 10, null, "desc");
		System.out.println(JSON.toJSONString(listForm.submit(getConfig())));
	}
}
