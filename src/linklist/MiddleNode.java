package linklist;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: MiddleNode
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-03-05 21:57
 * @version: v1.0
 */
public class MiddleNode {

    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        length = length / 2;
        while (length > 0) {
            head = head.next;
            length--;
        }
        return head;
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode discuss(ListNode head) {
        ListNode result = head;
        if(head != null && head.next!=null) {
            ListNode temp1 = head;
            ListNode temp2 = head;
            while(temp2 != null && temp2.next != null) {
                temp1 = temp1.next;
                temp2 = temp2.next.next;
            }
            result = temp1;
        }
        return result;
    }


}