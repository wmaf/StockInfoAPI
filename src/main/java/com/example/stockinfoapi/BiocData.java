package com.example.stockinfoapi;


import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> fa39e2a (Initial commit)
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
<<<<<<< HEAD
public class BiocData {

    @GetMapping("/bioc")
    public Object bioceptStockData(RestTemplate restTemplate) {
        Object requestData = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=BIOC&interval=5min&apikey=WTOFGMVB6POLYQXC", Object.class);
                return requestData;
=======
//@RequestMapping("/nasa")  lets you get to /xxx without typing thr entire path over and over again.
public class BiocData {
    @GetMapping("/biocoverview")
    public Object overView(RestTemplate restTemplateA) {
        Object requestOverviewData = restTemplateA.getForObject("https://www.alphavantage.co/query?function=OVERVIEW&symbol=bioc&apikey=WTOFGMVB6POLYQXC", Object.class);
        return requestOverviewData;
    }
    @GetMapping("/biocstock")
    public Object bioceptStockData(RestTemplate restTemplate) {
        Object requestStockData = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=BIOC&interval=5min&apikey=WTOFGMVB6POLYQXC", Object.class);
                return requestStockData;
>>>>>>> fa39e2a (Initial commit)
    }
}
