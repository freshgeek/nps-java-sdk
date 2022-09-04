package com.nps.sdk.java.request.host;

import com.nps.sdk.java.request.BaseTest;
import org.junit.Test;

public class HostDelFormTest extends BaseTest {

	@Test
	public void submit() {
		HostDelForm form = new HostDelForm(1);
		System.out.println(form.submit(getConfig()));
	}
}
