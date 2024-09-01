package eu.jbeernink.jdk23bug;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServiceInterfaceTest {

	@Test
	void loadImplementation_returnsServiceImplementation() {
		ServiceInterface service = ServiceInterface.loadImplementation();

		assertInstanceOf(ServiceImplementation.class, service);
	}
}