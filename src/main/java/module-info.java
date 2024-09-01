import eu.jbeernink.jdk23bug.ServiceImplementation;
import eu.jbeernink.jdk23bug.ServiceInterface;

module eu.jbeernink.jdk23bug {

	uses ServiceInterface;
	provides ServiceInterface with ServiceImplementation;
}