package encryptdecrypt.algorithms;

public abstract class Algorithms {

    public int key;
    public String message;
    public String mode;

    public Algorithms (String key, String message, String mode) {
        this.key = Integer.parseInt(key);
        this.message = message;
        this.mode = mode;
    }

    public String useAlg() {
        char[] inputMessageChars = message.toCharArray();
        char[] outputMessageChars = new char[inputMessageChars.length];

        for(int i = 0, n = inputMessageChars.length; i < n; i++) {
            outputMessageChars[i] = useKey(inputMessageChars[i]);
        }

        return new String(outputMessageChars);
    }

    protected abstract char useKey(char letter);
}

class ShiftAlg extends Algorithms {

    public ShiftAlg (String key, String message, String mode) {
        super(key, message, mode);
    }

    @Override
    public char useKey(char letter) {

        if (Character.isLetter(letter)) {
            for (int i = 1; i <= key; i++) {
                if (mode.equals("enc")) {

                    if (letter == 'z') {
                        letter = 'a';
                    } else if (letter == 'Z') {
                        letter = 'A';
                    } else {
                        letter = (char) (letter + 1);
                    }
                } else {

                    if (letter == 'a') {
                        letter = 'z';
                    } else if (letter == 'A') {
                        letter = 'Z';
                    } else {
                        letter = (char) (letter - 1);
                    }
                }
            }
        }

        return letter;
    }

}

class UnicodeAlg extends Algorithms {

    public UnicodeAlg (String key, String message, String mode) {
        super(key, message, mode);
    }

    @Override
    protected char useKey(char letter) {
        for(int i = 1; i <= key; i++) {
            if(mode.equals("enc")) {
                letter = (char)(letter + 1);
            } else {
                letter = (char)(letter - 1);
            }
        }

        return letter;
    }
}


