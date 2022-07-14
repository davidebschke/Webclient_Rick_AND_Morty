package com.example.webclient_rick_and_morty;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/Characters")
public class ControllerRickAndMorty {



    @GetMapping("all")

    public void getAllC(){


        Webclientconfigure.getAllCharacters();

    }

    @GetMapping("live")

    public void getAliveCh(){

        Webclientconfigure.getAliveC();


    }

}
