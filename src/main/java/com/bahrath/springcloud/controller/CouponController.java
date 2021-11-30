package com.bahrath.springcloud.controller;

import com.bahrath.springcloud.model.Coupon;
import com.bahrath.springcloud.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/couponapi")
public class CouponController {

    @Autowired
    private CouponRepository repository;

    @RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public Coupon create(@RequestBody  Coupon coupon) {
        return repository.save(coupon);
    }

    @RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
    public Coupon getCoupon(@PathVariable("code")  String code) {
        return repository.findByCode(code);
    }
}
