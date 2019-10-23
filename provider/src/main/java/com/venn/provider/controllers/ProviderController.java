package com.venn.provider.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dwf
 * @date 2019/10/22 21:20
 */

@RestController
@RefreshScope
public class ProviderController {

  @Value("${server.port}")
  private String port;

  @RequestMapping(value = "/hello")
  public String hello(@RequestParam String name) {
    return "hello:" + name + "!port:" + port;
  }
}
