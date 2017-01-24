package com.ibm.microservices.interconnect17.drinks;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.ibm.microservices.interconnect17.drinks.model.Drinks;

@RestController
@EnableConfigurationProperties
@ResponseBody
public class DrinksController {

    @Autowired
    private DrinksConfiguration config;

    @RequestMapping(method = RequestMethod.GET, path="/drinks", produces = "application/json")
    public Drinks getDrinksMenu() {
      Drinks local = new Drinks();
      local.setMenu(this.config.getMenu());
      local.setType(this.config.getType());
      return local;
    }


}
