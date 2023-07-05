package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Createusertest {
@Test

	
	public void CreateUser() {
		baseURI ="https://reqres.in/";
		
		JSONObject j = new JSONObject();
		j.put("name", "ankush");
		j.put("job", "singerrr");
		
		
		
	//RestAssured.given().when().post("api/users").then().log().all();
	//RestAssured.given().body(j).contentType(ContentType.JSON).when().post("api/users").then().log().all();
	//RestAssured.given().contentType(ContentType.JSON).when().get("api/users/2").then().log().all();
		//RestAssured.given().body(j).contentType(ContentType.JSON).when().put("api/users/2").then().log().all();

		//RestAssured.given().body(j).contentType(ContentType.JSON).when().patch("api/users/2").then().log().all();
		RestAssured.given().contentType(ContentType.JSON).when().delete("api/users/2").then().log().all();

}
}
