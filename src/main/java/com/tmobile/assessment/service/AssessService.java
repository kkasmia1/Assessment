package com.tmobile.assessment.service;

import com.tmobile.assessment.model.*;
import org.springframework.web.bind.annotation.*;

public class AssessService {

    public NumberInfo getInfo(@PathVariable int a){
        NumberInfo ni = new NumberInfo();
        ni.setNum(a);
        if(a%2==0){
         ni.setIsEven("is even") ;
        }else{
            ni.setIsEven("is odd") ;
        }
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
            // condition for nonprime number
            if (a % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            ni.setIsPrime("this number is a prime number");
        }else {
            ni.setIsEven("Not a prime ");
        }


        return ni;
    }
}
