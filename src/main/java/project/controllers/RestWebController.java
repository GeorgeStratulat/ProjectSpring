package project.controllers;

/**
 * Created by George Stratulat on 18/04/2018.
 */

import java.util.ArrayList;
/**
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.models.LogTime;
import project.models.LogTimeRepository;

@RestController
@RequestMapping("/api/logtime")
public class RestWebController {

    @Autowired
    LogTimeRepository logrepo;

    @GetMapping(value = "/all")
    public LogTimeRepository getResource(){
        return logrepo;
    }

    @PostMapping(value="/save")
    public String postCustomer(@RequestBody List<LogTime> logtimes){
        cust.addAll(logtimes);
        return "Post Successfully!";
    }
}
*/