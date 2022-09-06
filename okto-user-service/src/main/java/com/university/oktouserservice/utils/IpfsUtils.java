//package com.university.oktouserservice.utils;
//
//import com.university.oktouserservice.contracts.nfts.ipfs.RandomIpfsNft;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.web3j.crypto.Credentials;
//import org.web3j.crypto.WalletUtils;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.http.HttpService;
//import org.web3j.tx.gas.ContractGasProvider;
//import org.web3j.tx.gas.DefaultGasProvider;
//
//@Service
//public class IpfsUtils {
//
//    private final Web3j web3j;
//
////    private static final Logger log = (Logger) LoggerFactory.getLogger(InfuraUtils.class);
//
//    @Autowired
//    public IpfsUtils() {
//        web3j = Web3j.build(new HttpService("https://rinkeby.infura.io/v3/7884bd4227954071acbf32a3fa656515"));
//    }
//
////    private void run() throws Exception {
////
////        Credentials credentials =
////                WalletUtils.loadCredentials(
////                        "TuvGamYup3476",
////                        "/home/sebastiangalan/.ethereum/testnet/keystore/UTC--2022-07-29T10-53-31.469327000Z--e8a6dab8106c5ce262c687c194c82b166c654632.json");
////
////        System.out.println("Credentials loaded");
////
////        // Now lets deploy a smart contract
////        System.out.println("Deploying smart contract");
////        ContractGasProvider contractGasProvider = new DefaultGasProvider();
////        RandomIpfsNft contract = RandomIpfsNft.deploy(
////                web3j,
////                credentials,
////                contractGasProvider,
////                "test"
////        ).send();
////
////        String contractAddress = contract.getContractAddress();
////        log.info("Smart contract deployed to address " + contractAddress);
////        log.info("View contract at https://rinkeby.etherscan.io/address/" + contractAddress);
////
////        log.info("Value stored in remote smart contract: " + contract.greet().send());
////
////        // Lets modify the value in our smart contract
////        TransactionReceipt transactionReceipt = contract.newGreeting("Well hello again").send();
////
////        log.info("New value stored in remote smart contract: " + contract.greet().send());
////
////        // Events enable us to log specific events happening during the execution of our smart
////        // contract to the blockchain. Index events cannot be logged in their entirety.
////        // For Strings and arrays, the hash of values is provided, not the original value.
////        // For further information, refer to https://docs.web3j.io/filters.html#filters-and-events
////        for (Greeter.ModifiedEventResponse event : contract.getModifiedEvents(transactionReceipt)) {
////            log.info("Modify event fired, previous value: " + event.oldGreeting
////                    + ", new value: " + event.newGreeting);
////            log.info("Indexed event previous value: " + Numeric.toHexString(event.oldGreetingIdx)
////                    + ", new value: " + Numeric.toHexString(event.newGreetingIdx));
////        }
////    }
//
//}
