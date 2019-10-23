package com.venn.consumer.hystrix;

import com.venn.consumer.feigns.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author dwf
 * @date 2019/10/23 22:25
 */
@Component
public class ProviderHystrix implements ProviderService {

  private static final String FAIL = "provider is fail!";
  @Override
  public String hello(String name) {
    return FAIL;
  }
}
