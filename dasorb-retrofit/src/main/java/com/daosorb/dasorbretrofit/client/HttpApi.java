package com.daosorb.dasorbretrofit.client;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import retrofit2.http.GET;
import retrofit2.http.Query;

import javax.xml.transform.Result;

/**
 * @author chenjie
 * @date 2020-08-13
 */
@RetrofitClient(baseUrl = "http://v.juhe.cn/")
public interface HttpApi {

    String appKey = "4422d363ea388fe241f4a222efcad653";

    /**
     *
     * 	top(头条，默认),shehui(社会),guonei(国内),guoji(国际),yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚
     *
     * @return
     */
    @GET("toutiao/index?key=" + appKey)
    Object get(@Query("type") String type);




}
