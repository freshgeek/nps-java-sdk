package com.nps.sdk.java.request.client;

import com.alibaba.fastjson.TypeReference;
import com.nps.sdk.java.request.config.Config;
import com.nps.sdk.java.response.ClientInfo;
import com.nps.sdk.java.response.Result;
import org.junit.Test;

public class ClientListFormTest {

	@Test
	public void execute() {
		ClientListForm listForm = new ClientListForm(0, 10, null, "desc");
		// for example:
			// test
			// http://8.219.160.234:8080
		Config config = new Config("your key", "your base url");
		System.out.println(listForm.execute(config));
	}

	@Test
	public void testExecute() {
		ClientListForm listForm = new ClientListForm(0, 10, null, "desc");
		// for example:
			// test
			// http://8.219.160.234:8080
		Config config = new Config("your key", "your base url");
		listForm.execute(config,new TypeReference<Result<ClientInfo>>(){});
	}
}
