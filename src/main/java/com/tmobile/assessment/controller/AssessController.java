package com.tmobile.assessment.controller;


import com.tmobile.assessment.model.*;
import com.tmobile.assessment.service.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sum")
@Api(tags = {"Assessment Controller"})
@SwaggerDefinition(info = @Info(title = "", version = "", description = "Driver Controller"))
public class AssessController {

    private AssessService assessService;

    public AssessController(AssessService assessService) {
        this.assessService = assessService;
    }

    @GetMapping
    @ApiOperation(value = "Returns String Response Entity (ping-pong)", nickname = "Ping")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "")})
    public String ping (){
        return "hello to your assessment ";
    }

    @GetMapping("/{a}/{b}")
    public String getSum(@PathVariable int a, @PathVariable int b){
        return a+b+"";
    }

    @GetMapping("/{a}/{b}")
    public NumberInfo getInfo(@PathVariable int a){

        return assessService.getInfo(a);
    }
}
