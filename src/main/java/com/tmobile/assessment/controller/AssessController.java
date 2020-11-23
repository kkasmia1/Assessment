package com.tmobile.assessment.controller;


import com.tmobile.assessment.model.*;
import com.tmobile.assessment.service.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
@Api(tags = {"Assessment Controller"})
@SwaggerDefinition(info = @Info(title = "", version = "", description = "Driver Controller"))
public class AssessController {

    private AssessService assessService;

    @Autowired
    public AssessController(AssessService assessService) {
        this.assessService = assessService;
    }

    @GetMapping
    @ApiOperation(value = "Returns String Response Entity (ping-pong)", nickname = "Ping")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "")})
    public String ping (){
        return "hello to your assessment ";
    }

    @GetMapping(value = "/sum/{a}/{b}")
    public String getSum(@PathVariable int a, @PathVariable int b){
        return a+b+"";
    }

    @GetMapping(value = "/{a}")
    public NumberInfo getInfo(@PathVariable int a){

        return assessService.getInfo(a);
    }
}
