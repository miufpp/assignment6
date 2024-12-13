package org.miu.lesson9.problem3;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory=new BrowserHistory("home.html");
        System.out.println(browserHistory.moveBack());
        browserHistory.visit("google.html");
        browserHistory.visit("myjoyonline.html");
        System.out.println(browserHistory.moveBack());
        System.out.println(browserHistory.moveForward());
    }
}
