package com.nps.sdk.java.request.client;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class ClientDelFormTest extends BaseTest {

	@Test
	public void submit() {
		ClientDelForm clientDelForm = new ClientDelForm(4);
		System.out.println(clientDelForm.submit(getConfig()));
	}
}
