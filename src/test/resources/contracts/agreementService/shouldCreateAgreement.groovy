package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.spec.internal.HttpMethods

Contract.make {
    request {
        method(HttpMethods.HttpMethod.POST)
        url '/agreements'
		headers {
			contentType('application/json')
		}	
        body([
                agreementNumber: '12345',
                bank           : 'ALIOR',
                acceptanceDate : '2018-01-25 00:00:00',
                creditAmount   : '2000',
                shopId         : 'C4'
        ])
    }
    response {
        status(201)
		headers {
			contentType('application/json')
		}
    }
}