package com.senai.produtos;

import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    private ProdutoRepository pr;

    public ProdutoController(ProdutoRepository pr) {
        this.pr = pr;
    }

    @GetMapping
    public List<Produto> getAll() {
        return this.pr.findAll();
    }

    @GetMapping("/searchName")
    public List<Produto> getAllByName(@RequestParam("nome") String nome) {
        return this.pr.findByNomeContainingIgnoreCase(nome);
    }

    @GetMapping("/searchDescription")
    public List<Produto> getAllByDescricao(@RequestParam("descricao") String descricao) {
        return this.pr.findByDescricaoContainingIgnoreCase(descricao);
    }

    @GetMapping("/searchCategory")
    public List<Produto> getAllByCategoria(@RequestParam("categoria") String categoria) {
        return this.pr.findByCategoriaContainingIgnoreCase(categoria);
    }

    @GetMapping("/searchCondicao")
    public List<Produto> getAllByCondicao(@RequestParam("condicao") String condicao) {
        return this.pr.findByCondicaoContainingIgnoreCase(condicao);
    }

    @GetMapping("/searchValue")
    public List<Produto> getAllByCondicao(@RequestParam(name = "minValor", required = false) Double minValor,
                                          @RequestParam(name = "maxValor", required = false) Double maxValor)
    {
        if (minValor == null) {
            minValor = 0.0;
        }
        if (maxValor == null) {
            maxValor = Double.MAX_VALUE;
        }

        return this.pr.findByValorBetween(minValor, maxValor);
    }
}



