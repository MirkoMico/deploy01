package co.DevelHopeHelloWorld.Deploy01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devNameController {
    @Value("${myCustomEnvs.devName}")
    String name;

    @GetMapping("/name")
    public String devName(){
        return name;
    }
}
