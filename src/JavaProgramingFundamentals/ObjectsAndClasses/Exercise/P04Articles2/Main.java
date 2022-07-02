package JavaProgramingFundamentals.ObjectsAndClasses.Exercise.P04Articles2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Article> articleList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];

            Article article = new Article(title, content, author);
            articleList.add(article);

        }
        String command = scanner.nextLine();

        printingList(articleList);
    }

    private static void printingList(List<Article> articleList) {
        for (Article article : articleList) {
            System.out.println(article.toString());
        }
    }
}
