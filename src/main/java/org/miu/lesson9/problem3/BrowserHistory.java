package org.miu.lesson9.problem3;

import java.util.Stack;

public class BrowserHistory {
    private String visited;
    private Stack<String> backHistory = new Stack<>();
    private Stack<String> forwardHistory = new Stack<>();

    public BrowserHistory(String homePage) {
        this.visited = homePage;
        backHistory.push(homePage);
    }

    public String visit(String url) {
        backHistory.push(url);
        forwardHistory.clear(); // Clear forward history when visiting a new URL
        visited = url;
        return "Visited: " + url;
    }

    public String moveBack() {
        if (backHistory.size() <= 1) {
            return "No history to go back to.";
        } else {
            forwardHistory.push(backHistory.pop());
            visited = backHistory.peek();
            return "Back to: " + visited;
        }
    }

    public String moveForward() {
        if (forwardHistory.isEmpty()) {
            return "No forward history.";
        } else {
            String forwardUrl = forwardHistory.pop();
            backHistory.push(forwardUrl);
            visited = forwardUrl;
            return "Forward to: " + visited;
        }
    }

    public String getCurrentPage() {
        return visited;
    }
}