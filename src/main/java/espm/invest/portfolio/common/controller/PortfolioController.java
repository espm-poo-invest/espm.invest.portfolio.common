package espm.invest.portfolio.common.controller;

import espm.invest.portfolio.common.datatype.Portfolio;
import espm.invest.portfolio.common.datatype.StockTransaction;
import espm.invest.portfolio.common.datatype.TransactionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("portfolio-service")
public interface PortfolioController {
    @GetMapping("portfolio/{id}")
    Portfolio portfolio(String id);

    @GetMapping("portfolio")
    Portfolio portfolio();

    @PostMapping("portfolio")
    Portfolio create(@RequestBody Portfolio portfolio);

    @PostMapping("portfolio/{idPortfolio}/stock/buy")
    StockTransaction stockBuy(
            @PathVariable String idPortfolio,
            @RequestBody TransactionBean bean
    );

    @PostMapping("portfolio/{idPortfolio}/stock/sell")
    StockTransaction stockSell(
            @PathVariable String idPortfolio,
            @RequestBody TransactionBean bean
    );

}
