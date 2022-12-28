package Tutorial8;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000/posts";

		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");

		// Request Payload in JSON format
		JSONObject json = new JSONObject();

		json.put("FirstName", "Sangita");
		json.put("LastName", "Kadam");
		json.put("Job", "Asst Officer");
		json.put("Address", "Mumbai");

		// attach JSON body to request
		httpRequest.body(json.toString());

		Response resp = httpRequest.post();

		System.out.println(resp.jsonPath().getString("id"));

		System.out.println(resp.statusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().asString());

		System.out.println(resp.contentType());

		Headers allheader = resp.headers();

		for (Header abc : allheader) {
			System.out.println(abc.getName() + "" + abc.getValue());
		}
	}

}
	

