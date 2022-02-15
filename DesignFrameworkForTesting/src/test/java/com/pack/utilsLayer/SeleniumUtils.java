package com.pack.utilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.pack.BaseLayer.BaseFunction;

public class SeleniumUtils extends BaseFunction {
	

	public static void CaptureScreen(WebDriver driver ,String imageName) throws IOException{


		TakesScreenshot tc=(TakesScreenshot)driver; 

		File source=tc.getScreenshotAs(OutputType.FILE); 

		FileUtils.copyFile(source, new  File("src/main/resources/"+imageName+".png")); 
	}

}

