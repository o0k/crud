package cn.o0k.controller;

import cn.o0k.pojo.Stock;
import cn.o0k.service.TxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张澎_9970
 * @date 2021.7.11 下午 10:37 星期日
 * @desc:
 */
@RestController
public class TxyController {
    @Autowired
    private TxyService txyService;

    @GetMapping("txy")
    public List<Stock> queryStocks(){
        return txyService.queryStocks();
    }
}
