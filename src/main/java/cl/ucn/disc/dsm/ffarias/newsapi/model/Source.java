/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * FIC - DISC - UCN.
 *
 */

package cl.ucn.disc.dsm.ffarias.newsapi.model;

import com.github.slugify.Slugify;
import lombok.*;

import javax.persistence.Embeddable;

/**
 * The Source
 * @author Felipe Farias Espinoza
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Source {

    /**
     * The Slugify
     */
    private static final Slugify SLUGIFY = new Slugify();

    /**
     * The name of the source.
     */
    private String name;



    /**
     *
     * @return the id of the name.
     */
    public String getId(){
        return SLUGIFY.slugify(this.name);
    }

}
