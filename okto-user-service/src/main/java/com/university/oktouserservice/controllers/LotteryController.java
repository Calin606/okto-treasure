package com.university.oktouserservice.controllers;

import com.university.oktouserservice.utils.BlockchainUtils;
import com.university.oktouserservice.utils.LotteryUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/lottery")
@AllArgsConstructor
@CrossOrigin(origins="http://localhost:3000")
public class LotteryController {

    @Autowired
    private final LotteryUtils lotteryUtils;

    @GetMapping("/version")
    public String getVersion(){

        String web3ClientVersionString = lotteryUtils.getWeb3Version();
        return "Web3 client version: " + web3ClientVersionString;
    }

//    @GetMapping("/transfer")
//    public ResponseEntity<String> transferFunds() throws Exception {
//        return status(HttpStatus.OK).body(blockchainUtils.transferFunds());
//    }

}
