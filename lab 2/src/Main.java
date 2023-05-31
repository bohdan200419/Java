public class Main {
    public static void main(String[] args) {
        String text ="NLTU, IDKTD,\n" +
                "Computer Technology and Design, IST-21, 126 Information systems and technologies";

        // Task 1
        char[] characterArray = {'N', 'L', 'T', 'U', ',', ' ','I', 'D', 'K', 'T', 'D', ' ','I', 'S', 'T', '-', '2', '1', ',', ' ', '1', '2', '6', ' ',
                'I', 'n', 'f', 'o', 'r', 'm','a', 't', 'i', 'o', 'n', ' ', 's', 'y', 's', 't', 'e', 'm', 's', ' ', 'a', 'n', 'd', ' ', 't', 'e','c', 'h', 'n', 'o', 'l', 'o', 'g', 'i', 'e', 's'};

        // Task 2
        String string1 = "NLTU, IDKTD, IST-21, 126 Information systems and technologies ";
        System.out.println("Task 2: " + string1.substring(0, string1.lastIndexOf(",") + 1));

        // Task 3
        StringBuilder text2 = new StringBuilder();
        text2.append(string1);
        text2.reverse();
        System.out.println("Task 3: " + text2);

        //Task 4
        String string3 = string1.toUpperCase();
        System.out.println("Task 4: " + string3);
        System.out.println("Task 4: " +string1.equals(string3));

        // Task 5
        System.out.println("Task 5: " + string1.split(", ")[2]);

        //Task 6
        String string4 = string1 + string3;
        System.out.println("Task 6: " + string4);

        // Task 7
        System.out.println("Task 7: Індекс першої букви 'r' :" + string1.indexOf("r"));
        System.out.println("Task 7: Індекс останньої букви 'n' :" + string1.lastIndexOf("n"));

        // Task 8
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append ("Рехман Богдан Романович 19.02.2004");
        System.out.println("Task 8: " + stringBuffer);

        // Task 9
        System.out.println("Task 9: " + stringBuffer.substring( 0, stringBuffer.lastIndexOf("h") + 1));

        // Task 10
        String placeOfBirth = "  Івана Пулюя, Львів, Україна";
        System.out.println("Task 10: " + stringBuffer.append(placeOfBirth));

        // Task 11
        stringBuffer.insert(36, " Male,");
        System.out.println("Task 11: " + stringBuffer);

        // Task 12
        System.out.println("Task 12: characters length: " + stringBuffer.length());
        System.out.println("Task 12: bytes length: " +  stringBuffer.toString().getBytes().length);

        // Task 13
        System.out.println("Task 13: " + stringBuffer.delete(stringBuffer.length() - 46, stringBuffer.length()));

        // Task 14
        stringBuffer.reverse();
        System.out.println("Task 14: " + stringBuffer);

    }
}
