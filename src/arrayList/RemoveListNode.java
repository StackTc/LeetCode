package arrayList;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: RemoveListNode
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: ??????????
 * <br>
 * Function:
 * <br>
 *
 * @author lintiancheng
 * @create time?2019-06-21 17:55
 * @version: v1.0
 */
public class RemoveListNode {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        removeElements(node1, 6);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode temp = result;

        while (temp.next != null) {
            while (temp.next != null && temp.next.val == val) {
                temp.next = temp.next.next;
            }

            if (temp.next != null) {
                temp = temp.next;
            }
        }
        return result.next;
    }

}