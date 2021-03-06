package espm.invest.portfolio.common.controller;

import espm.invest.portfolio.common.datatype.CurrencyTransaction;
import espm.invest.portfolio.common.datatype.Portfolio;
import espm.invest.portfolio.common.datatype.StockTransaction;
import espm.invest.portfolio.common.datatype.TransactionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("portfolio-service")
public interface PortfolioController {
    @GetMapping("portfolio/{id}")
    Portfolio portfolio(@PathVariable String id);

    @GetMapping("portfolio")
    List<Portfolio> portfolio();

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

    @PostMapping("portfolio/{idPortfolio}/currency/buy")
    CurrencyTransaction currencyBuy(
            @PathVariable String idPortfolio,
            @RequestBody TransactionBean bean
    );

    @PostMapping("portfolio/{idPortfolio}/currency/sell")
    CurrencyTransaction currencySell(
            @PathVariable String idPortfolio,
            @RequestBody TransactionBean bean
    );

}
