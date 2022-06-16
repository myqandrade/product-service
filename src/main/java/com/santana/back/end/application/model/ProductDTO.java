package com.santana.back.end.application.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String nome;
    private Float preco;
    private String descricao;
    private String productIdentifier;

    public static ProductDTO convert(Product product){
        ProductDTO productDTO = new ProductDTO();

        productDTO.setNome(product.getNome());
        productDTO.setPreco(product.getPreco());
        productDTO.setDescricao(product.getDescricao());
        productDTO.setProductIdentifier(product.getProductIdentifier());

        return productDTO;
    }
}
