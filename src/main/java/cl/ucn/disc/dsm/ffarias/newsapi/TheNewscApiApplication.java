/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * FIC - DISC - UCN.
 *
 */

package cl.ucn.disc.dsm.ffarias.newsapi;

import cl.ucn.disc.dsm.ffarias.newsapi.model.News;
import cl.ucn.disc.dsm.ffarias.newsapi.model.Source;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.ZonedDateTime;

/**
 * The NewsAPI Application.
 * @author Felipe Farías Espinoza.
 */
@SpringBootApplication
public class TheNewscApiApplication {

    /**
     * The News Repository to initialize the Database
     */
    @Autowired
    private NewsRepository newsRepository;

    /**
     * The Starting point.
     * @param args to use.
     */
    public static void main(final String[] args) {
        SpringApplication.run(TheNewscApiApplication.class, args);
    }

    @Bean
    protected InitializingBean initializingBean(){
        return () -> {
            newsRepository.save(News.builder()
                    .tittle("hola")
                    .description("hola")
                    .author("hola")
                    .content("hola hola")
                    .publishedAt(ZonedDateTime.now())
                    .source(new Source("hola"))
                    .url("hola")
                    .urlImage("hola")
                    .build()

            );
        };
    }

}
