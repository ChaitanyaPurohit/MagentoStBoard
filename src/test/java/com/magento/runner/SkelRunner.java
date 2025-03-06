package com.magento.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", glue = "com.magento.stepdefinations", plugin = {
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }) //, tags = "@Trial")
public class SkelRunner extends AbstractTestNGCucumberTests {

}
//
