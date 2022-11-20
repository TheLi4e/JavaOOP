package Lesson5;

public class Main {
    public static void main(String[] args) {
        MyView myView = new MyView();
        DataBase dataBase = new DataBase();
        Authorization authorization = new Authorization(myView, dataBase);
        dataBase.createData();
        boolean canWork = false;
        while(!canWork) {
            canWork = authorization.checkUser();
        }
        myView.printAll(dataBase.getUsersList());
    }
}
