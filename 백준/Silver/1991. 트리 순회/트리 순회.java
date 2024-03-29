import java.util.*;
import java.io.*;

public class Main {
    // Variable
    private static int n;
    // Main
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        // Initialize 
        Node[] orgArr = new Node[n];
        char al = 'A';
        for(int i=0;i<n;i++) orgArr[i] =  new Node(al++);
        // Input 
        for(int i=0;i<n;i++){
            char[] line = br.readLine().toCharArray();
            orgArr[line[0]-65].left = line[2]=='.'? null : orgArr[line[2]-65];
            orgArr[line[0]-65].right = line[4]=='.'? null : orgArr[line[4]-65];
        }
        
        // Logic
        // preorder
        System.out.println(preorder(orgArr[0]));
        // inorder
        System.out.println(inorder(orgArr[0]));
        // postorder 
        System.out.println(postorder(orgArr[0]));
        
    }
    // Method - 본-좌-우
    private static String preorder(Node node){
        String retVal = "";
        retVal += node.self;
        if(node.left != null) retVal += preorder(node.left);
        if(node.right != null) retVal += preorder(node.right);
        return retVal;
    }
    // Method - 좌-본-우
    private static String inorder(Node node){
        String retVal = "";
        if(node.left != null) retVal += inorder(node.left);
        retVal += node.self;
        if(node.right != null) retVal += inorder(node.right);
        return retVal;    
    }
    // Method - 좌-우-본
    private static String postorder(Node node){
        String retVal = "";
        if(node.left != null) retVal += postorder(node.left);
        if(node.right != null) retVal += postorder(node.right);
        retVal += node.self;
        return retVal;    
    }
    // Inner Class - 본인값, 좌측 자식, 우측 자식을 저장하고자 만든 클래스
    private static class Node{
        char self;
        Node left, right;
        public Node(char self){
            this.self = self;
        }
        public String toString(){
            return self+"";
        }
    }
}