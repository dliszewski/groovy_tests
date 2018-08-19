package com.example.testing;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController(value = "/agreements")
public class AgreementController {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<AgreementDto> getAgreements() {

        AgreementDto dto = new AgreementDto("12345", "ALIOR",
                LocalDateTime.of(2018, 1, 25, 0, 0, 0).toString(),
                BigDecimal.valueOf(2000), "C4");
        List<AgreementDto>list = new ArrayList<>();
        list.add(dto);
        return list;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String createAgreement(@RequestBody AgreementDto agreementDto) {
        return "OK";
    }
}
