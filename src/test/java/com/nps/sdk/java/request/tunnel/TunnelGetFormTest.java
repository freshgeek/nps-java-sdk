package com.nps.sdk.java.request.tunnel;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class TunnelGetFormTest extends BaseTest {

	@Test
	public void submit() {
		TunnelGetForm getForm = new TunnelGetForm();
		getForm.setId(1);
		System.out.println(getForm.submit(getConfig()));
	}

}
