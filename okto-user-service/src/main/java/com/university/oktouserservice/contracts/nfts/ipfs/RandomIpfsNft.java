package com.university.oktouserservice.contracts.nfts.ipfs;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.StaticArray3;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
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
public class RandomIpfsNft extends Contract {
    public static final String BINARY = "6101206040523480156200001257600080fd5b50604051620026003803806200260083398101604081905262000035916200046c565b604080518082018252600f81526e14985b991bdb4812541194c8139195608a1b6020808301918252835180850190945260038452622924a760e91b90840152815189939162000088916000919062000194565b5080516200009e90600190602084019062000194565b5050506001600160a01b0316608052620000b833620000fe565b6001600160a01b03861660a05260e08490526001600160401b03851660c052600883905563ffffffff821661010052620000f28162000150565b50505050505062000555565b600780546001600160a01b038381166001600160a01b0319831681179093556040519116919082907f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e090600090a35050565b600c5460ff1615620001745760405162dc149f60e41b815260040160405180910390fd5b62000183600b82600362000223565b5050600c805460ff19166001179055565b828054620001a29062000519565b90600052602060002090601f016020900481019282620001c6576000855562000211565b82601f10620001e157805160ff191683800117855562000211565b8280016001018555821562000211579182015b8281111562000211578251825591602001919060010190620001f4565b506200021f92915062000283565b5090565b82805482825590600052602060002090810192821562000275579160200282015b828111156200027557825180516200026491849160209091019062000194565b509160200191906001019062000244565b506200021f9291506200029a565b5b808211156200021f576000815560010162000284565b808211156200021f576000620002b18282620002bb565b506001016200029a565b508054620002c99062000519565b6000825580601f10620002da575050565b601f016020900490600052602060002090810190620002fa919062000283565b50565b634e487b7160e01b600052604160045260246000fd5b604051606081016001600160401b0381118282101715620003385762000338620002fd565b60405290565b604051601f8201601f191681016001600160401b0381118282101715620003695762000369620002fd565b604052919050565b6000601f83818401126200038457600080fd5b6200038e62000313565b806060850186811115620003a157600080fd5b855b81811015620004605780516001600160401b0380821115620003c55760008081fd5b81890191508987830112620003da5760008081fd5b815181811115620003ef57620003ef620002fd565b6020915062000406818901601f191683016200033e565b8181528b838386010111156200041c5760008081fd5b60005b828110156200043c5784810184015182820185015283016200041f565b828111156200044e5760008484840101525b508752509094019350602001620003a3565b50909695505050505050565b60008060008060008060c087890312156200048657600080fd5b86516001600160a01b03811681146200049e57600080fd5b60208801519096506001600160401b038082168214620004bd57600080fd5b604089015160608a015160808b0151939850909650945063ffffffff82168214620004e757600080fd5b60a089015191935080821115620004fd57600080fd5b506200050c89828a0162000371565b9150509295509295509295565b600181811c908216806200052e57607f821691505b6020821081036200054f57634e487b7160e01b600052602260045260246000fd5b50919050565b60805160a05160c05160e0516101005161205f620005a16000396000610bb701526000610b5501526000610b8401526000610be50152600081816107320152610774015261205f6000f3fe60806040526004361061019c5760003560e01c806370a08231116100ec578063a51cccf31161008a578063c87b56dd11610064578063c87b56dd1461048a578063e985e9c5146104aa578063ee89dab4146104ca578063f2fde38b146104e257600080fd5b8063a51cccf314610435578063aa15249114610462578063b88d4fde1461046a57600080fd5b80638da5cb5b116100c65780638da5cb5b146103ac57806395d89b41146103ca578063a22cb465146103df578063a36f573b146103ff57600080fd5b806370a0823114610362578063715018a6146103825780637a5caab31461039757600080fd5b806323b872dd1161015957806342842e0e1161013357806342842e0e146102eb5780635dacf5f41461030b5780636352211e1461032d5780636e02007d1461034d57600080fd5b806323b872dd146102965780633af25975146102b65780633ccfd60b146102d657600080fd5b806301ffc9a7146101a157806306fdde03146101d6578063081812fc146101f8578063095ea7b3146102305780630b21a83b146102525780631fe543e314610276575b600080fd5b3480156101ad57600080fd5b506101c16101bc3660046119f8565b610502565b60405190151581526020015b60405180910390f35b3480156101e257600080fd5b506101eb610554565b6040516101cd9190611a6d565b34801561020457600080fd5b50610218610213366004611a80565b6105e6565b6040516001600160a01b0390911681526020016101cd565b34801561023c57600080fd5b5061025061024b366004611ab5565b61060d565b005b34801561025e57600080fd5b5061026860095481565b6040519081526020016101cd565b34801561028257600080fd5b50610250610291366004611b26565b610727565b3480156102a257600080fd5b506102506102b1366004611bd8565b6107af565b3480156102c257600080fd5b506101eb6102d1366004611a80565b6107e0565b3480156102e257600080fd5b5061025061088f565b3480156102f757600080fd5b50610250610306366004611bd8565b610923565b34801561031757600080fd5b5061032061093e565b6040516101cd9190611c14565b34801561033957600080fd5b50610218610348366004611a80565b610969565b34801561035957600080fd5b50600954610268565b34801561036e57600080fd5b5061026861037d366004611c45565b6109c9565b34801561038e57600080fd5b50610250610a4f565b3480156103a357600080fd5b50600854610268565b3480156103b857600080fd5b506007546001600160a01b0316610218565b3480156103d657600080fd5b506101eb610a63565b3480156103eb57600080fd5b506102506103fa366004611c60565b610a72565b34801561040b57600080fd5b5061021861041a366004611a80565b600d602052600090815260409020546001600160a01b031681565b34801561044157600080fd5b50610455610450366004611a80565b610a7d565b6040516101cd9190611cd4565b610268610b21565b34801561047657600080fd5b50610250610485366004611ce2565b610cb7565b34801561049657600080fd5b506101eb6104a5366004611a80565b610cef565b3480156104b657600080fd5b506101c16104c5366004611da2565b610dff565b3480156104d657600080fd5b50600c5460ff166101c1565b3480156104ee57600080fd5b506102506104fd366004611c45565b610e2d565b60006001600160e01b031982166380ac58cd60e01b148061053357506001600160e01b03198216635b5e139f60e01b145b8061054e57506301ffc9a760e01b6001600160e01b03198316145b92915050565b60606000805461056390611dd5565b80601f016020809104026020016040519081016040528092919081815260200182805461058f90611dd5565b80156105dc5780601f106105b1576101008083540402835291602001916105dc565b820191906000526020600020905b8154815290600101906020018083116105bf57829003601f168201915b5050505050905090565b60006105f182610ea6565b506000908152600460205260409020546001600160a01b031690565b600061061882610969565b9050806001600160a01b0316836001600160a01b03160361068a5760405162461bcd60e51b815260206004820152602160248201527f4552433732313a20617070726f76616c20746f2063757272656e74206f776e656044820152603960f91b60648201526084015b60405180910390fd5b336001600160a01b03821614806106a657506106a68133610dff565b6107185760405162461bcd60e51b815260206004820152603e60248201527f4552433732313a20617070726f76652063616c6c6572206973206e6f7420746f60448201527f6b656e206f776e6572206e6f7220617070726f76656420666f7220616c6c00006064820152608401610681565b6107228383610f05565b505050565b336001600160a01b037f000000000000000000000000000000000000000000000000000000000000000016146107a15760405163073e64fd60e21b81523360048201526001600160a01b037f0000000000000000000000000000000000000000000000000000000000000000166024820152604401610681565b6107ab8282610f73565b5050565b6107b933826110e5565b6107d55760405162461bcd60e51b815260040161068190611e0f565b610722838383611143565b6060600b82815481106107f5576107f5611e5d565b90600052602060002001805461080a90611dd5565b80601f016020809104026020016040519081016040528092919081815260200182805461083690611dd5565b80156108835780601f1061085857610100808354040283529160200191610883565b820191906000526020600020905b81548152906001019060200180831161086657829003601f168201915b50505050509050919050565b6108976112df565b6040514790600090339083908381818185875af1925050503d80600081146108db576040519150601f19603f3d011682016040523d82523d6000602084013e6108e0565b606091505b50509050806107ab5760405162461bcd60e51b815260206004820152600f60248201526e151c985b9cd9995c8819985a5b1959608a1b6044820152606401610681565b61072283838360405180602001604052806000815250610cb7565b61094661192b565b6040518060600160405280600a8152602001601e81526020016064815250905090565b6000818152600260205260408120546001600160a01b03168061054e5760405162461bcd60e51b8152602060048201526018602482015277115490cdcc8c4e881a5b9d985b1a59081d1bdad95b88125160421b6044820152606401610681565b60006001600160a01b038216610a335760405162461bcd60e51b815260206004820152602960248201527f4552433732313a2061646472657373207a65726f206973206e6f7420612076616044820152683634b21037bbb732b960b91b6064820152608401610681565b506001600160a01b031660009081526003602052604090205490565b610a576112df565b610a616000611339565b565b60606001805461056390611dd5565b6107ab33838361138b565b60008080610a8961093e565b905060005b6003811015610b0757828510158015610abc5750818160038110610ab457610ab4611e5d565b602002015185105b15610adc57806002811115610ad357610ad3611c9c565b95945050505050565b818160038110610aee57610aee611e5d565b6020020151925080610aff81611e89565b915050610a8e565b50604051630655dc2560e01b815260040160405180910390fd5b6000600854341015610b4657604051632e53d2d360e01b815260040160405180910390fd5b6040516305d3b1d360e41b81527f0000000000000000000000000000000000000000000000000000000000000000600482015267ffffffffffffffff7f00000000000000000000000000000000000000000000000000000000000000001660248201526003604482015263ffffffff7f0000000000000000000000000000000000000000000000000000000000000000166064820152600160848201527f00000000000000000000000000000000000000000000000000000000000000006001600160a01b031690635d3b1d309060a4016020604051808303816000875af1158015610c36573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250810190610c5a9190611ea2565b6000818152600d602090815260409182902080546001600160a01b03191633908117909155915191825291925082917ff873236e6cc0ecc5be1a9a35c95ee5b8d1ac4cc7bfef0cc5060391d6cc98e26b910160405180910390a290565b610cc133836110e5565b610cdd5760405162461bcd60e51b815260040161068190611e0f565b610ce984848484611459565b50505050565b6060610cfa82610ea6565b60008281526006602052604081208054610d1390611dd5565b80601f0160208091040260200160405190810160405280929190818152602001828054610d3f90611dd5565b8015610d8c5780601f10610d6157610100808354040283529160200191610d8c565b820191906000526020600020905b815481529060010190602001808311610d6f57829003601f168201915b505050505090506000610daa60408051602081019091526000815290565b90508051600003610dbc575092915050565b815115610dee578082604051602001610dd6929190611ebb565b60405160208183030381529060405292505050919050565b610df78461148c565b949350505050565b6001600160a01b03918216600090815260056020908152604080832093909416825291909152205460ff1690565b610e356112df565b6001600160a01b038116610e9a5760405162461bcd60e51b815260206004820152602660248201527f4f776e61626c653a206e6577206f776e657220697320746865207a65726f206160448201526564647265737360d01b6064820152608401610681565b610ea381611339565b50565b6000818152600260205260409020546001600160a01b0316610ea35760405162461bcd60e51b8152602060048201526018602482015277115490cdcc8c4e881a5b9d985b1a59081d1bdad95b88125160421b6044820152606401610681565b600081815260046020526040902080546001600160a01b0319166001600160a01b0384169081179091558190610f3a82610969565b6001600160a01b03167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b92560405160405180910390a45050565b6000828152600d60205260409020546009546001600160a01b0390911690610f9c816001611eea565b6009819055506000606484600081518110610fb957610fb9611e5d565b6020026020010151610fcb9190611f18565b90506000610fd882610a7d565b9050610fe48484611500565b6110a483600b836002811115610ffc57610ffc611c9c565b8154811061100c5761100c611e5d565b90600052602060002001805461102190611dd5565b80601f016020809104026020016040519081016040528092919081815260200182805461104d90611dd5565b801561109a5780601f1061106f5761010080835404028352916020019161109a565b820191906000526020600020905b81548152906001019060200180831161107d57829003601f168201915b505050505061151a565b7f8a269f26b688e110e9cbd887d163dab35cae678fa353a0292de532c0cac1ecdc81856040516110d5929190611f2c565b60405180910390a1505050505050565b6000806110f183610969565b9050806001600160a01b0316846001600160a01b0316148061111857506111188185610dff565b80610df75750836001600160a01b0316611131846105e6565b6001600160a01b031614949350505050565b826001600160a01b031661115682610969565b6001600160a01b0316146111ba5760405162461bcd60e51b815260206004820152602560248201527f4552433732313a207472616e736665722066726f6d20696e636f72726563742060448201526437bbb732b960d91b6064820152608401610681565b6001600160a01b03821661121c5760405162461bcd60e51b8152602060048201526024808201527f4552433732313a207472616e7366657220746f20746865207a65726f206164646044820152637265737360e01b6064820152608401610681565b611227600082610f05565b6001600160a01b0383166000908152600360205260408120805460019290611250908490611f52565b90915550506001600160a01b038216600090815260036020526040812080546001929061127e908490611eea565b909155505060008181526002602052604080822080546001600160a01b0319166001600160a01b0386811691821790925591518493918716917fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef91a4505050565b6007546001600160a01b03163314610a615760405162461bcd60e51b815260206004820181905260248201527f4f776e61626c653a2063616c6c6572206973206e6f7420746865206f776e65726044820152606401610681565b600780546001600160a01b038381166001600160a01b0319831681179093556040519116919082907f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e090600090a35050565b816001600160a01b0316836001600160a01b0316036113ec5760405162461bcd60e51b815260206004820152601960248201527f4552433732313a20617070726f766520746f2063616c6c6572000000000000006044820152606401610681565b6001600160a01b03838116600081815260056020908152604080832094871680845294825291829020805460ff191686151590811790915591519182527f17307eab39ab6107e8899845ad3d59bd9653f200f220920489ca2b5937696c31910160405180910390a3505050565b611464848484611143565b611470848484846115b4565b610ce95760405162461bcd60e51b815260040161068190611f69565b606061149782610ea6565b60006114ae60408051602081019091526000815290565b905060008151116114ce57604051806020016040528060008152506114f9565b806114d8846116b5565b6040516020016114e9929190611ebb565b6040516020818303038152906040525b9392505050565b6107ab8282604051806020016040528060008152506117b6565b6000828152600260205260409020546001600160a01b03166115955760405162461bcd60e51b815260206004820152602e60248201527f45524337323155524953746f726167653a2055524920736574206f66206e6f6e60448201526d32bc34b9ba32b73a103a37b5b2b760911b6064820152608401610681565b6000828152600660209081526040909120825161072292840190611949565b60006001600160a01b0384163b156116aa57604051630a85bd0160e11b81526001600160a01b0385169063150b7a02906115f8903390899088908890600401611fbb565b6020604051808303816000875af1925050508015611633575060408051601f3d908101601f1916820190925261163091810190611ff8565b60015b611690573d808015611661576040519150601f19603f3d011682016040523d82523d6000602084013e611666565b606091505b5080516000036116885760405162461bcd60e51b815260040161068190611f69565b805181602001fd5b6001600160e01b031916630a85bd0160e11b149050610df7565b506001949350505050565b6060816000036116dc5750506040805180820190915260018152600360fc1b602082015290565b8160005b811561170657806116f081611e89565b91506116ff9050600a83612015565b91506116e0565b60008167ffffffffffffffff81111561172157611721611adf565b6040519080825280601f01601f19166020018201604052801561174b576020820181803683370190505b5090505b8415610df757611760600183611f52565b915061176d600a86611f18565b611778906030611eea565b60f81b81838151811061178d5761178d611e5d565b60200101906001600160f81b031916908160001a9053506117af600a86612015565b945061174f565b6117c083836117e9565b6117cd60008484846115b4565b6107225760405162461bcd60e51b815260040161068190611f69565b6001600160a01b03821661183f5760405162461bcd60e51b815260206004820181905260248201527f4552433732313a206d696e7420746f20746865207a65726f20616464726573736044820152606401610681565b6000818152600260205260409020546001600160a01b0316156118a45760405162461bcd60e51b815260206004820152601c60248201527f4552433732313a20746f6b656e20616c7265616479206d696e746564000000006044820152606401610681565b6001600160a01b03821660009081526003602052604081208054600192906118cd908490611eea565b909155505060008181526002602052604080822080546001600160a01b0319166001600160a01b03861690811790915590518392907fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef908290a45050565b60405180606001604052806003906020820280368337509192915050565b82805461195590611dd5565b90600052602060002090601f01602090048101928261197757600085556119bd565b82601f1061199057805160ff19168380011785556119bd565b828001600101855582156119bd579182015b828111156119bd5782518255916020019190600101906119a2565b506119c99291506119cd565b5090565b5b808211156119c957600081556001016119ce565b6001600160e01b031981168114610ea357600080fd5b600060208284031215611a0a57600080fd5b81356114f9816119e2565b60005b83811015611a30578181015183820152602001611a18565b83811115610ce95750506000910152565b60008151808452611a59816020860160208601611a15565b601f01601f19169290920160200192915050565b6020815260006114f96020830184611a41565b600060208284031215611a9257600080fd5b5035919050565b80356001600160a01b0381168114611ab057600080fd5b919050565b60008060408385031215611ac857600080fd5b611ad183611a99565b946020939093013593505050565b634e487b7160e01b600052604160045260246000fd5b604051601f8201601f1916810167ffffffffffffffff81118282101715611b1e57611b1e611adf565b604052919050565b60008060408385031215611b3957600080fd5b8235915060208084013567ffffffffffffffff80821115611b5957600080fd5b818601915086601f830112611b6d57600080fd5b813581811115611b7f57611b7f611adf565b8060051b9150611b90848301611af5565b8181529183018401918481019089841115611baa57600080fd5b938501935b83851015611bc857843582529385019390850190611baf565b8096505050505050509250929050565b600080600060608486031215611bed57600080fd5b611bf684611a99565b9250611c0460208501611a99565b9150604084013590509250925092565b60608101818360005b6003811015611c3c578151835260209283019290910190600101611c1d565b50505092915050565b600060208284031215611c5757600080fd5b6114f982611a99565b60008060408385031215611c7357600080fd5b611c7c83611a99565b915060208301358015158114611c9157600080fd5b809150509250929050565b634e487b7160e01b600052602160045260246000fd5b60038110611cd057634e487b7160e01b600052602160045260246000fd5b9052565b6020810161054e8284611cb2565b60008060008060808587031215611cf857600080fd5b611d0185611a99565b93506020611d10818701611a99565b935060408601359250606086013567ffffffffffffffff80821115611d3457600080fd5b818801915088601f830112611d4857600080fd5b813581811115611d5a57611d5a611adf565b611d6c601f8201601f19168501611af5565b91508082528984828501011115611d8257600080fd5b808484018584013760008482840101525080935050505092959194509250565b60008060408385031215611db557600080fd5b611dbe83611a99565b9150611dcc60208401611a99565b90509250929050565b600181811c90821680611de957607f821691505b602082108103611e0957634e487b7160e01b600052602260045260246000fd5b50919050565b6020808252602e908201527f4552433732313a2063616c6c6572206973206e6f7420746f6b656e206f776e6560408201526d1c881b9bdc88185c1c1c9bdd995960921b606082015260800190565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b600060018201611e9b57611e9b611e73565b5060010190565b600060208284031215611eb457600080fd5b5051919050565b60008351611ecd818460208801611a15565b835190830190611ee1818360208801611a15565b01949350505050565b60008219821115611efd57611efd611e73565b500190565b634e487b7160e01b600052601260045260246000fd5b600082611f2757611f27611f02565b500690565b60408101611f3a8285611cb2565b6001600160a01b039290921660209190910152919050565b600082821015611f6457611f64611e73565b500390565b60208082526032908201527f4552433732313a207472616e7366657220746f206e6f6e20455243373231526560408201527131b2b4bb32b91034b6b83632b6b2b73a32b960711b606082015260800190565b6001600160a01b0385811682528416602082015260408101839052608060608201819052600090611fee90830184611a41565b9695505050505050565b60006020828403121561200a57600080fd5b81516114f9816119e2565b60008261202457612024611f02565b50049056fea2646970667358221220bd03bd83825f15f7ab0055dadb6f18832f0e0541631701e8e89a8ab8145b290a64736f6c634300080d0033";

    public static final String FUNC_APPROVE = "approve";

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_GETAPPROVED = "getApproved";

    public static final String FUNC_GETBREEDFROMMODDEDRNG = "getBreedFromModdedRng";

    public static final String FUNC_GETCHANCEARRAY = "getChanceArray";

    public static final String FUNC_GETDOGTOKENURIS = "getDogTokenUris";

    public static final String FUNC_GETINITIALIZED = "getInitialized";

    public static final String FUNC_GETMINTFEE = "getMintFee";

    public static final String FUNC_GETTOKENCOUNTER = "getTokenCounter";

    public static final String FUNC_ISAPPROVEDFORALL = "isApprovedForAll";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_OWNEROF = "ownerOf";

    public static final String FUNC_RAWFULFILLRANDOMWORDS = "rawFulfillRandomWords";

    public static final String FUNC_RENOUNCEOWNERSHIP = "renounceOwnership";

    public static final String FUNC_REQUESTNFT = "requestNft";

    public static final String FUNC_S_REQUESTIDTOSENDER = "s_requestIdToSender";

    public static final String FUNC_S_TOKENCOUNTER = "s_tokenCounter";

    public static final String FUNC_safeTransferFrom = "safeTransferFrom";

    public static final String FUNC_SETAPPROVALFORALL = "setApprovalForAll";

    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";

    public static final String FUNC_SYMBOL = "symbol";

    public static final String FUNC_TOKENURI = "tokenURI";

    public static final String FUNC_TRANSFERFROM = "transferFrom";

    public static final String FUNC_TRANSFEROWNERSHIP = "transferOwnership";

    public static final String FUNC_WITHDRAW = "withdraw";

    public static final Event APPROVAL_EVENT = new Event("Approval", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}));
    ;

    public static final Event APPROVALFORALL_EVENT = new Event("ApprovalForAll", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Bool>() {}));
    ;

    public static final Event NFTMINTED_EVENT = new Event("NftMinted", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}, new TypeReference<Address>() {}));
    ;

    public static final Event NFTREQUESTED_EVENT = new Event("NftRequested", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Address>() {}));
    ;

    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event TRANSFER_EVENT = new Event("Transfer", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>(true) {}));
    ;

    @Deprecated
    protected RandomIpfsNft(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected RandomIpfsNft(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected RandomIpfsNft(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected RandomIpfsNft(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<ApprovalEventResponse> getApprovalEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(APPROVAL_EVENT, transactionReceipt);
        ArrayList<ApprovalEventResponse> responses = new ArrayList<ApprovalEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ApprovalEventResponse typedResponse = new ApprovalEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.approved = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.tokenId = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ApprovalEventResponse> approvalEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ApprovalEventResponse>() {
            @Override
            public ApprovalEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(APPROVAL_EVENT, log);
                ApprovalEventResponse typedResponse = new ApprovalEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.approved = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.tokenId = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ApprovalEventResponse> approvalEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(APPROVAL_EVENT));
        return approvalEventFlowable(filter);
    }

    public List<ApprovalForAllEventResponse> getApprovalForAllEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(APPROVALFORALL_EVENT, transactionReceipt);
        ArrayList<ApprovalForAllEventResponse> responses = new ArrayList<ApprovalForAllEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.operator = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.approved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ApprovalForAllEventResponse> approvalForAllEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ApprovalForAllEventResponse>() {
            @Override
            public ApprovalForAllEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(APPROVALFORALL_EVENT, log);
                ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.operator = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.approved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ApprovalForAllEventResponse> approvalForAllEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(APPROVALFORALL_EVENT));
        return approvalForAllEventFlowable(filter);
    }

    public List<NftMintedEventResponse> getNftMintedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(NFTMINTED_EVENT, transactionReceipt);
        ArrayList<NftMintedEventResponse> responses = new ArrayList<NftMintedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NftMintedEventResponse typedResponse = new NftMintedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.breed = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.minter = (String) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<NftMintedEventResponse> nftMintedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, NftMintedEventResponse>() {
            @Override
            public NftMintedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(NFTMINTED_EVENT, log);
                NftMintedEventResponse typedResponse = new NftMintedEventResponse();
                typedResponse.log = log;
                typedResponse.breed = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.minter = (String) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<NftMintedEventResponse> nftMintedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(NFTMINTED_EVENT));
        return nftMintedEventFlowable(filter);
    }

    public List<NftRequestedEventResponse> getNftRequestedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(NFTREQUESTED_EVENT, transactionReceipt);
        ArrayList<NftRequestedEventResponse> responses = new ArrayList<NftRequestedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NftRequestedEventResponse typedResponse = new NftRequestedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.requestId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.requester = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<NftRequestedEventResponse> nftRequestedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, NftRequestedEventResponse>() {
            @Override
            public NftRequestedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(NFTREQUESTED_EVENT, log);
                NftRequestedEventResponse typedResponse = new NftRequestedEventResponse();
                typedResponse.log = log;
                typedResponse.requestId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.requester = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<NftRequestedEventResponse> nftRequestedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(NFTREQUESTED_EVENT));
        return nftRequestedEventFlowable(filter);
    }

    public List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, OwnershipTransferredEventResponse>() {
            @Override
            public OwnershipTransferredEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
                OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
        return ownershipTransferredEventFlowable(filter);
    }

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.tokenId = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<TransferEventResponse> transferEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.tokenId = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<TransferEventResponse> transferEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFER_EVENT));
        return transferEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> approve(String to, BigInteger tokenId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_APPROVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> balanceOf(String owner) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_BALANCEOF, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> getApproved(BigInteger tokenId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETAPPROVED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> getBreedFromModdedRng(BigInteger moddedRng) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETBREEDFROMMODDEDRNG, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(moddedRng)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<List> getChanceArray() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETCHANCEARRAY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<StaticArray3<Uint256>>() {}));
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

    public RemoteFunctionCall<String> getDogTokenUris(BigInteger index) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETDOGTOKENURIS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Boolean> getInitialized() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETINITIALIZED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> getMintFee() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETMINTFEE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getTokenCounter() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETTOKENCOUNTER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> isApprovedForAll(String owner, String operator) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_ISAPPROVEDFORALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, owner), 
                new org.web3j.abi.datatypes.Address(160, operator)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<String> name() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> owner() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> ownerOf(BigInteger tokenId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_OWNEROF, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> rawFulfillRandomWords(BigInteger requestId, List<BigInteger> randomWords) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_RAWFULFILLRANDOMWORDS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(requestId), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(randomWords, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> renounceOwnership() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_RENOUNCEOWNERSHIP, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> requestNft() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_REQUESTNFT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> s_requestIdToSender(BigInteger param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_S_REQUESTIDTOSENDER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> s_tokenCounter() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_S_TOKENCOUNTER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> safeTransferFrom(String from, String to, BigInteger tokenId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_safeTransferFrom, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, from), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> safeTransferFrom(String from, String to, BigInteger tokenId, byte[] data) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_safeTransferFrom, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, from), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(tokenId), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setApprovalForAll(String operator, Boolean approved) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETAPPROVALFORALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, operator), 
                new org.web3j.abi.datatypes.Bool(approved)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> supportsInterface(byte[] interfaceId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_SUPPORTSINTERFACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes4(interfaceId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<String> symbol() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_SYMBOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> tokenURI(BigInteger tokenId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TOKENURI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> transferFrom(String from, String to, BigInteger tokenId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_TRANSFERFROM, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, from), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> transferOwnership(String newOwner) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_TRANSFEROWNERSHIP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, newOwner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> withdraw() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_WITHDRAW, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static RandomIpfsNft load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new RandomIpfsNft(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static RandomIpfsNft load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new RandomIpfsNft(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static RandomIpfsNft load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new RandomIpfsNft(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RandomIpfsNft load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new RandomIpfsNft(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<RandomIpfsNft> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String vrfCoordinatorV2, BigInteger subscriptionId, byte[] gasLane, BigInteger mintFee, BigInteger callbackGasLimit, List<String> dogTokenUris) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, vrfCoordinatorV2), 
                new org.web3j.abi.datatypes.generated.Uint64(subscriptionId), 
                new org.web3j.abi.datatypes.generated.Bytes32(gasLane), 
                new org.web3j.abi.datatypes.generated.Uint256(mintFee), 
                new org.web3j.abi.datatypes.generated.Uint32(callbackGasLimit), 
                new org.web3j.abi.datatypes.generated.StaticArray3<org.web3j.abi.datatypes.Utf8String>(
                        org.web3j.abi.datatypes.Utf8String.class,
                        org.web3j.abi.Utils.typeMap(dogTokenUris, org.web3j.abi.datatypes.Utf8String.class))));
        return deployRemoteCall(RandomIpfsNft.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<RandomIpfsNft> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String vrfCoordinatorV2, BigInteger subscriptionId, byte[] gasLane, BigInteger mintFee, BigInteger callbackGasLimit, List<String> dogTokenUris) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, vrfCoordinatorV2), 
                new org.web3j.abi.datatypes.generated.Uint64(subscriptionId), 
                new org.web3j.abi.datatypes.generated.Bytes32(gasLane), 
                new org.web3j.abi.datatypes.generated.Uint256(mintFee), 
                new org.web3j.abi.datatypes.generated.Uint32(callbackGasLimit), 
                new org.web3j.abi.datatypes.generated.StaticArray3<org.web3j.abi.datatypes.Utf8String>(
                        org.web3j.abi.datatypes.Utf8String.class,
                        org.web3j.abi.Utils.typeMap(dogTokenUris, org.web3j.abi.datatypes.Utf8String.class))));
        return deployRemoteCall(RandomIpfsNft.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<RandomIpfsNft> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String vrfCoordinatorV2, BigInteger subscriptionId, byte[] gasLane, BigInteger mintFee, BigInteger callbackGasLimit, List<String> dogTokenUris) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, vrfCoordinatorV2), 
                new org.web3j.abi.datatypes.generated.Uint64(subscriptionId), 
                new org.web3j.abi.datatypes.generated.Bytes32(gasLane), 
                new org.web3j.abi.datatypes.generated.Uint256(mintFee), 
                new org.web3j.abi.datatypes.generated.Uint32(callbackGasLimit), 
                new org.web3j.abi.datatypes.generated.StaticArray3<org.web3j.abi.datatypes.Utf8String>(
                        org.web3j.abi.datatypes.Utf8String.class,
                        org.web3j.abi.Utils.typeMap(dogTokenUris, org.web3j.abi.datatypes.Utf8String.class))));
        return deployRemoteCall(RandomIpfsNft.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<RandomIpfsNft> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String vrfCoordinatorV2, BigInteger subscriptionId, byte[] gasLane, BigInteger mintFee, BigInteger callbackGasLimit, List<String> dogTokenUris) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, vrfCoordinatorV2), 
                new org.web3j.abi.datatypes.generated.Uint64(subscriptionId), 
                new org.web3j.abi.datatypes.generated.Bytes32(gasLane), 
                new org.web3j.abi.datatypes.generated.Uint256(mintFee), 
                new org.web3j.abi.datatypes.generated.Uint32(callbackGasLimit), 
                new org.web3j.abi.datatypes.generated.StaticArray3<org.web3j.abi.datatypes.Utf8String>(
                        org.web3j.abi.datatypes.Utf8String.class,
                        org.web3j.abi.Utils.typeMap(dogTokenUris, org.web3j.abi.datatypes.Utf8String.class))));
        return deployRemoteCall(RandomIpfsNft.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static class ApprovalEventResponse extends BaseEventResponse {
        public String owner;

        public String approved;

        public BigInteger tokenId;
    }

    public static class ApprovalForAllEventResponse extends BaseEventResponse {
        public String owner;

        public String operator;

        public Boolean approved;
    }

    public static class NftMintedEventResponse extends BaseEventResponse {
        public BigInteger breed;

        public String minter;
    }

    public static class NftRequestedEventResponse extends BaseEventResponse {
        public BigInteger requestId;

        public String requester;
    }

    public static class OwnershipTransferredEventResponse extends BaseEventResponse {
        public String previousOwner;

        public String newOwner;
    }

    public static class TransferEventResponse extends BaseEventResponse {
        public String from;

        public String to;

        public BigInteger tokenId;
    }
}
