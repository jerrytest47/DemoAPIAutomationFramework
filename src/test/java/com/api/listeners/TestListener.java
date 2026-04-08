package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onStart(ITestContext context) {
        logger.info("========================================");
        logger.info("Test run started: {}", context.getName());
        logger.info("========================================");
    }

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("STARTED: {}.{}",
                result.getTestClass().getName(),
                result.getMethod().getMethodName());

        String description = result.getMethod().getDescription();
        logger.info("Description: {}", description != null ? description : "No description");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("PASSED: {}.{}",
                result.getTestClass().getName(),
                result.getMethod().getMethodName());

        logger.info("Duration: {} ms", getExecutionTime(result));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("FAILED: {}.{}",
                result.getTestClass().getName(),
                result.getMethod().getMethodName());

        logger.error("Duration: {} ms", getExecutionTime(result));

        if (result.getThrowable() != null) {
            logger.error("Failure reason:", result.getThrowable());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.warn("SKIPPED: {}.{}",
                result.getTestClass().getName(),
                result.getMethod().getMethodName());

        logger.warn("Duration: {} ms", getExecutionTime(result));
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("========================================");
        logger.info("Test run finished: {}", context.getName());
        logger.info("Passed: {}", context.getPassedTests().size());
        logger.info("Failed: {}", context.getFailedTests().size());
        logger.info("Skipped: {}", context.getSkippedTests().size());
        logger.info("========================================");
    }

    private long getExecutionTime(ITestResult result) {
        return result.getEndMillis() - result.getStartMillis();
    }
}