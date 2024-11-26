import  io.restassured.RestAssured; //импортируем некоторые классы фреймворка Rest Assured
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public  void testHelloWorld(){
      Response response = RestAssured
              .get("https://playground.learnqa.ru/api/hello")  //создаем get-запрос на адрес нашего API
              .andReturn();  //просим Rest Assured вернуть нам результат
        //в переменной response будет храниться результат ответа на запрос
      response.prettyPrint();  //распечатываем ответ в удобной для нас форме (JSON), для этого в Rest Assured есть спец функция Pretty Print
    }




}
