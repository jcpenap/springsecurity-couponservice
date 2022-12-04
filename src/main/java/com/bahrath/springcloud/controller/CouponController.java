package com.bahrath.springcloud.controller;

import com.bahrath.springcloud.model.Coupon;
import com.bahrath.springcloud.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CouponController {

    @Autowired
    private CouponRepository couponRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/showCreateCoupon")
    public String showCreateCoupon() {
        return "createCoupon";
    }

    @PostMapping("/saveCoupon")
    public String save(Coupon coupon) {
        couponRepository.save(coupon);
        return "createResponse";
    }

}
