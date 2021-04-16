package com.idp.functionlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebDriverEventListenerClass extends AbstractWebDriverEventListener 

{
	
	long startTime, endTime;
	String pagename;

    @Override
     public void beforeNavigateTo(String arg0, WebDriver arg1) {
                  startTime = System.currentTimeMillis();
     }

     @Override
     public void afterNavigateTo(String arg0, WebDriver arg1) {

                endTime = System.currentTimeMillis();
                


      }

}
