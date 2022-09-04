package com.nps.sdk.java.request.client;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class ClientChangeStatusFormTest extends BaseTest {

	@Test
	public void submit() {
		ClientChangeStatusForm clientChangeStatusForm = new ClientChangeStatusForm(3);
		System.out.println(clientChangeStatusForm.submit(getConfig()));
	}
}
