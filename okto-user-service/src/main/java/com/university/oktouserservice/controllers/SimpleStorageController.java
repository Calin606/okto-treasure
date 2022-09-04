package com.university.oktouserservice.controllers;

import com.university.oktouserservice.utils.BlockchainUtils;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/simplestorage")
@AllArgsConstructor
@CrossOrigin(origins="http://localhost:3000")
public class SimpleStorageController {

    @Autowired
    private final BlockchainUtils blockchainUtils;

    @GetMapping("/version")
    public String getVersion(){

        String web3ClientVersionString = blockchainUtils.getWeb3Version();
        return "Web3 client version: " + web3ClientVersionString;
    }

    @GetMapping("/transfer")
    public ResponseEntity<String> transferFunds() throws Exception {
        return status(HttpStatus.OK).body(blockchainUtils.transferFunds());
    }

    @GetMapping("/deploy")
    public ResponseEntity<String> deploySimpleStorage() throws Exception {
        return status(HttpStatus.OK).body(blockchainUtils.deploySimpleStorageContract());
    }

}
