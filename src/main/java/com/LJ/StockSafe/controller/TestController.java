package com.LJ.StockSafe.controller;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.Interval;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/pytest")
    public String pytest() throws IOException {
    
//        System.setProperty("python.import.site", "false"); // jython-standalone�� �ƴ� ��� site ��� ���� �ذ� ���
//    	Stock stock = YahooFinance.get("000660.KS");
    	Calendar from = Calendar.getInstance();
    	Calendar to = Calendar.getInstance();
    	from.add(Calendar.YEAR, -1); // from 5 years ago
    	Stock stock = YahooFinance.get("GOOG", from, to, Interval.DAILY);
    	
    	BigDecimal price = stock.getQuote().getPrice();
    	BigDecimal change = stock.getQuote().getChangeInPercent();
    	BigDecimal peg = stock.getStats().getPeg();
    	BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
    	 
    	//����, ��, �ð�, ����
    	stock.print();
	
        return "hello";
    }
}