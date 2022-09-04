package com.nps.sdk.java.request.host;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class HostAddFormTest extends BaseTest {

	@Test
	public void submit() {
		HostAddForm hostAddForm = new HostAddForm();
		hostAddForm.setRemark("测试");
		hostAddForm.setClient_id(6);
		System.out.println(hostAddForm.submit(getConfig()));
	}
}
