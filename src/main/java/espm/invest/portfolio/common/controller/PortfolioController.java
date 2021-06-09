package espm.invest.portfolio.common.controller;

import espm.invest.portfolio.common.datatype.Portfolio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("portfolio-service")
public interface PortfolioController {
    @GetMapping("portfolio/{id}")
    Portfolio portfolio(String id);

    @GetMapping("portfolio")
    Portfolio portfolio();
}
