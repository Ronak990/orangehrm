package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

public class CustomListners implements ITestListener {

    // This belongs to iTestListners and will execute before starting of the test set/batch
    @Override
    public void onStart(ITestContext arg) {
        System.out.println("Start Test Execution......"+arg.getName());
    }

    // This belongs to iTestListners and will execute after starting of the test set/batch
    public void onFinish(ITestContext arg) {
        System.out.println("Starts Test Execution......"+arg.getName());
    }

    // This belongs to iTestListners and will execute before the main test starts i.e @Test

    public void onTestStart(ITestResult arg0) {
        System.out.println("Starts Test ......"+arg0.getName());
    }

    // This belongs to iTestListners and will execute when test is skipped
    public void onTestSkipped(ITestResult arg0) {
        System.out.println("Skipped Test ......"+arg0.getName());
    }

    // This belongs to ITestListners and will execute test is passed
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("Passed Test ......"+arg0.getName());
    }

    // This belongs to ITestListners and will execute test is failed
    public void onTestFailure(ITestResult arg0) {
        System.out.println("Failed Test ......"+arg0.getName());
    }

    // Not so important... ignore this as of now
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){

        //TODO auto generated method STUb
    }
}
