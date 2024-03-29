//package com.university.oktouserservice.utils;
//
//public class MetamaskUtils {
////
////    public User signin(UserLoginDTO loginDetails, HttpServletResponse response) {
////        try {
////            // Get the wallet ID and signed message from the body stored in the DTO
////            String publicWalletId = loginDetails.getPublicWalletId();
////            String message = loginDetails.getMessage();
////
////            // Find the nonce from the DB that was used to sign this message
////            User user = userRepository.findByPublicWalletId(publicWalletId);
////            String nonce = user.getNonce();
////
////            // Generate the HASH of the Nonce
////            byte[] nonceHash = Hash.sha3(nonce.getBytes()) // org.web3j.crypto.Hash
////
////            // Generate the Signature Data
////            byte[] signatureBytes = Numeric.hexStringToByteArray(message); // org.web3j.utils.Numeric
////
////            byte v = (byte) ((signatureBytes[64] < 27) ? (signatureBytes[64] + 27) : signatureBytes[64]);
////            byte[] r = Arrays.copyOfRange(signatureBytes, 0, 32);
////            byte[] s = Arrays.copyOfRange(signatureBytes, 32, 64);
////
////            SignatureData signatureData = new SignatureData(v, r, s); // org.web3j.crypto.Sign.SignatureData
////
////            // Generate the 4 possible Public Keys
////            List<String> recoveredKeys = new ArrayList<>();
////            for(int i = 0; i < 4; i++) {
////                BigInteger r = new BigInteger(1, signatureData.getR());
////                BigInteger s = new BigInteger(1, signatureData.getS());
////                ECDSASignature ecdsaSignature = new ECDSASignature(r, s);
////                BigInteger recoveredKey = Sign.recoverFromSignature((byte)i, ecdsaSignature, nonceHash);
////                if(recoveredKey != null) {
////                    recoveredKeys.add("0x" + Keys.getAddressFromKey(recoveredKey)); // org.web3j.crypto.Keys
////                }
////            }
////
////            // Check if one of the generated Keys match the public wallet ID.
////            for(String recoveredKey : recoveredKeys) {
////                if(recoveredKey.equalsIgnoreCase(publicWalletId)) {
////                    // Add Code here to create the JWT and add that to your HttpServletResponse. Not shown here.
////                    return user;
////                }
////            }
////            throw new CustomException("Message Sign Invalid", HttpStatus.UNAUTHORIZED);
////        }
////        catch (Exception ex) {
////            // Custom Error Handling.
////        }
////    }
////
////    public User findUserByPublicAddress(String publicWalletId) {
////        User u = userRepository.findByPublicWalletId(publicWalletId);
////        if(u == null) {
////            u = new User("", "", "", null, publicWalletId, "");
////            String nonce = StringUtil.generateRandomAlphaNumericString();
////            u.setNonce(nonce);
////            userRepository.saveAndFlush(u);
////        }
////        return u;
////    }
//
//}
