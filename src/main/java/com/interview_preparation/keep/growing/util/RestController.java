package com.interview_preparation.keep.growing.util;

import com.interview_preparation.keep.growing.SensexService;
import com.interview_preparation.keep.growing.util.dto.SensexData;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final SensexService bseSensexService;

    public RestController(SensexService bseSensexService) {
        this.bseSensexService = bseSensexService;
    }

    @GetMapping("/sensex")
    public Mono<List<SensexData>> getSensex() {
        System.out.println("sensex.....");
        return bseSensexService.getSensexData();
    }
}
