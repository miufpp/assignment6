package org.miu.lesson9.problem3;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory=new BrowserHistory("home.html");
        System.out.println(browserHistory.moveBack());
    }
}
