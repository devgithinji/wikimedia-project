package com.densoft;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "wikimedia_recentchange")
@Data
@NoArgsConstructor
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String wikiEventData;

    public WikimediaData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }
}
