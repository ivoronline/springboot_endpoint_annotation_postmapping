package com.ivoronline.springboot_endpoint_annotation_postmapping.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // HELLO
  //================================================================
  @PostMapping("Hello")
  String hello() {
    return "Hello from Controller";
  }

}



