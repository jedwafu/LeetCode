import others.stucture.ListNode;
import others.stucture.TreeNode;
import others.tool.Parser;
import others.tool.Printer;
import solutions.medium.*;

public class Main {

    public static void main(String[] args) {
//        ListNode head = Parser.list("[1, 2, 3, 4]");
//        TreeNode root = Parser.tree("[2, 1, 3, #, 4]");
//        TreeNode node = new No108().sortedArrayToBST(new int[]{1, 2});
        Printer.p(new No022().generateParenthesis(3));
    }

}
