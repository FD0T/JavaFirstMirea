package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void writeIn(String str){
        try(FileWriter writer = new FileWriter("src/ru/mirea/task15/writeInTest.txt", false))
        {
            //запись всей строки
            writer.write(str);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void readOut(){
        try(FileReader reader = new FileReader("src/ru/mirea/task15/readOutTest.txt"))
        {
            // читаем файл посимвольно (как в задании на c++)
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
            catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Напишите текст");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        writeIn(str);
        System.out.println("Проверьте Ваш файл! writeInTest.txt");
        System.out.println("Вот, что написано в readOutTest.txt:");
        readOut();
    }
}