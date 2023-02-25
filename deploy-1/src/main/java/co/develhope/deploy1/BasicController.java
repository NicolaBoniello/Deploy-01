package co.develhope.deploy1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devname")
public class BasicController {

    @Value("${myCustomEnvs.devName}")
    private String myCustomEnv;

    @GetMapping
    public String devName(){
      return myCustomEnv;
    }
}