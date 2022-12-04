package com.kidsworld.demo.client.test.client

import com.kidsworld.demo.client.test.config.TestClientConfiguration
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
  name = "test",
  url = "\${demo.clients.test.endpoint:sample.com}",
  configuration = [TestClientConfiguration::class]
)
interface TestClient {
  @GetMapping("/test/{params}")
  fun requestDasSample(@PathVariable params: String): String
}
