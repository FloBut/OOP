package EX_EXCEPTII;

public class Ex1 {

    public static void main(String[] args) {
        String s = "1 7 abc 2 6 5";
        //iau fiecare numar din string
        //il pun intr-un sir

        try {
            int[] numbers = convert(s);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public static int[] convert (String s) throws NumberFormatException{
        String[] numbersStrings = s.split(" ");
        int[] numbers = new int[numbersStrings.length];
        for (int i = 0; i< numbersStrings.length; i++){
            //pe fiecare numbers[i] il convertesc la numar
                numbers[i] = Integer.parseInt(numbersStrings[i]);
            }
        return numbers;
    }
}
