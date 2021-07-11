package cn.o0k.service.impl;

import cn.o0k.mapper.TxyMapper;
import cn.o0k.pojo.Stock;
import cn.o0k.service.TxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张澎_9970
 * @date 2021.7.11 下午 10:39 星期日
 * @desc:
 */
@Service
public class TxyServiceImpl implements TxyService {
    @Autowired
    private TxyMapper txyDao;

    @Override
    public List<Stock> queryStocks() {
        return txyDao.queryStocks();
    }
}
