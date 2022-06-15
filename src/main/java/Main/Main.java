package Main;



import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.*;

import java.util.Scanner;
 
public class Main {
 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);

		baseURI = "https://auctions-app-2.herokuapp.com/api/"; 
//		RequestSpecification request = given();
		
//		System.out.println("Input the name: ");
//		String inputName = sc.nextLine();
//		System.out.println("Input the job: ");
//		String inputJob = sc.nextLine();
		

//		requestPrams.put("email", "thanh12345@gmail.com");
//		requestPrams.put("password", "123456");
		JSONObject requestPrams = new JSONObject();
		String select;		
		String key, value;
		int selt = 1;
		do {
			System.out.println("Enter 1 if Keep going on?...., else 0");
			select = sc.nextLine();
			selt = Integer.parseInt(select);
			if(selt == 0) break;
			System.out.println("Key: ");
			key = sc.nextLine();
			System.out.println("Value: ");
			value = sc.nextLine();
			requestPrams.put(key, value);
		}while(selt != 0);
			
		
		
//		request.header("Content-Type", "application/json");
//		request.body(requestPrams.toJSONString());
		
		System.out.println("RouteAPI: ");
		String routeAPI = sc.nextLine();
		System.out.println("Enter HTTP method: ");
		String method = sc.nextLine();
//		Response response = request.post(routeAPI);
//		System.out.println("RESTful_API: " + baseURI + routeAPI);
//		System.out.println("Status request: " + response.getStatusLine());
//		System.out.println(response.getBody().asPrettyString());
//		System.out.println("The content: " + response.prettyPrint());
//		Response response;
		
		StoreResponse.Output(routeAPI, method, requestPrams);
	 }
	
//	public static void Output(String routeAPI, String method, JSONObject contentRequest) {
//		if(method.equals("POST")) {
//			RequestSpecification request = given();
//			request.header("Content-Type", "application/json");
//			request.body(contentRequest.toJSONString());
//			Response response = request.post(routeAPI);
//			System.out.println("RESTful_API: " + baseURI + routeAPI);
//			System.out.println("Status request: " + response.getStatusLine());
//			System.out.println(response.getBody().asPrettyString());
//		}
//		
//		else if(method.equals("GET"))
	}
