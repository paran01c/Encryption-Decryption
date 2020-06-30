package encryptdecrypt;

import encryptdecrypt.algorithms.AlgorithmFactory;
import encryptdecrypt.algorithms.Algorithms;


public class Main {
    public static void main(String[] args) {

        //the apropriate agruments needed to the encryption
        String mode, key, data, in, out, alg;
        mode = Arguments.readArguments(args, "-mode", "enc");
        key = Arguments.readArguments(args, "-key", "0");
        out = Arguments.readArguments(args, "-out", "Standard");
        alg = Arguments.readArguments(args, "-alg", "shift");

        data = Arguments.readArguments(args, "-data", "noData");
        in = Arguments.readArguments(args, "-in", "noIn");

        //getting the input message
        String inputMessage = Message.inputMessage(data, in);

        //encrypting or decryping the message
        Algorithms algorithm = AlgorithmFactory.chooseAlg(alg, key, inputMessage, mode);

        String outputMessage = algorithm.useAlg();

        //outputing the message
        Message.outputMessage(out, outputMessage);

    }
}