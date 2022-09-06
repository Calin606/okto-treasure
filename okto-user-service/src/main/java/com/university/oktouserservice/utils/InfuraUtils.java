//package com.university.oktouserservice.utils;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.web3j.crypto.CipherException;
//import org.web3j.crypto.Credentials;
//import org.web3j.crypto.WalletUtils;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
//import org.web3j.protocol.core.methods.response.Web3ClientVersion;
//import org.web3j.protocol.exceptions.TransactionException;
//import org.web3j.protocol.http.HttpService;
//import org.web3j.tx.RawTransactionManager;
//import org.web3j.tx.Transfer;
//import org.web3j.utils.Convert;
//
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.util.logging.Logger;
//
//@Service
//public class InfuraUtils {
//
//    private final Web3j web3j;
//
////    private static final Logger log = (Logger) LoggerFactory.getLogger(InfuraUtils.class);
//
//    @Autowired
//    public InfuraUtils() {
//        web3j = Web3j.build(new HttpService("https://rinkeby.infura.io/v3/7884bd4227954071acbf32a3fa656515"));
//    }
//
//    public String getWeb3Version() {
//        Web3ClientVersion web3ClientVersion = null;
//        try {
//            web3ClientVersion = web3j.web3ClientVersion().send();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        String web3ClientVersionString = web3ClientVersion.getWeb3ClientVersion();
//
//        return web3ClientVersionString;
//    }
//
//    public String transferFunds() throws Exception {
//        Credentials credentials =
//                WalletUtils.loadCredentials(
//                        "TuvGamYup3476",
//                        "/home/sebastiangalan/.ethereum/testnet/keystore/UTC--2022-07-29T10-53-31.469327000Z--e8a6dab8106c5ce262c687c194c82b166c654632.json");
////        log.info("Credentials loaded");
//        System.out.println("Credentials loaded");
//
////        // FIXME: Request some Ether for the Rinkeby test network at https://www.rinkeby.io/#faucet
////        log.info("Sending 1 Wei ("
////                + Convert.fromWei("1", Convert.Unit.ETHER).toPlainString() + " Ether)");
//
//        System.out.println("Sending 1 Wei ("
//                + Convert.fromWei("1", Convert.Unit.ETHER).toPlainString() + " Ether)");
//        TransactionReceipt transferReceipt = Transfer.sendFunds(
//                        web3j, credentials,
//                        "0x3B58c8643804e0116B5CE05a4D67EF97A6502795",  // you can put any address here
//                        BigDecimal.ONE, Convert.Unit.WEI)  // 1 wei = 10^-18 Ether
//                .send();
////        log.info("Transaction complete, view it at https://rinkeby.etherscan.io/tx/"
////                + transferReceipt.getTransactionHash());
//
//        System.out.println("Transaction complete, view it at https://rinkeby.etherscan.io/tx/"
//                + transferReceipt.getTransactionHash());
//
//        return "Transaction with Infura completed";
//    }
//
//}
