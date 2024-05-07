package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ maxTest.class, medianatest.class, mediaTest.class, minTest.class })
public class AllTests {

}
