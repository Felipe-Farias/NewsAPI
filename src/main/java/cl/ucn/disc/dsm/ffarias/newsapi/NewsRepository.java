/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * FIC - DISC - UCN.
 *
 */

package cl.ucn.disc.dsm.ffarias.newsapi;

import cl.ucn.disc.dsm.ffarias.newsapi.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The News Repository
 * @author Felipe Farias Espinoza
 */
@Repository
public interface NewsRepository extends JpaRepository<News, Long> {


}
