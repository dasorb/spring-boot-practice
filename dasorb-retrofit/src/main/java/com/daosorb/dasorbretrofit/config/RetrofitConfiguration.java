package com.daosorb.dasorbretrofit.config;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenjie
 * @date 2020-08-13
 */
@Configuration
@RetrofitScan("com.daosorb.dasorbretrofit.client")
public class RetrofitConfiguration {

}
