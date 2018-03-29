package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

import RTFrameWork.BaseTest;

public class ListnerClass1 extends BaseTest{

	public ListnerClass1(String browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}


	@Test
	public void test1()
	{
		Assert.assertEquals("Hii", "Hii");
	}
	

@Test
public void openSite()
{
	System.out.println("Opened The site");
}
}
