package com.nps.sdk.java.request;

import com.nps.sdk.java.request.config.Config;
import lombok.Getter;

public class BaseTest {
	// for example:
	// test
	// http://8.219.160.234:8080
	@Getter
	Config config = new Config("your key", "http://8.219.160.234:8080");

}
