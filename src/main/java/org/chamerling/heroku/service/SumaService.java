package org.chamerling.heroku.service;

import javax.jws.WebService;

@WebService
public interface SumaService {
  public float sumar(float a, float b);
}
