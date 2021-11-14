package com.univeristy.oktopropertyaccessservice.controller;

import com.univeristy.oktopropertyaccessservice.beans.PropertyAccessBean;
import com.univeristy.oktopropertyaccessservice.beans.PropertyAccessValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {

    @Autowired
    PropertyAccessBean propertyAccessBean;

    @GetMapping("/accessPropertyFile")
    public PropertyAccessValue accesPropertyFile(){
        return new PropertyAccessValue(propertyAccessBean.getName(),
                propertyAccessBean.getDescription());
    }
}
