package com.example.mentoria.service

import com.example.mentoria.model.dto.ResultadoSimulacaoResponseDTO
import com.example.mentoria.model.dto.SimulacaoCreditoRequestDTO

interface ICreditoService {
    fun realizarSimulacao(simulacaoCreditoRequestDTO: SimulacaoCreditoRequestDTO): ResultadoSimulacaoResponseDTO
}