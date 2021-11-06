package com.sgtesting.pageobjrctmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//Users 
	@FindBy(xpath ="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement oUsers;
	public WebElement getUsers()
	{
		return oUsers;
	}
	//For Adding User
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement oAddUser;
	public WebElement getAddusers()
	{
	    return oAddUser;	
	}
	//For First name
	private WebElement firstName;
	public WebElement getFirstname()
	{
		return firstName;
	}
	//For Last Name
	private WebElement lastName;
	public WebElement getLastname()
	{
		return lastName;
	}
	//For Mail id
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
	//For User name
	private WebElement userDataLightBox_usernameField;
	public WebElement getUsername()
	{
		return userDataLightBox_usernameField;
	}
	//for Password
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	//for RtPassword
	private WebElement passwordCopy;
	public WebElement getRtpassword()
	{
		return passwordCopy;
	}
	//for CreateUser
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement CreateUser;
	public WebElement getCreateUser()
	{
		return CreateUser;
	}
	//for deleteUser
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	private WebElement deleteUser;
	public WebElement getdeleteUser()
	{
		return deleteUser;
	}
	//for DeleteUser
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement DeleteUser;
	public WebElement getDeleteUser()
	{
		return DeleteUser;
	}
	//For ModifyUser
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	private WebElement ModifyUser;
	public WebElement getModifyUser()
	{
		return ModifyUser;
	}
	//For NameModify
	private WebElement userDataLightBox_firstNameField;
	public WebElement getchangedname()
	{
		return userDataLightBox_firstNameField;
	}
	//For NameChange
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement NameChange;
	public WebElement getNameChange()
	{
		return NameChange;
	}
	//For AddingTask
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
	private WebElement AddingTask;
	public WebElement getAddingTask()
	{
		return AddingTask;
	}
	//For AddNew
    @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
    private WebElement AddNew;
    public WebElement getAddNew()
    {
    	return AddNew;
    }
    //For AddCustomer
    @FindBy(xpath="/html/body/div[14]/div[1]")
    private WebElement AddCustomer;
    public WebElement getAddCustomer()
    {
    	return AddCustomer;
    }
    //For EnteringCusName
    private WebElement customerLightBox_nameField;
    public WebElement getEntCusNam()
    {
    	return customerLightBox_nameField;
    }
    //For ConfCrtCustomer
    @FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
    private WebElement ConfCrtCustomer;
    public WebElement getConfCrtCustomer()
    {
    	return ConfCrtCustomer;
    }
    //For DeleteCustomer
    @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
    private WebElement DeleteCustomer ;
    public WebElement getDeleteCustomer()
    {
    	return DeleteCustomer;
    }
    //For DelCustomer
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
    private WebElement DelCustomer ;
    public WebElement getDelCustomer()
    {
    	return DelCustomer;
    }
    //For DelCust
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
    private WebElement DelCust;
    public WebElement getDelCust()
    {
    	return DelCust;
    }
    //For PermDelete
    @FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
    private WebElement PermDelete;
    public WebElement getPermDelete()
    {
    	return PermDelete;
    }
	//For ModifyofCustomer
    @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
    private WebElement ModifyofCustomer ;
    public WebElement getModifyofCustomer()
    {
    	return ModifyofCustomer;
    }
	//For EditingName
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
    private WebElement nameLabel;
    public WebElement getnameLabel()
    {
    	return nameLabel;
    }
    
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
    private WebElement nameInput ;
    public WebElement getnameInput()
    {
    	return nameInput;
    }
	//For ConfirmingModify
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
    private WebElement closeButton ;
    public WebElement getcloseButton()
    {
    	return closeButton;
    }
    //For AddingProject
    @FindBy(xpath="/html/body/div[14]/div[2]")
    private WebElement AddingProject ;
    public WebElement getAddingProject()
    {
    	return AddingProject;
    }
    //For ProjectName
    private WebElement projectPopup_projectNameField ;
    public WebElement getProjectName()
    {
    	return projectPopup_projectNameField;
    }
    //For EntProjectName
    @FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
    private WebElement EntProjectName ;
    public WebElement getCnfrmProjectName()
    {
    	return EntProjectName;
    }
    //For DeleteProject
    @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
    private WebElement DeleteProject ;
    public WebElement getDeleteProject()
    {
    	return DeleteProject;
    }
    //For DeleteAction
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
    private WebElement DeleteAction ;
    public WebElement getDeleteAction()
    {
    	return DeleteAction;
    }
    //For SelectDelete
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
    private WebElement SelectDelete ;
    public WebElement getSelectDelete()
    {
    	return SelectDelete;
    }
    //For ConfrimDelete
    @FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")
    private WebElement ConfrimDelete ;
    public WebElement getConfrimDelete()
    {
    	return ConfrimDelete;
    }
  //For ModifyProject
    @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
    private WebElement ModifyProject ;
    public WebElement getModifyProject()
    {
    	return ModifyProject;
    }
  //For ModifyProjectRow
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
    private WebElement ModifyProjectRow ;
    public WebElement getModifyProjectRow()
    {
    	return ModifyProjectRow;
    }
  //For ModifyProjectName
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
    private WebElement ModifyProjectName ;
    public WebElement getModifyProjectName()
    {
    	return ModifyProjectName;
    }
  //For ConfrmNewProjectName
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
    private WebElement ConfrmNewProjectName ;
    public WebElement getConfrmNewProjectName()
    {
    	return ConfrmNewProjectName;
    }
    //For NewTask
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
    private WebElement NewTask ;
    public WebElement getNewTask()
    {
    	return NewTask;
    }
    //For CreateTask
    @FindBy(xpath="/html/body/div[13]/div[1]")
    private WebElement CreateTask ;
    public WebElement getCreateTask()
    {
    	return CreateTask;
    }
    //For TaskInserting
    @FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
    private WebElement TaskInserting ;
    public WebElement getTaskInserting()
    {
    	return TaskInserting;
    }
    //For TaskConfirming
    @FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
    private WebElement TaskConfirming ;
    public WebElement getTaskConfirming()
    {
    	return TaskConfirming;
    }
    //For DeletingTask
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
    private WebElement DeletingTask ;
    public WebElement getDeletingTask()
    {
    	return DeletingTask;
    }
    //For DeletingAction
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
    private WebElement DeletingAction ;
    public WebElement getDeletingAction()
    {
    	return DeletingAction;
    }
    //For TaskDelete
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
    private WebElement TaskDelete ;
    public WebElement getTaskDelete()
    {
    	return TaskDelete;
    }
  //For TaskDeletecnfrm
    @FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")
    private WebElement TaskDeletecnfrm ;
    public WebElement getTaskDeletecnfrm()
    {
    	return TaskDeletecnfrm;
    }
    
    
    
    
    
}


	