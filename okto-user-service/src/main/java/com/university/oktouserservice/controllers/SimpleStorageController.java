package com.university.oktouserservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;

@RestController
@RequestMapping("/api/simplestorage")
@RequiredArgsConstructor
public class SimpleStorageController {

    private final Web3j web3j;

    @Autowired
    public SimpleStorageController() {
        web3j = Web3j.build(new HttpService("http://127.0.0.1:8546"));
    }

    @GetMapping("/version")
    public String getVersion(){
        Web3ClientVersion web3ClientVersion = null;
        try {
            web3ClientVersion = web3j.web3ClientVersion().send();
        }catch (IOException e) {
            e.printStackTrace();
        }

        String web3ClientVersionString = web3ClientVersion.getWeb3ClientVersion();
        return "Web3 client version: " + web3ClientVersionString;
    }

}
