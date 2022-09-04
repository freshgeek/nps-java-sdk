package com.nps.sdk.java.request.host;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class HostListFormTest extends BaseTest {

	@Test
	public void submit() {
		HostListForm form = new HostListForm(0, 10);
		form.setSearch("");
		System.out.println(form.submit(getConfig()));
	}
}
