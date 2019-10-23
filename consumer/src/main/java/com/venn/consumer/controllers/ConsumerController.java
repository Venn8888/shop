package com.venn.consumer.controllers;

import com.venn.consumer.feigns.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dwf
 * @date 2019/10/23 22:19
 */

@RestController
@RefreshScope
public class ConsumerController {

  @Value("${server.port}")
  private String port;

  @Autowired
  private ProviderService providerService;

  @RequestMapping(value = "/hello", method = RequestMethod.POST)
  public String hello(@RequestParam String name) {
    //TODO 明天继续
    return providerService.hello(name) + "!!consumer port is:" + port;
  }
}
