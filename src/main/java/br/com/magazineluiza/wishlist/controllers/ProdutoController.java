package br.com.magazineluiza.wishlist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.magazineluiza.wishlist.domain.entity.Produto;
import br.com.magazineluiza.wishlist.domain.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService _produtoService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Produto> Create(@RequestBody Produto produto) {
        return new ResponseEntity<Produto>(_produtoService.Create(produto), HttpStatus.CREATED);
    }
}