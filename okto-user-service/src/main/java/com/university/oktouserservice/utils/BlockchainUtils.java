package com.university.oktouserservice.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class BlockchainUtils {

    private final Web3j web3j;
    private TransactionManager transactionManager;

    private final String PRIVATE_KEY = "2e954785cfc7c57d2cf2cf478a072081bdfe33dd0a12dd66126a0c04be070be3";

    private final BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
    private final BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);

    private final String RECIPIENT = "0xca0b79896dd8618444b783CaBC426A6450d9135D";

    private final String CONTRACT_ADDRESS = "0xc85e718dc1f586fd43741bc1d88fc710dc3015a5";

    @Autowired
    public BlockchainUtils() {
        web3j = Web3j.build(new HttpService("http://127.0.0.1:8546"));
        transactionManager = new RawTransactionManager(
                web3j,
                getCredentialsFromPrivateKey()
        );
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

    public Credentials getCredentialsFromWallet() throws CipherException, IOException {
        Credentials credentials = WalletUtils.loadCredentials(
                "passphrase",
                "wallet/path"
        );
        return credentials;
    }

    public Credentials getCredentialsFromPrivateKey() {
        return Credentials.create(
                PRIVATE_KEY
        );
    }

    public String transferFunds() throws Exception {

        Transfer transfer = new Transfer(web3j, transactionManager);

        TransactionReceipt transactionReceipt = transfer.sendFunds(RECIPIENT, BigDecimal.ONE,
                Convert.Unit.ETHER,GAS_PRICE,GAS_LIMIT).send();

        System.out.println("Transaction = " + transactionReceipt.getTransactionHash());

        return "Transaction made successfuly";
    }

}
