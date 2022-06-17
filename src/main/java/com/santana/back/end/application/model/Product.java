package com.santana.back.end.application.model;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Float preco;
    private String descricao;
    private String productIdentifier;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public static Product convert(ProductDTO productDTO){
        Product product = new Product();

        product.setNome(productDTO.getNome());
        product.setPreco(productDTO.getPreco());
        product.setDescricao(productDTO.getDescricao());
        product.setProductIdentifier(productDTO.getProductIdentifier());
        if(productDTO.getCategoryDTO() != null){
            product.setCategory((Category) com.santana.back.end.application.model.Category.convert
                    (productDTO.getCategoryDTO()));
        }

        return product;
    }
}
