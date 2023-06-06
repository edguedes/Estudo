package br.com.microservice.loja.loja.controller;

import br.com.microservice.loja.loja.dto.ShoppingDTO;
import br.com.microservice.loja.loja.service.ShoppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping")
@RequiredArgsConstructor
public class ShoppingController {

    private final ShoppingService shoppingService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void executeShopping(@RequestBody ShoppingDTO shopping) {
        shoppingService.executeShopping(shopping);
    }
}
