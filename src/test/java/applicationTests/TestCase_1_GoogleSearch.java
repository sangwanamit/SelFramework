package applicationTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import utility.Basetest;

public class TestCase_1_GoogleSearch extends Basetest{
 

  @Test (priority=1, description = "Open Google Search URL")	
  public void open_url() {
	  log.info("Test Case 1");
  }
  
  @Test (priority=2, description = "Click on first search option")	
  public void click_first_search_option() {
	  log.info("Test Case 2");
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  initLogs(this.getClass().getName().toString());
	  driver = initDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
