package com.sgtesting.pageobjrctmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnQ6MdfyProj {
	
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		ModifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{

			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.getAddingTask().click();
			Thread.sleep(2000);
			oPage.getAddNew().click();
			Thread.sleep(2000);
			oPage.getAddCustomer().click();
			Thread.sleep(2000);
			oPage.getEntCusNam().sendKeys("Bharath");
			Thread.sleep(2000);
			oPage.getConfCrtCustomer().click();
			Thread.sleep(2000);		
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	 }
	static void createProject()
	{
		try
		{
			oPage.getAddNew().click();
			Thread.sleep(2000);
			oPage.getAddingProject().click();
			Thread.sleep(2000);
			oPage.getProjectName().sendKeys("DHUDA Dept");
			oPage.getCnfrmProjectName().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void ModifyProject()
	{
		try
		{
			oPage.getModifyProject().click();
			Thread.sleep(2000);
			oPage.getModifyProjectRow().click();
			Thread.sleep(2000);
			oPage.getModifyProjectName().click();
			Thread.sleep(2000);
			oPage.getModifyProjectName().clear();
			Thread.sleep(2000);
			oPage.getModifyProjectName().sendKeys("Corporation Dept");
			oPage.getConfrmNewProjectName().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oPage.getDeleteProject().click();
			Thread.sleep(2000);
			oPage.getDeleteAction().click();
			Thread.sleep(2000);
			oPage.getSelectDelete().click();
			Thread.sleep(2000);
			oPage.getConfrimDelete().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
    {
   	 try
   	 {
   		oPage.getDeleteCustomer().click();
   		Thread.sleep(2000);
   		oPage.getDelCustomer().click();
   		Thread.sleep(2000);
   		oPage.getDelCust().click();
   		Thread.sleep(2000);
   		oPage.getPermDelete().click();
   		Thread.sleep(2000);
   		
   	 }catch(Exception e)
   	 {
   	   e.printStackTrace();
   	 }
    }
    static void logout()
		{
			try
			{
				oPage.getLogout().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void closeApplication()
		{
			try
			{
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
	

}
