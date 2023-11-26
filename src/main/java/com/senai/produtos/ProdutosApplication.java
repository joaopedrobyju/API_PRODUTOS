package com.senai.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@SpringBootApplication
public class ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

	@Bean
	CommandLineRunner criarProdutos(ProdutoRepository pr) {

		return args -> {
			pr.deleteAll();

			Produto p1 = new Produto(
					"Tênis Nike Azul",
					"Tênis Nike Azul muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					199.99);

			Produto p2 = new Produto(
					"Tênis Nike Branco",
					"Tênis Nike Branco muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					189.99);

			Produto p3 = new Produto(
					"Tênis Adidas Roxo",
					"Tênis Adidas Roxo muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					289.99);

			Produto p4 = new Produto(
					"Tênis Adidas Amarelo",
					"Tênis Adidas Amarelo muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					259.99);

			Produto p5 = new Produto(
					"Tênis All Star Violeto",
					"Tênis All Star Violeta muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					159.99);

			Produto p6 = new Produto(
					"Tênis All Star Vermelho",
					"Tênis All Star Vermelho muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					189.99);

			Produto p7 = new Produto(
					"Tênis All Star Verde",
					"Tênis All Star Verde muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					209.99);

			Produto p8 = new Produto(
					"Sandália Melissa",
					"Sandália Melissa Rosa muito linda",
					CategoriaEnum.SANDALIA.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					205.99
			);

			Produto p9 = new Produto(
					"Papete do Patati e Patata",
					"Papete do Patati e Patata muito linda",
					CategoriaEnum.SANDALIA.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					85.99
			);

			Produto p10 = new Produto(
					"Papete Vizano",
					"Papete Vizano muito linda",
					CategoriaEnum.SANDALIA.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					160.99
			);

			Produto p11 = new Produto(
					"Rasteirinha",
					"Rasteirinha muito confortável",
					CategoriaEnum.SANDALIA.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					69.99
			);

			Produto p12 = new Produto(
					"Chinelo Ipanema Branco",
					"Chinelo Ipanema muito barato",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					9.99
			);

			Produto p13 = new Produto(
					"Chinelo Ipanema Preto",
					"Chinelo Ipanema Preto muito barato",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					7.99
			);

			Produto p14 = new Produto(
					"Chinelo Havaiana colorido",
					"Chinelo Havaiana muito caro",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					57.99
			);

			Produto p15 = new Produto(
					"Chinelo Havaiana branco",
					"Chinelo Havaiana branco",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					87.99
			);

			Produto p16 = new Produto(
					"Chinelo Kenner",
					"Chinelo Kenner colorido",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					187.99
			);

			Produto p17 = new Produto(
					"Chinelo Rider",
					"Chinelo Rider Azul",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					47.99
			);

			Produto p18 = new Produto(
					"Chinelo Slide da Nike",
					"Chinelo Slide da Nike",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					199.99
			);

			Produto p19 = new Produto(
					"Chinelo Yezzy Slide",
					"Chinelo Yezzy Slide",
					CategoriaEnum.CHINELO.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					699.99
			);

			Produto p20 = new Produto(
					"Bota coturno preto",
					"Bota coturno preto",
					CategoriaEnum.BOTA.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					299.99
			);

			Produto p21 = new Produto(
					"Bota coturno marrom",
					"Bota coturno marrom",
					CategoriaEnum.BOTA.getCategoria(),
					CondicaoEnum.SEMINOVO.getStatus(),
					259.99
			);

			Produto p22 = new Produto(
					"Bota texana marrom",
					"Bota texana marrom",
					CategoriaEnum.BOTA.getCategoria(),
					CondicaoEnum.USADO.getStatus(),
					1259.99
			);

			Produto p23 = new Produto(
					"Sapatilha Moleca",
					"Sapatilha moleca marrom claro",
					CategoriaEnum.SAPATILHA.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					39.99
			);

			Produto p24 = new Produto(
					"Sapatilha Botero",
					"Sapatilha Botero marrom claro",
					CategoriaEnum.SAPATILHA.getCategoria(),
					CondicaoEnum.NOVO.getStatus(),
					89.99
			);

			pr.saveAll(Arrays.asList(p1, p2, p3, p4, p5,
					p6, p7, p8, p9, p10, p11, p12,
					p13, p14, p15, p16, p17, p18,
					p19, p20, p21, p22, p23, p24));
		};

	}
}




