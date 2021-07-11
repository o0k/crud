package cn.o0k.mapper;

import cn.o0k.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张澎_9970
 * @date 2021.7.11 下午 10:41 星期日
 * @desc:
 */
@Mapper
@Repository
public interface TxyMapper {

    List<Stock> queryStocks();
}
