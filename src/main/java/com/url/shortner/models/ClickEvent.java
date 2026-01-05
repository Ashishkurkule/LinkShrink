package com.url.shortner.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "click_event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClickEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime clickDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "url_mapping_id")
    private UrlMapping urlMapping;

    @PrePersist
    protected void onClick() {
        this.clickDate = LocalDateTime.now();
    }
}

