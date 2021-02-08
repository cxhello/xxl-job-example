package com.cxhello.example.jobhandler;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cxhello
 * @create 2021/2/6
 */
@Component
public class ExampleXxlJob {

    private static Logger logger = LoggerFactory.getLogger(ExampleXxlJob.class);

    @Value("${server.port}")
    private int port;

    @XxlJob("testXxlJob")
    public void testXxlJob() {
        logger.info("XXL-JOB, Hello World, port: {}.", port);
    }

    @XxlJob("testXxlJobCluster")
    public void testXxlJobCluster() {
        logger.info("测试执行器集群指定执行器执行, port: {}.", port);
    }

}
