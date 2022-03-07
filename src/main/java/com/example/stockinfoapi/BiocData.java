package com.example.stockinfoapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BiocData {

    @GetMapping("/bioc")
    public Object bioceptStockData(RestTemplate restTemplate) {
        Object requestData = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=BIOC&interval=5min&apikey=WTOFGMVB6POLYQXC", Object.class);
                return requestData;
    }
}
