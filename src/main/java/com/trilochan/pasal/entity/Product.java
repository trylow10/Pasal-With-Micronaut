package com.trilochan.pasal.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
@Entity
@Table(name="Products")
public class Products implements Serializable {

    @Id
    private UUID id;

    @NotNull
    @Column(name="product_name")
    private String name;

    @NotNull
    @Column(name = "product_description")
    private String description;
}

