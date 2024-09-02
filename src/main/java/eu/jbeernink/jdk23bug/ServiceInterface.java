package eu.jbeernink.jdk23bug;

import java.util.ServiceLoader;

public interface ServiceInterface {

	static ServiceInterface loadImplementation() {
		System.out.println("Module path: " + System.getProperty("jdk.module.path"));
		return ServiceLoader.load(ServiceInterface.class)
		                    .findFirst()
		                    .orElseThrow();
	}
}
