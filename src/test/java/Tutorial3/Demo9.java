package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo9 {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";

		Response resp = RestAssured.given().get("/posts/2");

		System.out.println(resp.getBody().asString());
		
		String id = resp.jsonPath().getString("id");
		System.out.println(id);

		String fname = resp.jsonPath().getString("FirstName");
		System.out.println(fname);

		String lname = resp.jsonPath().getString("LastName");
		System.out.println(lname);

		String job = resp.jsonPath().getString("Job");
		System.out.println(job);

		String add = resp.jsonPath().getString("Address");
		System.out.println(add);

	}

}
