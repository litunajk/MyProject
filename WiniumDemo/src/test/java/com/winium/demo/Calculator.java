package com.winium.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calculator {

	public static void main(String[] args) throws Exception {
	 DesktopOptions option=new DesktopOptions();
	 option.setApplicationPath("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Accessories\\Calculator.lnk");
	 WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);
	Thread.sleep(3000);
	driver.findElementByName("7").click();
	driver.findElementByName("Add").click();
	driver.findElementByName("8").click();
	driver.findElementByName("Equals").click();
	String v=driver.findElementById("150").getAttribute("Name");
	 System.out.println(v);

	}

}
