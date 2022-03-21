package practiseTestNG;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestNG11 
{
	public ATUTestRecorder r;
	String vp;
	@BeforeClass
	public void method1(Method m) throws Exception
	{
		Date dt=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		vp="target\\"+m.getName()+sf.format(dt);
		 r=new ATUTestRecorder(vp,false);  //false means no audio
		r.start();

	}
	@AfterClass
	public void method() throws ATUTestRecorderException
	{
		r.stop();
	}
}
