package spring.lyl.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lyl.springcloud.entities.CommonResult;

/**
 * @auther lyl
 * @create 2021-11-18 23:01
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2021, "自定义的限流处理信息......CustomerBlockHandler.....1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2021, "自定义的限流处理信息......CustomerBlockHandler......2");
    }
}
 
 
 
 

