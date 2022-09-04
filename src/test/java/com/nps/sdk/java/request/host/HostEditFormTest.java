package com.nps.sdk.java.request.host;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class HostEditFormTest extends BaseTest {

	@Test
	public void testSubmit() {
		HostEditForm Submit = new HostEditForm(1);
		System.out.println(Submit.submit(getConfig()));
	}
}
