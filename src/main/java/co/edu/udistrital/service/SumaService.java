package co.edu.udistrital.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
@WebService

public interface SumaService {
  @WebResult(name="resultado")	
  public float sumar(@WebParam(name="a")float a,@WebParam(name="b") float b);
}
