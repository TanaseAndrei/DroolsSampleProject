package com.andrei.drools.application.api;

import com.andrei.drools.application.service.MegaOfferService;
import com.andrei.drools.domain.Order;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MegaOfferController {

    private final MegaOfferService megaOfferService;

    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order) {
        return megaOfferService.process(null);
    }
}
