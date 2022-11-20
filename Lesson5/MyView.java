package Lesson5;

import java.util.Map;
import java.util.Scanner;

public class MyView implements View{
    private Scanner scanner;

    public MyView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void printAll(Map<String, String> usersList) {
        System.out.println(usersList.keySet());
    }

    @Override
    public String getLogin() {
        System.out.println("Введите Логин: ");
        return scanner.nextLine();
    }

    @Override
    public String getPassword() {
        System.out.println("Введите Пароль: ");
        return scanner.nextLine();
    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
