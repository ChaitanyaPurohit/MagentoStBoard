package com.magento.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "com.magento.stepdefinations")
public class SkelRunner extends AbstractTestNGCucumberTests {

}


//, tags = "@ForSkeleton"