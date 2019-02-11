
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder reverser = new StringBuilder(valueToBeReversed);
        reverser.reverse();
        return reverser.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length() / 2);
        /* NOTE: for a word with an even number of letters, there are two possible letters that
        could be considered the middle character. This method will always return the latter of
        those two characters. */
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char[] charArray = value.toCharArray();
        String result = "";
        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] != charToRemove) {
                result += charArray[i];
            }
        }
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] arrayOfWords = sentence.split(" ");
        return arrayOfWords[arrayOfWords.length - 1];
    }
}
