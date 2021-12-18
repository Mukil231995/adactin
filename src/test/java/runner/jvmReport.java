package runner;

import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;

public class jvmReport {
	
	public static void generateJvmReport(String jsonLoc) {

		File jvmPath=new File("E:\\Users\\mukil\\eclipse-workspace\\com.adactin\\output");
		
		List<String> li=new ArrayList<String>();
		li.add(jsonLoc);
		Configuration con=new Configuration(jvmPath, "Cucumber JVM Report");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("OS", "9 above");
		con.addClassifications("version", "96 above");
		con.addClassifications("Generated By","Mukil");
		
		ReportBuilder builder=new ReportBuilder(li, con);
		
		builder.generateReports();
		
		
		
	}

}
