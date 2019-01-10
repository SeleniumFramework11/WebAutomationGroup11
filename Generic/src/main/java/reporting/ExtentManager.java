package reporting;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    private static ExtentReports extent;

    public synchronized static ExtentReports getInstance(){
        if(extent == null){
            extent = new ExtentReports(System.getProperty("user.dir")+"/Extent-Report/ExtentReport.html", true);
            extent.addSystemInfo("Group Name", "CoderClub").addSystemInfo("Environment","QA")
                    .addSystemInfo("Team Name", "GroupGreen");
        }
        return extent;
    }
}
