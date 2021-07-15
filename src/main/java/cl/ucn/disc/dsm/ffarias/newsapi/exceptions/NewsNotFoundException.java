/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * FIC - DISC - UCN.
 *
 */

package cl.ucn.disc.dsm.ffarias.newsapi.exceptions;

/**
 * News not Found: 404
 * @author Felip Farias Espinoza.
 */
public class NewsNotFoundException extends RuntimeException {

    /**
     * The Constructor
     *
     * @param message to use.
     */
    public NewsNotFoundException(String message) {
        super(message);
    }
}
