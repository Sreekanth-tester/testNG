package practiseTestNG;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestNG13 
{
	public ATUTestRecorder r;
	String vp;
	@BeforeMethod
	public void method1(Method m) throws Exception
	{
		Date dt=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		vp="org.magnitia.testNG\\target\\"+m.getName()+sf.format(dt);
		 r=new ATUTestRecorder(vp,false);  //false means no audio
		r.start();

	}
	@AfterMethod
	public void method() throws ATUTestRecorderException
	{
		r.stop();
	}
}
