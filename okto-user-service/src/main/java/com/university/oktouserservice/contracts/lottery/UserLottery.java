package com.university.oktouserservice.contracts.lottery;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class UserLottery extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b03191633179055600160025561058c806100376000396000f3fe6080604052600436106100915760003560e01c806368a02c451161005957806368a02c45146101735780638da5cb5b146101955780639d37f238146101b5578063dbdff2c1146101bd578063e580f47b146101d257600080fd5b806312065fe014610096578063281d098d146100b857806346d97a26146101065780634810bc591461013c5780635d495aea1461015c575b600080fd5b3480156100a257600080fd5b50475b6040519081526020015b60405180910390f35b3480156100c457600080fd5b506100ee6100d3366004610491565b6000908152600360205260409020546001600160a01b031690565b6040516001600160a01b0390911681526020016100af565b34801561011257600080fd5b506100ee610121366004610491565b6003602052600090815260409020546001600160a01b031681565b34801561014857600080fd5b506100ee610157366004610491565b6101e8565b34801561016857600080fd5b50610171610212565b005b34801561017f57600080fd5b50610188610317565b6040516100af91906104aa565b3480156101a157600080fd5b506000546100ee906001600160a01b031681565b610171610379565b3480156101c957600080fd5b506100a56103cf565b3480156101de57600080fd5b506100a560025481565b600181815481106101f857600080fd5b6000918252602090912001546001600160a01b0316905081565b6000546001600160a01b0316331461022957600080fd5b6001546000906102376103cf565b61024191906104f7565b90506001818154811061025657610256610519565b60009182526020822001546040516001600160a01b03909116914780156108fc02929091818181858888f19350505050158015610297573d6000803e3d6000fd5b50600181815481106102ab576102ab610519565b600091825260208083209091015460028054845260039092526040832080546001600160a01b0319166001600160a01b039092169190911790558054916102f18361052f565b9091555050604080516000815260208101918290525161031391600191610417565b5050565b6060600180548060200260200160405190810160405280929190818152602001828054801561036f57602002820191906000526020600020905b81546001600160a01b03168152600190910190602001808311610351575b5050505050905090565b662386f26fc10000341161038c57600080fd5b6001805480820182556000919091527fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf60180546001600160a01b03191633179055565b6000805460405160609190911b6bffffffffffffffffffffffff191660208201524260348201526054016040516020818303038152906040528051906020012060001c905090565b82805482825590600052602060002090810192821561046c579160200282015b8281111561046c57825182546001600160a01b0319166001600160a01b03909116178255602090920191600190910190610437565b5061047892915061047c565b5090565b5b80821115610478576000815560010161047d565b6000602082840312156104a357600080fd5b5035919050565b6020808252825182820181905260009190848201906040850190845b818110156104eb5783516001600160a01b0316835292840192918401916001016104c6565b50909695505050505050565b60008261051457634e487b7160e01b600052601260045260246000fd5b500690565b634e487b7160e01b600052603260045260246000fd5b60006001820161054f57634e487b7160e01b600052601160045260246000fd5b506001019056fea264697066735822122006cb11ebc6b8d4ca828a496a52ae80dc89cb62f21bc5a8d8874a69d86b63351c64736f6c634300080f0033";

    public static final String FUNC_CHARACTERS = "characters";

    public static final String FUNC_ENTERPLAYER = "enterPlayer";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_GETRANDOMNUMBER = "getRandomNumber";

    public static final String FUNC_GETWINNERBYLOTTERY = "getWinnerByLottery";

    public static final String FUNC_GETCHARACTERS = "getcharacters";

    public static final String FUNC_LOTTERYID = "lotteryId";

    public static final String FUNC_LOTTERYRESUME = "lotteryResume";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_PICKWINNER = "pickWinner";

    @Deprecated
    protected UserLottery(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UserLottery(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected UserLottery(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected UserLottery(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> characters(BigInteger param0) {
        final Function function = new Function(FUNC_CHARACTERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> enterPlayer() {
        final Function function = new Function(
                FUNC_ENTERPLAYER, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> getBalance() {
        final Function function = new Function(FUNC_GETBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getRandomNumber() {
        final Function function = new Function(FUNC_GETRANDOMNUMBER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> getWinnerByLottery(BigInteger lottery) {
        final Function function = new Function(FUNC_GETWINNERBYLOTTERY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(lottery)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<List> getcharacters() {
        final Function function = new Function(FUNC_GETCHARACTERS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> lotteryId() {
        final Function function = new Function(FUNC_LOTTERYID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> lotteryResume(BigInteger param0) {
        final Function function = new Function(FUNC_LOTTERYRESUME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> pickWinner() {
        final Function function = new Function(
                FUNC_PICKWINNER, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static UserLottery load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UserLottery(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static UserLottery load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UserLottery(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static UserLottery load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new UserLottery(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static UserLottery load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new UserLottery(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<UserLottery> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UserLottery.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<UserLottery> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UserLottery.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UserLottery> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UserLottery.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UserLottery> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UserLottery.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
