package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage;

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }

        System.out.println("방문: " + url);
        currentPage = url;
    }

    public String goBack() {
        if (history.isEmpty()) {
            return null;
        }

        String previousPage = history.pop();
        System.out.println("뒤로 가기: " + previousPage);
        return previousPage;
    }

}
