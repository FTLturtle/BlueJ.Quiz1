
public class LoopFun
{

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number){
        Integer result = 1;
        for (int i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String[] stringArray = phrase.split(" ");
        String acronym = "";
        
        for(String s : stringArray){
            acronym += Character.toUpperCase(s.charAt(0));
        }
        
        return acronym;
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        String result = "";

        for (int i=0; i<word.length(); i++) 
        { 
            if (Character.isUpperCase(word.charAt(i))) 
            { 
                result += (char)(((int)word.charAt(i) + 3 - 65) % 26 + 65);
                // 3 is the shift amount, 65 is the int value of 'A', and 26 is how many letters there are in the alphabet
                // the char that gets added above will always be between A (int value 65) and Z (int value 90)
            } 
            else
            { 
                result += (char)(((int)word.charAt(i) + 3 - 97) % 26 + 97);
                // 3 is the shift amount, 97 is the int value of 'a', and 26 is how many letters there are in the alphabet
                // the resulting char above will always be between 'a' (int value 97) and 'z' (int value 122)
            } 
        } 

        return result;
    }
}
