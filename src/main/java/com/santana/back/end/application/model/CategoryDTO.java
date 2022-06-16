package com.santana.back.end.application.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CategoryDTO {

    @NotNull
    private Long id;
    private String nome;

    public static CategoryDTO convert(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());

        return categoryDTO;
    }
}
