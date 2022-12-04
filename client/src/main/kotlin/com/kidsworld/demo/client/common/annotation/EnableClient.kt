package com.kidsworld.demo.client.common.annotation

import com.kidsworld.demo.client.common.config.FeignClientConfig
import org.springframework.context.annotation.Import

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Import(FeignClientConfig::class)
annotation class EnableClient()
