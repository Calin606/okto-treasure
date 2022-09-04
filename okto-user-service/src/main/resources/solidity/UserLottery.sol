// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.7.0 <0.9.0;

contract UserLottery {
    address public owner;
    address payable[] public characters;
    uint public lotteryId;
    mapping (uint => address payable) public lotteryResume;

    constructor() {
        owner = msg.sender;
        lotteryId = 1;
    }

    function getWinnerByLottery(uint lottery) public view returns (address payable) {
        return lotteryResume[lottery];
    }

    function getBalance() public view returns (uint) {
        return address(this).balance;
    }

    function getcharacters() public view returns (address payable[] memory) {
        return characters;
    }

    function enterPlayer() public payable {
        require(msg.value > .01 ether);

        characters.push(payable(msg.sender));
    }

    function getRandomNumber() public view returns (uint) {
        return uint(keccak256(abi.encodePacked(owner, block.timestamp)));
    }

    function pickWinner() public onlyowner {
        uint index = getRandomNumber() % characters.length;
        characters[index].transfer(address(this).balance);

        lotteryResume[lotteryId] = characters[index];
        lotteryId++;

        characters = new address payable[](0);
    }

    modifier onlyowner() {
      require(msg.sender == owner);
      _;
    }
}