package com.wmm.cnote.endpoint;

import com.wmm.cnote.aspect.WebLog;
import com.wmm.cnote.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CNoteEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger(CNoteEndpoint.class);

    @GetMapping("/test")
    @WebLog
    public ApiResponse test()
    {
        logger.info("hello world");
        return new ApiResponse();
    }
}
