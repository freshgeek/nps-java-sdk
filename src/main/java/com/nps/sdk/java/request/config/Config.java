package com.nps.sdk.java.request.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author chenchao
 */
@Getter
@AllArgsConstructor
public class Config {

	/**
	 * your key
	 */
	String serverKey;

	/**
	 * your server url
	 */
	String serverBaseUrl;
}
