package com.example.mentoria.service

import org.springframework.stereotype.Service

@Service
class CreditoService: ICreditoService{
    override fun realizarSimulacao(idProposta: Long):Long {
        return idProposta;
    }

}