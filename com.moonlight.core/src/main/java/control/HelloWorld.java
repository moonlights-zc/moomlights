package control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(123);
        return "hello";
    }

}
