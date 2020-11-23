package com.tmobile.assessment.service;

import com.tmobile.assessment.model.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Service
public class AssessService {

    public NumberInfo getInfo(@PathVariable int a){
        NumberInfo ni = new NumberInfo();
        ni.setNum(a);
        if(a%2==0){
         ni.setIsOdd("is not odd");
        }else{
            ni.setIsEven("is not even ") ;
        }
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            ni.setIsPrime("Not a prime ");
        }


        return ni;
    }
}
