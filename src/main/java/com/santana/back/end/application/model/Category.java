package com.santana.back.end.application.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="category")
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public static Category convert(CategoryDTO categoryDTO){
        Category category = new Category();

        category.setId(categoryDTO.getId());
        category.setNome(categoryDTO.getNome());

        return category;
    }
}
