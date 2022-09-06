package com.university.oktouserservice.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;

import java.io.IOException;

@Service
public class LotteryUtils {

    private final Web3j web3j;
    private TransactionManager transactionManager;

    @Autowired
    public LotteryUtils() {
//        web3j = Web3j.build(new HttpService("https://mainnet.infura.io/v3/7884bd4227954071acbf32a3fa656515"));
        web3j = Web3j.build(new HttpService("http://127.0.0.1:8546"));
//        transactionManager = new RawTransactionManager(
//                web3j,
//                getCredentialsFromPrivateKey()
//        );
    }

    public String getWeb3Version() {
        Web3ClientVersion web3ClientVersion = null;
        try {
            web3ClientVersion = web3j.web3ClientVersion().send();
        }catch (IOException e) {
            e.printStackTrace();
        }

        String web3ClientVersionString = web3ClientVersion.getWeb3ClientVersion();

        return web3ClientVersionString;
    }

}
