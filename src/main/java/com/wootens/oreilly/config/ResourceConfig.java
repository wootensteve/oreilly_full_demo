/**
 * 
 */
package com.wootens.oreilly.config;

import org.springframework.context.annotation.Configuration;

import com.wootens.oreilly.controller.invoiceController;

/**
 * @author
 *
 */
@Configuration
public class ResourceConfig extends org.glassfish.jersey.server.ResourceConfig {

	/**
	 * 
	 */
	public ResourceConfig() {
		super();
		registerClasses(invoiceController.class);
	}

}
