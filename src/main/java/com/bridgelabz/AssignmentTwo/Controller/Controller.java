package com.bridgelabz.AssignmentTwo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    //////////////////// ::  UC-1  :: ////////////////////
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }

    //////////////////// ::  UC-2  :: ////////////////////
    @RequestMapping(value = "/queryparam", method = RequestMethod.GET)     //handle the all the Http request From User---need to define path and define method as get,post,put or delete
    public String message(@RequestParam(value = "name", defaultValue = "Bridgelabz") String name){
        return " Hello  "+ name;                                     //-->> localhost:8080/queryparam?message=<pass a String>
    }

    //////////////////// ::  UC-3  :: ////////////////////
    @RequestMapping(value = "/path/{name}", method = RequestMethod.GET)
    public String messageTwo(@PathVariable String name){     //pass the data on the url itself
        return "Hello " + name;                                     //-->> localhost:8080/path/<pass a String>
                                                         // when we have to pass a single value use Pathparam
    }
}
