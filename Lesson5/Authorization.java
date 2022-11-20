package Lesson5;

public class Authorization implements Presenter {
    private MyView myView;
    private DataBase dataBase;

    public Authorization(MyView myView, DataBase dataBase) {
        this.myView = myView;
        this.dataBase = dataBase;
    }

    @Override
    public boolean checkUser() {
        String login = myView.getLogin();

        boolean bool = false;
        if(!dataBase.getUsersList().containsKey(login)){
            myView.print("Пользователь не найден");
            return bool;
        }
        else{
            String password = myView.getPassword();
            for(String user : dataBase.getUsersList().keySet()){
                if(user.equals(login)){
                    if(password.equals(dataBase.getUsersList().get(login))){
                        myView.print("Авторизация успешна");
                        bool =  true;
                    } else {
                        myView.print("Ошибка авторизации");
                        bool = false;
                    }
                }
            }
        }
        return bool;
    }

}
