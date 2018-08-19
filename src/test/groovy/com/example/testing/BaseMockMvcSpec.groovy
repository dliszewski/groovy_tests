package com.example.testing

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder
import spock.lang.Specification

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootTest(classes = TestingApplication.class)
abstract class BaseMockMvcSpec extends Specification {

    @Autowired
    AgreementController agreementController

    def setup() {
        StandaloneMockMvcBuilder standaloneMockMvcBuilder = MockMvcBuilders.standaloneSetup(agreementController)
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder)
    }

}
