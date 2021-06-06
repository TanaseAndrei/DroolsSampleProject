package com.andrei.drools.application.service;

import com.andrei.drools.domain.Order;
import lombok.AllArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MegaOfferService {

    private final KieSession kieSession;

    public Order process(Order order) {
        kieSession.insert(order);
        kieSession.fireAllRules();
        return order;
    }
}
