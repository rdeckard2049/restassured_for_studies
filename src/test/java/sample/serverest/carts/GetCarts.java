package sample.serverest.carts;

import commons.HandleProperties;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetCarts {

  @Test
  public void getCarts() {
    get(HandleProperties.getValue("APP_URL") + HandleProperties.getValue("ENDPOINT_CARTS"))
        .then()
        .statusCode(HttpStatus.SC_OK)
        .body("quantidade", equalTo(1));
  }
}