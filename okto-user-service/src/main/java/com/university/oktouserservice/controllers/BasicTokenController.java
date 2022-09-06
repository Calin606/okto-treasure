//package com.university.oktouserservice.controllers;
//
//import com.university.oktouserservice.utils.BasicTokenUtils;
//import com.university.oktouserservice.utils.InfuraUtils;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/basic_nft")
//@AllArgsConstructor
//public class BasicTokenController {
//
//    @Autowired
//    private final BasicTokenUtils basicTokenUtils;
//
//    @GetMapping("/deploy")
//    public String getVersion() throws Exception {
//
//        String basicToken = basicTokenUtils.deployBasicNft();
//        return basicToken;
//
//    }
//
//}
