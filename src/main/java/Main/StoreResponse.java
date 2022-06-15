package Main;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StoreResponse {
	public static void Output(String routeAPI, String method, JSONObject contentRequest) {
		if(method.equals("POST")) {
			RequestSpecification request = given();
			request.header("Content-Type", "application/json");
			request.body(contentRequest.toJSONString());
			Response response = request.post(routeAPI);
			System.out.println("RESTful_API: " + baseURI + routeAPI);
			System.out.println("Status request: " + response.getStatusLine());
			System.out.println(response.getBody().asPrettyString());
		}
	}
}
