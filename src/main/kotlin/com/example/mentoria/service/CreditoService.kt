package com.example.mentoria.service

import com.example.mentoria.model.dto.ResultadoSimulacaoResponseDTO
import com.example.mentoria.model.dto.SimulacaoCreditoRequestDTO
import org.springframework.stereotype.Service

@Service
class CreditoService: ICreditoService{
    override fun realizarSimulacao(simulacaoCreditoRequestDTO: SimulacaoCreditoRequestDTO):ResultadoSimulacaoResponseDTO {
        return ResultadoSimulacaoResponseDTO(1,"teste","mensagem");
    }
}