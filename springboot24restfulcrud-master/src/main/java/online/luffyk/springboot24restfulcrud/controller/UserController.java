package online.luffyk.springboot24restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @ResponseBody
    @RequestMapping(value = "hello123",method = RequestMethod.GET)
    public String hello(){
        return "hello，测试环境";
    }
}
