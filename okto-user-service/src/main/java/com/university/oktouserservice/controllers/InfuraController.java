//package com.university.oktouserservice.controllers;
//
//import com.university.oktouserservice.utils.BlockchainUtils;
//import com.university.oktouserservice.utils.InfuraUtils;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/infura")
//@AllArgsConstructor
//public class InfuraController {
//
//    @Autowired
//    private final InfuraUtils infuraUtils;
//
//    @GetMapping("/transaction")
//    public String getVersion() throws Exception {
//
//        String transferFunds = infuraUtils.transferFunds();
//        return transferFunds;
//
//    }
//
//}
