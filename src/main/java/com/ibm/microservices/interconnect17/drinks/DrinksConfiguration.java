package com.ibm.microservices.interconnect17.drinks;

/**
 *  Patterned after https://github.com/aykutakin/SpringConfigurationPropertiesSample
 *  due to issues with YAML-formatted lists
 **/

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configuration
@ConfigurationProperties(prefix = "interconnect17.drinks")
public class DrinksConfiguration{

  private List<String> menu;

  @Value("${interconnect17.drinks.type}")
  private String type;

  DrinksConfiguration(){
	this.menu = new ArrayList<>();
    this.type = new String();
  }

  public List<String> getMenu(){
    return this.menu;
  }

  public String getType(){
    return this.type;
  }

}
