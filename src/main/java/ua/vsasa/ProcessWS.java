package ua.vsasa;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ProcessWS {
	@WebMethod
	boolean start(InputParameters inputParameters);

}
