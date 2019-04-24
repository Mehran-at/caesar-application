package caesarapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caesar {

    public String getCipherText(TextAndKey textAndKey) {

        int key = textAndKey.getKey();

        List<String> ciphertext = new ArrayList<>();

        String plainText = textAndKey.getPlainText();
        List<String> listOfLetterOfPlainText = convertPlainTextArrayToArrayList(plainText);

        if (isNotAlphabetic(plainText)) {
            return plainText;
        }

        for (String letter : listOfLetterOfPlainText) {
            int asciiNumberOfPlainTextLetter = convertStringToInt(letter);
            asciiNumberOfPlainTextLetter = asciiNumberOfPlainTextLetter + key;
            String convertedIntToStringWithKeyNumber = convertIntToString(asciiNumberOfPlainTextLetter);
            ciphertext.add(convertedIntToStringWithKeyNumber);
        }
        String joinedString = String.join("", ciphertext);
        return joinedString;
    }

    private boolean isNotAlphabetic(String plainText) {
        return !Character.isAlphabetic(plainText.charAt(0));
    }

    private List<String> convertPlainTextArrayToArrayList(String plainText) {
        String[] split = plainText.split("");
        return new ArrayList<>(Arrays.asList(split));
    }

    private int convertStringToInt(String letter) {
        int ascii = letter.toCharArray()[0];
        return ascii;
    }

    private String convertIntToString(int asciiNumber) {
        String convertedStringFromInt = Character.toString((char) asciiNumber);
        return convertedStringFromInt;
    }

}