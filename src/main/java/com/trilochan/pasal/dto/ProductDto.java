package com.trilochan.pasal.dto;


import jdk.jfr.Category;
import lombok.Builder;

import java.util.UUID;

public record ProductDto(UUID id,String name, String description) {

    @Builder(toBuilder = true)
    public ProductDto{}
}
