package org.chenche.service;

import java.util.Date;
import java.util.Random;

import org.chenche.LocalDatastoreTestCase;
import org.chenche.model.SigningLog;
import org.chenche.model.SigningLog.SignType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SigningServiceTest extends LocalDatastoreTestCase {

	private SigningService service;
	
	
	@Override
	public void setUp() {
		super.setUp();
		service  = new SigningService();
	}


	@Test
	public void test() {
		
		SigningLog data = new SigningLog();
		data.setId(new Random(System.currentTimeMillis()).nextLong());
		data.setUser("anUser");
		data.setType(SignType.IN);
		data.setDate(new Date(System.currentTimeMillis()));
		service.save(data );
	}

}
