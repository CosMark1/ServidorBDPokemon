package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PokemonController (private val pokemonRepository: PokemonRepository){

    @GetMapping("prueba1")
    fun Prueba1(){
        if
        println("Me han llamado")

    }

}