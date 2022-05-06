package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//Login page,UserName Text Field
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}

	//Login page,Password TextField
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}

	//Login page,Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement pLogin;
	public WebElement getlogin()
	{
		return pLogin;
	}

	//Login page,Logout 
	private WebElement logoutLink;
	public WebElement getlogout()
	{
		return logoutLink;
	}

	//HOme page,Minimize FlyoutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Home page,Users click
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]")
	private WebElement User1;
	public WebElement getusersclick()
	{
		return User1;
	}

	//User page,Add user
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser1;
	public WebElement getadduser()
	{
		return adduser1;
	}

	//User page,firstname
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}

	//User page,lastname
	private WebElement lastName;
	public WebElement getlastname()
	{
		return lastName;
	}

	//User page,email id
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}

	//User page,login details,username
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername1()
	{
		return userDataLightBox_usernameField;
	}

	//login page,password
	private WebElement password;
	public WebElement getpassword1()
	{
		return password;
	}

	//login page,retype password
	private WebElement passwordCopy;
	public WebElement getretypepassword()
	{
		return passwordCopy;
	}
	//login page,create user click
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Create1;
	public WebElement getcreateuser1()
	{
		return Create1;
	}

	//Delete,in user name
	@FindBy(xpath="//span[text()='sr, demo2']")
	private WebElement popup;
	public WebElement getpopup()
	{
		return popup;

	}

	//Delete ,delete user
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser()
	{
		return userDataLightBox_deleteBtn;
	}

	//Delete ,delete user1
	@FindBy(xpath="//span[text()='sry, demo4']")
	private WebElement deleteu2; ;
	public WebElement getpopup2()
	{
		return deleteu2;
	}

	//Modify,in user name
	@FindBy(xpath="//span[text()='sry, demo3']")
	private WebElement popup1;
	public WebElement getpopup1()
	{
		return popup1;

	}
	//Modify,in first name
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFirstname()
	{
		return userDataLightBox_firstNameField;
	}

	//Modify,in saveschanges
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement Saveschanges;
	public WebElement getsaveschanges()
	{
		return Saveschanges;
	}

	//create customer,tasks
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")
	private WebElement tasksclick;
	public WebElement getTask()
	{
		return tasksclick;
	}

	//create customer,add user
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addcustomer;
	public WebElement getcustomer()
	{
		return addcustomer;
	}

	//create customer,new customer
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newcustomer;
	public WebElement getnewcustomer()
	{
		return newcustomer;
	}

	//create customer,enter cname
	private WebElement customerLightBox_nameField;
	public WebElement getentercustomer()
	{
		return customerLightBox_nameField;
	}

	//create customer,create customerclick
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement createcusclick;
	public WebElement getcreatecustomer()
	{
		return createcusclick;
	}

	//delete customer,settings
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement setting1;
	public WebElement getsetting1()
	{
		return setting1;
	}

	//delete customer,action
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
	private WebElement action1;
	public WebElement getsaction1()
	{
		return action1;
	}


	//delete customer,delete
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecl ;
	public WebElement getdeletecl()
	{
		return deletecl;
	}

	//delete customer,delete permanently
	private WebElement customerPanel_deleteConfirm_submitTitle ;
	public WebElement getdeletepermanent()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}

	// modify customer,description
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement modifydes;
	public WebElement getdescription()
	{
		return modifydes;
	}

	//modify customer,close
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement modifyclose;
	public WebElement getmodifyclose()
	{
		return modifyclose;
	}

	//create project,new project
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newproject;
	public WebElement getnewproject()
	{
		return newproject;
	}

	//create project,new project,enter project name	
	private WebElement projectPopup_projectNameField;
	public WebElement getenterproject()
	{
		return projectPopup_projectNameField;
	}

	//create project,new project,enter customername
	@FindBy(xpath="//*[@id=\'ext-gen141\']")
	private WebElement enterpcustomer;
	public WebElement getnewprojectcus1()
	{
		return enterpcustomer;
	}

	//create project,new project,enter create project
	private WebElement projectPopup_commitBtn;
	public WebElement getcreateproject1()
	{
		return projectPopup_commitBtn;
	}

	//modify project,setting
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement settings1;
	public WebElement getsettings()
	{
		return settings1;
	}

	//modify project,description
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement desc1;
	public WebElement getdesc1()
	{
		return desc1;
	}

	//modify project,close
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement closep1;
	public WebElement getclosep()
	{
		return closep1;
	}

	//delete project,setting2
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement settingp;
	public WebElement getsettingp()
	{
		return settingp;
	}

	//delete project,action
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement actionp;
	public WebElement getactionp()
	{
		return actionp;
	}

	//delete project,deleteclick
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement deletepro;
	public WebElement getdeletepro()
	{
		return deletepro;
	}

	//delete project,deletepermanently
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getdeletep()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}

	//create tasks,addnewtasks
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addtask;
	public WebElement getaddtask1()
	{
		return addtask;
	}

	//create task,create new task
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createnewtask;
	public WebElement getcreatenewtask()
	{
		return createnewtask;
	}

	//create task,task name
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement taskname;
	public WebElement gettaskname()
	{
		return taskname;
	}

	//create task,create task
	private WebElement createTasksPopup_commitBtn;
	public WebElement getcreatetask()
	{
		return createTasksPopup_commitBtn;
	}

	
	//delete task,view task
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
	private WebElement viewtask;
	public WebElement getviewtask1()
	{
		return viewtask;
	}

	//delete task,action
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")
		private WebElement actiontask;
		public WebElement getactiontask1()
		{
			return actiontask;
		}

		//delete task,delete task
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
		private WebElement deletetask;
		public WebElement getdeletetask()
		{
			return deletetask;
		}
		
	//delete task,deletepermanently
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getdeleteperm()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
}
