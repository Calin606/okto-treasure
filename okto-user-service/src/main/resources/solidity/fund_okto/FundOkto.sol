//Get funds from users
//Withdraw funds
//Set a minimum funding value in USD

// SPDX-License-Identifier: MIT
pragma solidity >=0.6.0 <0.9.0;

//import "@chainlink/contracts/src/v0.8/interfaces/AggregatorV3Interface.sol";

interface AggregatorV3Interface {
  function decimals() external view returns (uint8);

  function description() external view returns (string memory);

  function version() external view returns (uint256);

  function getRoundData(uint80 _roundId)
    external
    view
    returns (
      uint80 roundId,
      int256 answer,
      uint256 startedAt,
      uint256 updatedAt,
      uint80 answeredInRound
    );

  function latestRoundData()
    external
    view
    returns (
      uint80 roundId,
      int256 answer,
      uint256 startedAt,
      uint256 updatedAt,
      uint80 answeredInRound
    );
}

contract FundOkto {

    //3:44
    uint256 public minUsd = 50 * 1e18;

    mapping(address => uint256) public addressToAmountFunded;
    address[] public funders;

    function fund() public payable{
        //want to be able to set a minimum fund amount in USD
        require(getConversionRate(msg.value) >= minUsd, "You should send the minimum required amount of USD");
        funders.push(msg.sender);
        addressToAmountFunded[msg.sender] = msg.value;
    }

    function getPrice() public view returns(uint256){
        //ABI
        //ADDRESS OF CONTRACT 0x8A753747A1Fa494EC906cE90E9f37563A8AF630e
        AggregatorV3Interface aggregatorV3Interface = AggregatorV3Interface(0x8A753747A1Fa494EC906cE90E9f37563A8AF630e);
        (,int256 price,,,) = aggregatorV3Interface.latestRoundData();

        //ETH -> USD
        //3000.0000000
        return uint256(price * 1e10); //1**10 == 10000000000
    }

    function getVersion() public view returns (uint256) {
        AggregatorV3Interface priceFeed = AggregatorV3Interface(0x8A753747A1Fa494EC906cE90E9f37563A8AF630e);
        return priceFeed.version();
    }

    function getConversionRate(uint256 ethereumAmount) internal view returns (uint256) {
        uint256 ethereumPrice = getPrice();
        uint256 ethereumAmountInUsd = (ethereumPrice * ethereumAmount) / 1000000000000000000;
        // the actual ETH/USD conversion rate, after adjusting the extra 0s.
        return ethereumAmountInUsd;
    }

}