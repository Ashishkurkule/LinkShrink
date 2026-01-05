package com.url.shortner.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlMappingDTO {
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private String clickCount;
    private LocalDateTime createdDate;
    private String username;
}
