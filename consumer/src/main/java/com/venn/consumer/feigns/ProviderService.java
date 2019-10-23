package com.venn.consumer.feigns;

import com.venn.consumer.hystrix.ProviderHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dwf
 * @date 2019/10/23 22:23
 */

@FeignClient(value = "provider",fallback = ProviderHystrix.class)
public interface ProviderService {

  @RequestMapping(value = "/hello")
  String hello(@RequestParam String name);
}
