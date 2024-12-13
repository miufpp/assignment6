package org.miu.lesson9.problem3;

import java.util.Stack;

public class BrowserHistory {
    private String visited;
    public BrowserHistory(String homePage){
        this.visited=homePage;
        this.backHistory.push(visited);
    }

    private Stack<String> backHistory=new Stack<>();
    private Stack<String> forwardHistory=new Stack<>();

    public String visit(String url){
        backHistory.push(url);
        return "Visited: "+url;
    }

    public String moveBack(){
        if(backHistory.peek().isEmpty()) return "No history to go back to.";
        else{
            String backUrl=backHistory.pop();
            forwardHistory.push(backUrl);
            return "Back to: "+backUrl;
        }
    }
    public String moveForward(){
        if(forwardHistory.peek().isEmpty()) return "No forward history.";
        else{
            String forwardUrl=forwardHistory.pop();
            backHistory.push(forwardUrl);
            return "Forward to: "+forwardUrl;
        }
    }

}
