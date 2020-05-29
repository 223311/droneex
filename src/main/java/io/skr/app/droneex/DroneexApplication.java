package io.skr.app.droneex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DroneexApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroneexApplication.class, args);
	}

}

@RestController
class HelloController{
	@GetMapping("/hello")
	public String sayHello(){
		return "Hello Guest!!! v14";
	}
}
