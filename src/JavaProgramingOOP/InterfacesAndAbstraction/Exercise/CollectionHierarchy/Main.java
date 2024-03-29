package JavaProgramingOOP.InterfacesAndAbstraction.Exercise.CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] words = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());

        performAddOperations(words,addCollection);
        performAddOperations(words,addRemoveCollection);
        performAddOperations(words,myList);

        performRemoveOperation(number,addRemoveCollection);
        performRemoveOperation(number,myList);

    }

    public static void  performAddOperations(String[] words, Addable addable){
        for (String word : words) {
            System.out.print(addable.add(word) + " ");
        }
        System.out.println();
    }
    
    public static void performRemoveOperation(int counter, AddRemovable addRemovable){
        for (int i = 0; i < counter; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();
    }
}
