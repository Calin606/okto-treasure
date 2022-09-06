//package com.university.oktouserservice.utils;
//
////import com.alibaba.fastjson.JSON;
////import net.sandboxol.support.deploy.*;
//import com.university.oktouserservice.contracts.nfts.ipfs.RandomIpfsNft;
//import org.web3j.crypto.Credentials;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
//import org.web3j.protocol.http.HttpService;
//import org.web3j.tx.RawTransactionManager;
//import org.web3j.tx.TransactionManager;
//import org.web3j.tx.gas.ContractGasProvider;
//import org.web3j.tx.gas.StaticGasProvider;
//import java.io.IOException;
//import java.math.BigInteger;
//import java.util.HashMap;
//import java.util.Map;
//
//import java.math.BigInteger;
//
//public class TokenUtils {
//
//    public static void main(String[]arg) throws Exception {
//
//// Private key , Used to deploy contracts , Will be consumed gas
//        String privateKey="0x3962281158193372293187638892977826627782389871655162191585611137";
//// Chain address , The chain to which the contract is deployed
//        String apiUrl="http://192.168.158.128:8545/";
//        String tokenName="bman";
//        String tokenSymbol="bman";
//        String supply="10000000000000000";
////10000000000000000000000000000000000
//// Deploy token
//        String tokenAddress = deployToken(apiUrl, privateKey, tokenName, tokenSymbol, supply);
//    }
//    /** * Deploy token * @param apiUrl Chain address * @param privateKey Deployer private key , To buckle gas Of * @param tokenName token The name of * @param tokenSymbol token accord with * @param supply Total number of issues , Numbers or hexadecimal * @throws Exception */
//    public static String deployToken(String apiUrl,String privateKey,String tokenName,String tokenSymbol,String supply) throws Exception {
//
//        System.out.println("------------------------deployToken start------------------------------");
//        Web3j web3j = Web3j.build(new HttpService(apiUrl));
//        TransactionManager transactionManager = getRawTransactionManager(web3j, privateKey);
//        ContractGasProvider contractGasProvider = getContractGasProvider();
//        RandomIpfsNft token = RandomIpfsNft.deploy(web3j, transactionManager, contractGasProvider, tokenName, tokenSymbol,new BigInteger(supply)).send();
////0xbbbdd7d07d194b9be54bbae21c892b138c8f6cfd
//        System.out.println("token：contract::"+token.getContractAddress());
//        BigInteger totalSupply = token.totalSupply().send();
//        System.out.println("totalSupply:::"+totalSupply);
//        System.out.println("------------------------deployToken done------------------------------");
//        return token.getContractAddress();
//    }
//    private static Credentials getCredentials (String privateKey) {
//
//        return Credentials.create(privateKey);
//    }
//    private static TransactionManager getRawTransactionManager(Web3j web3j,String privateKey) throws IOException {
//
//        BigInteger chainId = web3j.ethChainId().send().getChainId();
//        return new RawTransactionManager(web3j, getCredentials(privateKey),chainId.longValue());
//    }
//    private static ContractGasProvider getContractGasProvider(){
//
//        return n
//
//}
