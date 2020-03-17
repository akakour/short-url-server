package com.akakour.lab.controller;

import com.akakour.lab.util.Murmurs;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HandlerController {


    @GetMapping("/shotlink/v1/")
    public String shortConvert(@RequestParam("long_url") String longUrl, HttpRequest req) {
        // MurMur hash
        BigDecimal shortLink = Murmurs.hashUnsigned(longUrl);

        //进一步通过进制缩短长度,10进制转64进制

        //布隆过滤器进行排他,存在就加上Def，再次进行shortConvert

        //redis排他,存在就加上Def，再次进行shortConvert

        //存进redis

        return null;
    }

    @GetMapping("/longlink/v1/")
    public String longConvert(@RequestParam("short_url") String short_url, HttpRequest req) {
        //从redis拿取对应的长链
        return null;
    }
}
