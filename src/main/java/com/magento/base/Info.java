package com.magento.base;

import org.apache.commons.lang3.RandomStringUtils;

public interface Info {
	String randomFirstName = RandomStringUtils.randomAlphabetic(6);
	String randomEmail = RandomStringUtils.randomAlphanumeric(12).toUpperCase() + "@gmail.com";
	String randomPassword= RandomStringUtils.randomAlphanumeric(8)+"@@";
	String expectedUrl = "https://magento.softwaretestingboard.com/customer/account/";
}