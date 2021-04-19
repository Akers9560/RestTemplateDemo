package com.akersman.demo;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Tests {

    @Test
    public void testGet() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "25bc41be6f5963b28634563f19f0ff3c");
        map.put("date", "4/19");
        String forObject = restTemplate
                .getForObject("http://v.juhe.cn/todayOnhistory/queryEvent.php?key={key}&date={date}", String.class, map);
        System.out.println(forObject);
    }

    @Test
    public void testGet2() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "6623b386bb2e0ce6f24bd969d4a571c8");
        map.put("page", "1");
        map.put("pagesize", "20");
        String forObject = restTemplate
                .getForObject("http://v.juhe.cn/joke/content/text.php?key={key}&page={page}&pagesize={pagesize}", String.class, map);
        System.out.println(forObject);
    }

}
