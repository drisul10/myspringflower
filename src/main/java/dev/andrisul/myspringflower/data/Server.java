package dev.andrisul.myspringflower.data;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {

    public void start() {
        log.info("Starting server");
    }

    public void stop() {
        log.info("Stopping server");
    }

    @PostConstruct
    public void startWithPostConstruct() {
        log.info("Starting server ^withPostConstruct");
    }

    @PreDestroy
    public void stopWithPreDestroy() {
        log.info("Stopping server ^withPreDestroy");
    }
}
