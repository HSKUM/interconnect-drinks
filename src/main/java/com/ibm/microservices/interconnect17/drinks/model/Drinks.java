package com.ibm.microservices.interconnect17.drinks.model;

import java.util.List;
import java.util.ArrayList;

public class Drinks {

  private List<String> menu;

  private String type;

  public Drinks(){
    this.menu = new ArrayList<String>();
    this.type = "none";
  }

  public Drinks(List<String> menu, String type){
    this.menu = menu;
    this.type = type;
  }

  public void setMenu(List<String> menu){
    this.menu = menu;
  }

  public List<String> getMenu(){
    return this.menu;
  }

  public void setType(String type){
    this.type = type;
  }

  public String getType(){
    return this.type;
  }


}
