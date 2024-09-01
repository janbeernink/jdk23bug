package eu.jbeernink.jdk23bug;

import java.util.ServiceLoader;

public interface ServiceInterface {

	static ServiceInterface loadImplementation() {
		return ServiceLoader.load(ServiceInterface.class)
		                    .findFirst()
		                    .orElseThrow();
	}
}
