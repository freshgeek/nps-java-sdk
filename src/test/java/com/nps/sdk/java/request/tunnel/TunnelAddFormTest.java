package com.nps.sdk.java.request.tunnel;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class TunnelAddFormTest extends BaseTest {

	@Test
	public void submit() {
		TunnelAddForm addForm = new TunnelAddForm();
		addForm.setClient_id(2);
		addForm.setPort(9002);
		addForm.setType(TunnelType.tcp.name());
		addForm.setRemark("测试");
		System.out.println(addForm.submit(getConfig()));
	}
}
