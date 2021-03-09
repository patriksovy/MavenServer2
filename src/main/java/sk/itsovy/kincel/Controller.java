package sk.itsovy.kincel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController

public class Controller {

    @RequestMapping("/hello")
    public String getHello(){
        return "Hi, do you like Jaba?";
    }

    @RequestMapping(path = "/hello/sk")
    public String getHelloSk(){
        return "Good morning. How are you today?";
    }
    @RequestMapping(path = "/time")
    public String currentTime(){
        return  new Date().toString();
    }

    @RequestMapping(path = "/hi/{username}")
    public String getHiWithName(@PathVariable String username){
        return "<h2> Hi "+username+". What are you robiš?</h2>";
    }

    @RequestMapping(path = "/hi/test")
        public String getHiTest(@PathVariable String username){
        return "<h2>This is a test page</h2>";
    }

}
