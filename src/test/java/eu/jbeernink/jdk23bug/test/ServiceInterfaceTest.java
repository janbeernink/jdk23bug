package eu.jbeernink.jdk23bug.test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import eu.jbeernink.jdk23bug.ServiceImplementation;
import eu.jbeernink.jdk23bug.ServiceInterface;

class ServiceInterfaceTest {

	@Test
	void loadImplementation_returnsServiceImplementation() {
		ServiceInterface service = ServiceInterface.loadImplementation();

		assertInstanceOf(ServiceImplementation.class, service);
	}

	@Test
	void test_usesModulePath() {
		String modulePath = System.getProperty("jdk.module.path");

		assertNotNull(modulePath, "Module path should not be null.");
	}
}