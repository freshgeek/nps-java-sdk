package com.nps.sdk.java.request.client;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class ClientGetFormTest extends BaseTest {

	@Test
	public void submit() {
		ClientGetForm form = new ClientGetForm(4);
		System.out.println(form.submit(getConfig()));
	}
}
