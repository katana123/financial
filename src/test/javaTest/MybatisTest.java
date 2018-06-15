package javaTest;

import com.alibaba.fastjson.JSON;
import com.wuhan.strongwell.Entity.fusers;
import com.wuhan.strongwell.Service.fusersService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
public class MybatisTest {
    private static Logger logger = Logger.getLogger(MybatisTest.class);
    @Resource
    private fusersService fusersService = null;

    @Test
    public void test1() {
        fusers fusers = fusersService.selectByPrimaryKey(1);
        logger.info(JSON.toJSONString(fusers));
    }
}
