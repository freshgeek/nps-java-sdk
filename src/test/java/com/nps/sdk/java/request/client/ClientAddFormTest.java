package com.nps.sdk.java.request.client;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class ClientAddFormTest extends BaseTest {

	@Test
	public void submit() {
		ClientAddForm addForm = new ClientAddForm();
		addForm.setLimit(10L);
		addForm.setConfig_conn_allow(0);
		addForm.setRate_limit(0L);
		addForm.setRemark("测试2");
		System.out.println(addForm.submit(getConfig()));
	}

}
