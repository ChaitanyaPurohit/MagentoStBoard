package com.magento.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "com.magento.stepdefinations", tags = "@ForSkeleton")
public class SkelRunner extends AbstractTestNGCucumberTests {

}
