package com.nginx_server.parser;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.BeforeSuite;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class NginxParser {
	
	public static String parseJson(String response,String key) {
		JsonElement jsonElement=new JsonParser().parse(response).getAsJsonObject().get(key);
		if (jsonElement !=null) {
			
			if (!jsonElement.isJsonNull() ) {
			return jsonElement.toString();
			
		}}
		return null;

		}
			
		public static String parseJsonArray(String response,String key,int index ) {
		JsonArray jsonArray=new JsonParser().parse(response).getAsJsonArray();
		return jsonArray.get(index).getAsString();
			
		}}
	


