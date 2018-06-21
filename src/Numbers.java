import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb");
        int size = scan.nextInt();

        double[] tab = new double[size];

        for(int i=0; i<tab.length; i++){
            System.out.println("Podaj " + (i+1) + " liczbę: ");
            tab[i]=scan.nextInt();
        }

        FileWriter fileWriter = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i=0; i<tab.length; i++){
            bufferedWriter.write(String.valueOf(tab[i]));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();


    }
}
