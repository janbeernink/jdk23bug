package eu.jbeernink.jdk23bug.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import eu.jbeernink.jdk23bug.ServiceImplementation;
import eu.jbeernink.jdk23bug.ServiceInterface;

class ServiceInterfaceTest {

	@Test
	void loadImplementation_returnsServiceImplementation() {
		ServiceInterface service = ServiceInterface.loadImplementation();

		assertInstanceOf(ServiceImplementation.class, service);
	}
}