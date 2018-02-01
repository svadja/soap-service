package ua.vsasa;

import javax.jws.WebService;

@WebService(
		endpointInterface = "spring_service.for_generate.ProcessWS",
		serviceName = "processService",
		portName = "processPort",
		targetNamespace = "ua.vsasa"
		)
public class ProcessWSImpl implements ProcessWS{

	public boolean start(InputParameters inputParameters) {
		// TODO Auto-generated method stub
		return false;
	}

}
