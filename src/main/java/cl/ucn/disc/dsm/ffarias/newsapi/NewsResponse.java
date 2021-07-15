/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * FIC - DISC - UCN.
 *
 */

package cl.ucn.disc.dsm.ffarias.newsapi;

import cl.ucn.disc.dsm.ffarias.newsapi.model.News;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * The response of our API.
 *
 * @author Felip Farias Espinoza.
 */
@Builder
@Getter
public final class NewsResponse {

    /**
     * The Status
     */
    private final String status;

    /**
     * The result size
     */
    private final int totalResult;

    /**
     * The News (Articles)
     */
    private final List<News> articles;


}
