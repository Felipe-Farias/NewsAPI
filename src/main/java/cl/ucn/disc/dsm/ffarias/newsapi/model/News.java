/*
 * Copyright (c) Felipe Farias Espinoza
 */

package cl.ucn.disc.dsm.ffarias.newsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Tables;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * The class.
 *
 * @author Felipe Farias Espinoza
 */
@Builder // The Builder pattern
@Getter // Al the fields has get
@NoArgsConstructor // Add empty constructor
@Entity // The JPA
public final class News {
    /**
     * unique id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    /**
     * The tittle.
     * Restrictions:
     *  - not null
     *  - size > 2
     */

    private  String tittle;

    /**
     * The source.
     */
    @Embedded
    private Source source;

    /**
     * The author.
     */

    private  String author;
    /**
     * The url.
     */

    private  String url;
    /**
     * the url image.
     */

    private  String urlImage;
    /**
     * The description.
     */

    private  String description;
    /**
     * the content.
     */

    private  String content;
    /**
     * the date of publish.
     */

    private  ZonedDateTime publishedAt;

    /**
     * The constructor.
     * @param id to use.
     * @param tittle to use.
     * @param source to use.
     * @param author to use.
     * @param url to use.
     * @param urlImage to use.
     * @param description to use.
     * @param content to use.
     * @param publishedAt to use.
     */
    public News(
                final Long id,
                final String tittle,
                final Source source,
                final String author,
                final String url,
                final String urlImage,
                final String description,
                final String content,
                ZonedDateTime publishedAt) {

        this.id=id;

        // Tittle replace
       this.tittle = ( tittle != null && tittle.length() > 0) ? tittle : "No tittle";


       //Source validation
       if(source == null ){
           throw new IllegalArgumentException("Source no valid");

       }
       if(source.getName().length() < 2){
           throw new IllegalArgumentException("Source size was < 2 [" + source.getName() + "]");
       }
        this.source = source;

       // Author
        this.author = (author != null && author.length() > 0) ? author : "No author";

        this.url = url;
        this.urlImage = urlImage;
        this.description = description;
        this.content = content;

        // publishedAt
        if(publishedAt == null){
            throw new IllegalArgumentException("The publishedAt needed!");
        }
        this.publishedAt = publishedAt;
    }
}
