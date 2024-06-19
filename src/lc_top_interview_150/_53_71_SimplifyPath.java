package lc_top_interview_150;

import java.util.Stack;

public class _53_71_SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directories = path.split("/");
        for (String dir : directories) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        String path1 = "/home//foo/";
        String res = simplifyPath(path1);
        System.out.println(res);
    }
}
