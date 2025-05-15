package com.interview_preparation.keep.growing;

import com.interview_preparation.keep.growing.util.dto.SensexData;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@org.springframework.stereotype.Service
public class SensexService {

    private final WebClient webClient;

    public SensexService() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.bseindia.com")
                .defaultHeader("Accept", MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader("User-Agent", "Mozilla/5.0") // Important to bypass blocking
                .build();
    }

    public Mono<List<SensexData>> getSensexData() {
        try {
            return webClient.get()
                    .uri("/RealTimeBseIndiaAPI/api/GetSensexData/w?code=16")
                    .retrieve()
                    .bodyToFlux(SensexData.class)
                    .collectList();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
