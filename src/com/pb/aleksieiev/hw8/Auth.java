package com.pb.aleksieiev.hw8;

public class Auth {

    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (isCorrectLogin(login) && isCorrectPassword(password, confirmPassword)) {
            this.login = login;
            this.password = password;
            System.out.println("Регестрация прошла успешно!");
        }
    }

    public void signIn(String login, String password) throws WrongLoginException{
        if (login.equals(this.login) && password.equals(this.password)){
            System.out.println("Вы успешно авторизовались");
        } else {
            throw new WrongLoginException("Введен неверный логин");
        }
    }

    private boolean isCorrectLogin(String login) throws WrongLoginException{
        if (login.matches("\\w{5,20}")){
            return true;
        } else if (login.length() < 5){
            throw new WrongLoginException("Логин должен быть больше 5 символов");
        } else if(login.length() > 20) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов");
        } else{
            throw new WrongLoginException("Логин должен содержать только латинские буквы и цифры");
        }
    }

    private boolean isCorrectPassword(String password, String confirmPassword) throws WrongPasswordException{
        if(password.equals(confirmPassword)){
            if(password.matches("\\w{5,}")){
                return true;
            } else {
                throw new WrongPasswordException("Пароль должен быть больше 5 символов и сожержать латинский буквы и символ \"_\"");
            }
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
