package services;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

import cucumber.runtime.junit.Assertions;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;


public class GithubAPItest {


	@Test
	public void getAPIRequest() {
		Response response = given()
				.header("Content-type", "application/json")
				.header("Authorization", "Token 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")
				.and()
				.when()
				.get("https://api.github.com/users/gholmes86/events")
				.then()
				.extract().response();

		assertEquals(200, response.statusCode());

		System.out.println(response.asPrettyString());
	}



}