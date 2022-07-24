package com.university.oktouserservice.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
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
public class FundOkto extends Contract {
    public static final String BINARY = "60806040526802b5e3af16b188000060005534801561001d57600080fd5b506105498061002d6000396000f3fe6080604052600436106100555760003560e01c80630d8e6e2c1461005a5780633e47d6f31461008257806351b80e41146100af57806398d5fdca146100c5578063b60d4288146100da578063dc0d3dff146100e4575b600080fd5b34801561006657600080fd5b5061006f61011c565b6040519081526020015b60405180910390f35b34801561008e57600080fd5b5061006f61009d366004610366565b60016020526000908152604090205481565b3480156100bb57600080fd5b5061006f60005481565b3480156100d157600080fd5b5061006f61019e565b6100e261023a565b005b3480156100f057600080fd5b506101046100ff366004610396565b610308565b6040516001600160a01b039091168152602001610079565b600080738a753747a1fa494ec906ce90e9f37563a8af630e9050806001600160a01b03166354fd4d506040518163ffffffff1660e01b8152600401602060405180830381865afa158015610174573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061019891906103af565b91505090565b600080738a753747a1fa494ec906ce90e9f37563a8af630e90506000816001600160a01b031663feaf968c6040518163ffffffff1660e01b815260040160a060405180830381865afa1580156101f8573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061021c91906103e7565b505050915050806402540be400610233919061044d565b9250505090565b60005461024634610332565b10156102b35760405162461bcd60e51b815260206004820152603260248201527f596f752073686f756c642073656e6420746865206d696e696d756d20726571756044820152711a5c995908185b5bdd5b9d081bd9881554d160721b606482015260840160405180910390fd5b6002805460018181019092557f405787fa12a823e0f2b7631cc41b3ba8828b3321ca811111fa75cd3aa3bb5ace0180546001600160a01b03191633908117909155600090815260209190915260409020349055565b6002818154811061031857600080fd5b6000918252602090912001546001600160a01b0316905081565b60008061033d61019e565b90506000670de0b6b3a764000061035485846104d2565b61035e91906104f1565b949350505050565b60006020828403121561037857600080fd5b81356001600160a01b038116811461038f57600080fd5b9392505050565b6000602082840312156103a857600080fd5b5035919050565b6000602082840312156103c157600080fd5b5051919050565b805169ffffffffffffffffffff811681146103e257600080fd5b919050565b600080600080600060a086880312156103ff57600080fd5b610408866103c8565b945060208601519350604086015192506060860151915061042b608087016103c8565b90509295509295909350565b634e487b7160e01b600052601160045260246000fd5b60006001600160ff1b038184138284138082168684048611161561047357610473610437565b600160ff1b600087128281168783058912161561049257610492610437565b600087129250878205871284841616156104ae576104ae610437565b878505871281841616156104c4576104c4610437565b505050929093029392505050565b60008160001904831182151516156104ec576104ec610437565b500290565b60008261050e57634e487b7160e01b600052601260045260246000fd5b50049056fea26469706673582212207ab0352252d4daf2f712b05cddfb08cee4559fb2dd768e9d40d01bc91b23f87a64736f6c634300080d0033";

    public static final String FUNC_ADDRESSTOAMOUNTFUNDED = "addressToAmountFunded";

    public static final String FUNC_FUND = "fund";

    public static final String FUNC_FUNDERS = "funders";

    public static final String FUNC_GETPRICE = "getPrice";

    public static final String FUNC_GETVERSION = "getVersion";

    public static final String FUNC_MINUSD = "minUsd";

    @Deprecated
    protected FundOkto(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected FundOkto(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected FundOkto(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected FundOkto(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> addressToAmountFunded(String param0) {
        final Function function = new Function(FUNC_ADDRESSTOAMOUNTFUNDED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> fund() {
        final Function function = new Function(
                FUNC_FUND, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> funders(BigInteger param0) {
        final Function function = new Function(FUNC_FUNDERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> getPrice() {
        final Function function = new Function(FUNC_GETPRICE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getVersion() {
        final Function function = new Function(FUNC_GETVERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> minUsd() {
        final Function function = new Function(FUNC_MINUSD, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static FundOkto load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new FundOkto(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static FundOkto load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new FundOkto(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static FundOkto load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new FundOkto(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static FundOkto load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new FundOkto(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<FundOkto> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(FundOkto.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<FundOkto> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(FundOkto.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<FundOkto> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(FundOkto.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<FundOkto> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(FundOkto.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
