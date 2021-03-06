package com.ivoronline.springboot_endpoint_annotation_postmapping.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @PostMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
