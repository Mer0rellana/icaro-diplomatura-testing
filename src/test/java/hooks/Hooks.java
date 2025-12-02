package hooks;

import driverFactory.driverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void setUp(){
        driverFactory.getDriver();

    }

    @After
    public void tearDown(){
        driverFactory.quitDriver();
    }
}
