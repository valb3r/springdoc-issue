package com.valb3r.warehousee.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import java.util.Collection;

import static com.valb3r.warehousee.domain.Const.SEQUENCE;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    private Long id;

    @Length(min = 3)
    @NotBlank
    private String name;

    @Length(min = 3)
    @NotBlank
    private String description;

    private String categoriesList;

    @OneToMany(mappedBy = "product")
    private Collection<ProductItem> items;
}
