package com.bahrath.springcloud.controller;

import com.bahrath.springcloud.model.Coupon;
import com.bahrath.springcloud.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

    @Autowired
    private CouponRepository repository;

    @PostMapping(value = "/coupons")
    public Coupon create(@RequestBody  Coupon coupon) {
        return repository.save(coupon);
    }

    @GetMapping(value = "/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code")  String code) {
        return repository.findByCode(code);
    }
}
