package com.nps.sdk.java.request.client;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class ClientEditFormTest extends BaseTest {

	@Test
	public void submit() {
		ClientEditForm clientEditForm = new ClientEditForm(4);
		clientEditForm.setFlow_limit(20L);
		System.out.println(clientEditForm.submit(getConfig()));
	}
}
