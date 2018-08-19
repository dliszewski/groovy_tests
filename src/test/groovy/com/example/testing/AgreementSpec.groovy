package com.example.testing

import spock.lang.Specification

import static com.example.testing.SampleAgreementDto.sampleAgreementDto

class AgreementSpec extends Specification{

    def "check this out"(){
        given: "new agreement is prepared"
        AgreementDto agreement1 = sampleAgreementDto()
        AgreementDto agreement2 = sampleAgreementDto(bank: "WBK", creditAmount: 1756)
        when:
        int result = 2 + 2
        then:
        result == 4
        agreement1["bank"] == "ALIOR"
        agreement1["creditAmount"] == BigDecimal.valueOf(2345)
        agreement2["bank"] == "WBK"
        agreement2["creditAmount"] == BigDecimal.valueOf(1756)
    }
}