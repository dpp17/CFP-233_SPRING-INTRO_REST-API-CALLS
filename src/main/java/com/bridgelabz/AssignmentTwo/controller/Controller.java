package com.bridgelabz.AssignmentTwo.controller;

import com.bridgelabz.AssignmentTwo.model.Person;
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

    //////////////////// ::  UC-4  :: ////////////////////
    @RequestMapping(value = "/body", method = RequestMethod.POST)
    public String messageThree(@RequestBody Person person){
        return person.toString();
    }

    //////////////////// ::  UC-5  :: ////////////////////
    /*Use PUT Request Method and pass first name as
 Path Variable and last name as Query Parameter*/
    @PutMapping("/put/{firstName}")
    public String put(@PathVariable String firstName,
                      @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
