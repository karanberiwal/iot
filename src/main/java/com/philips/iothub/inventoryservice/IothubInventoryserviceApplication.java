package com.philips.iothub.inventoryservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.philips.iothub1223111221122" })
public class IothubInventoryserviceApplication {

	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(IothubInventoryserviceApplication.class, args);
	}
}
