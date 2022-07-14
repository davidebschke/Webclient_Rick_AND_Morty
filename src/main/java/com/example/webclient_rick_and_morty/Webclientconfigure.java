package com.example.webclient_rick_and_morty;

import org.springframework.web.reactive.function.client.WebClient;

public class Webclientconfigure {

    private static WebClient webClient= WebClient.create("https://rickandmortyapi.com/api");


    public static void getAllCharacters() {
        RickAndMortyCharacterListResponse response = webClient.get()
                .uri("/character")
                .retrieve()
                .toEntity(RickAndMortyCharacterListResponse.class)
                .block()
                .getBody();

        System.out.println(response);
    }
    public static void getAliveC() {
        RickAndMortyCharacterListResponse responses = webClient.get()
                .uri("/character/status=Alive")
                .retrieve()
                .toEntity(RickAndMortyCharacterListResponse.class)
                .block()
                .getBody();

        System.out.println(responses);
    }



}


