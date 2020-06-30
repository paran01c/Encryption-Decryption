package encryptdecrypt.algorithms;

public class AlgorithmFactory {

    public static Algorithms chooseAlg(String algorithm, String key, String message, String mode) {

        switch(algorithm) {
            case "shift":
                return new ShiftAlg(key, message, mode);
            case "unicode":
                return new UnicodeAlg(key, message, mode);
            default:
                return null;
        }
    }
}
