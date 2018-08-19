package com.example.testing

import groovy.transform.CompileStatic

import java.time.LocalDateTime

@CompileStatic
class SampleAgreementDto {

    static final Map SAMPLE_AGREEMENT_MAP = [
            "agreementNumber" : "2002",
            "bank": "ALIOR",
            "acceptanceDate" : LocalDateTime.of(2018, 03, 20, 10, 0),
            "creditAmount" : BigDecimal.valueOf(2345),
            "shopId" : "C4"
    ]

    static AgreementDto sampleAgreementDto(Map<String, Object> props = [:]) {

        //overriding defaults with custom props
        props = SAMPLE_AGREEMENT_MAP + props

        return AgreementDto.builder()
        .agreementNumber(props.agreementNumber as String)
        .bank(props.bank as String)
        .acceptanceDate(props.acceptanceDate as String)
        .creditAmount(props.creditAmount as BigDecimal)
        .shopId(props.shopId as String)
        .build()
    }
}