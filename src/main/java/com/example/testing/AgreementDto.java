package com.example.testing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AgreementDto {

    private String agreementNumber;
    private String bank;
    private String acceptanceDate;
    private BigDecimal creditAmount;
    private String shopId;
}
