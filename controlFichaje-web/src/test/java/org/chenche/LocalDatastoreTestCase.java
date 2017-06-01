package org.chenche;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public abstract class LocalDatastoreTestCase extends TestCase {
	 
    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig()
    		//.setNoStorage(false) si descomentamos esto guarda en fichero
    		//.setBackingStoreLocation("storagefilelocation")
    		);
 
    @Before
    public void setUp() {
        helper.setUp();
    }
 
    @After
    public void tearDown() {
        helper.tearDown();
    }
}