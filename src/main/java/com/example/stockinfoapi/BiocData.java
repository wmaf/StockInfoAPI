package com.example.stockinfoapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@RequestMapping("/nasa")  lets you get to /xxxxx/... without typing thr entire path over and over again.
@RestController

public class BiocData {
    @GetMapping("/bioc")
    //String test = "BIOC";
    public Object bioceptStockData(RestTemplate restTemplate) {
        Object requestData = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=BIOC&interval=5min&apikey=WTOFGMVB6POLYQXC", Object.class);
        return requestData;
    }


    public class BiocOverView {
        @GetMapping("/biocoverview")
        public Object overView(RestTemplate restTemplateA) {
            Object requestOverviewData = restTemplateA.getForObject("https://www.alphavantage.co/query?function=OVERVIEW&symbol=bioc&apikey=WTOFGMVB6POLYQXC", Object.class);
            return requestOverviewData;
        }
    }
}