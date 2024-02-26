package com.sarita.flightreservation.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SecurityService {
	boolean login(String username,String password,HttpServletRequest request,HttpServletResponse response);

}
