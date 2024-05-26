public class MoveAllXToTheEndOfTheString {
    public static void main(String[] args) {
        String inputStr = "xxxjyxxotxi";
        moveAllX(0, inputStr, 0, "");
    }

    public static void moveAllX(int idx, String inputString, int countOfX, String newString) {
        if (idx == inputString.length()) {
            for (int i = 0; i < countOfX; i++) {
                newString += 'x';
            }
            System.out.println("New String is " + newString);
            return;
        }
        if ('x' == inputString.charAt(idx)) {
            countOfX++;
        } else {
            newString += inputString.charAt(idx);
        }
        moveAllX(idx + 1, inputString, countOfX, newString);

    }
}

