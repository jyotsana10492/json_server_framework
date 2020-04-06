package com.nginx_server.generics;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.BeforeSuite;

public class CommonLib {
private Object token;

	@BeforeSuite	
	public void config()	
	{
	baseURI ="http://localhost";

	port=3000;

	//given().auth().basic(userName, password);
	//given().auth().oauth2(token);





	}
		
		
		

	}


