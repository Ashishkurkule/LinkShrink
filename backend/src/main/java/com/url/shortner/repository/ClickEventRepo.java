package com.url.shortner.repository;

import com.url.shortner.dtos.ClickEventDTO;
import com.url.shortner.models.ClickEvent;
import com.url.shortner.models.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ClickEventRepo extends JpaRepository<ClickEvent,Long> {
    List<ClickEvent> findByUrlMappingAndClickDateBetween(
            UrlMapping urlMapping,
            LocalDateTime startDate,
            LocalDateTime endDate
    );
    List<ClickEvent> findByUrlMappingInAndClickDateBetween(
            List<UrlMapping> urlMappings,
            LocalDateTime startDate,
            LocalDateTime endDate
    );

}
