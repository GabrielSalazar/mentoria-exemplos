package com.example.mentoria.api

import com.example.mentoria.model.dto.ResultadoSimulacaoResponseDTO
import com.example.mentoria.model.dto.SimulacaoCreditoRequestDTO
import com.example.mentoria.service.CreditoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import javax.websocket.server.PathParam

@Controller
class SimulacaoCreditoController @Autowired constructor(
    private val creditoService: CreditoService
){
    @GetMapping("v1/simulacao-credito",produces = [MediaType.APPLICATION_JSON_VALUE])
    fun realizar(simulacaoCreditoRequestDTO: SimulacaoCreditoRequestDTO): ResponseEntity<ResultadoSimulacaoResponseDTO> {

        return ResponseEntity(creditoService.realizarSimulacao(simulacaoCreditoRequestDTO),HttpStatus.ACCEPTED)
    }
}