package com.hms.paymentservice.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Tag(name = "Payment Service", description = "Payment Service APIs")
@RestController
@RequestMapping("/api/v1")
public class MainRestController {

    @PostMapping("/getPaymentStatus")
    public ResponseEntity<Boolean> getPaymentStatus(@RequestBody UUID bookingId) throws InterruptedException {
        Thread.sleep(20000);

        return ResponseEntity.ok(true);
    }
}
