package JavaProgramingFundamentals.OldFinalExams;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String encryptedText = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(encryptedText);

        String input = scanner.nextLine();

        while (!input.equals("Decode")){
            String command = input.split("\\|")[0];

            if(command.equals("Move")){
                int index = Integer.parseInt(input.split("\\|")[1]);
            String substring = textBuilder.substring(0,index);
            textBuilder.delete(0,index);
            textBuilder.append(substring);

            }else if (command.equals("Insert")){
                int index = Integer.parseInt(input.split("\\|")[1]);
                String substring = input.split("\\|")[2];
                textBuilder.insert(index,substring);

            }else if(command.equals("ChangeAll")){
                String oldSubstring = input.split("\\|")[1];
                String newSubstring = input.split("\\|")[2];

                String replaceText = textBuilder.toString().replace(oldSubstring,newSubstring);

                textBuilder = new StringBuilder(replaceText);
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",textBuilder);
    }
}
