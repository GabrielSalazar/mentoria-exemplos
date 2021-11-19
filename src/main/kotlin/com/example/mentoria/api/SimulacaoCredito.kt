package com.example.mentoria.api

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SimulacaoCredito {
    @GetMapping("v1/simulacao",produces = [MediaType.APPLICATION_JSON_VALUE])
    fun realizar(): ResponseEntity<String> {
        return ResponseEntity("1",HttpStatus.ACCEPTED)
    }
}