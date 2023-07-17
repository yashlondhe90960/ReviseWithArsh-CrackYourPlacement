import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for(int i=0;i<p.length;i++){
            if(!s.isEmpty() && p[i].equals("..")) s.pop();

            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
            s.push(p[i]);

        }

        if(s.isEmpty()) return "/";
        while(!s.isEmpty()){
            res.insert(0,s.pop()).insert(0,"/");

        }
        return res.toString();
        
    }
}


    //     Deque<String> dirOrFiles = new ArrayDeque<>();
    //     for (String dirOrFile : path.split("/")) {
    //         if (!dirOrFiles.isEmpty() && dirOrFile.equals("..")) {
    //             dirOrFiles.removeLast();
    //         } else if (!dirOrFile.equals(".") && !dirOrFile.equals("") && !dirOrFile.equals("..")) {
    //             dirOrFiles.addLast(dirOrFile);
    //         }
    //     }
    //     StringBuilder simplified_path = new StringBuilder();
    //     for (String dirOrFile : dirOrFiles) {
    //         simplified_path.append("/").append(dirOrFile);
    //     }
    //     return simplified_path.length() == 0 ? "/" : simplified_path.toString();