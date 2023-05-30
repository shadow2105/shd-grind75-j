package linkedlist;

public class MergeTwoSortedLists {

    // Time Complexity: O(n+m) , 'n' and 'm' are lengths of list1 and list2 respectively; Space Complexity: O(1)
    // LeetCode - Runtime: 0 ms ; Memory : 41.6 MB
    public static ListNode solution(ListNode list1, ListNode list2) {
        if(list1 == null) { return list2; }
        else if(list2 == null) { return list1; }

        ListNode l1CurrentNode = list1;
        ListNode l2CurrentNode = list2;
        ListNode mergedList;
        if(l1CurrentNode.val <= l2CurrentNode.val) {
            mergedList = l1CurrentNode;
            l1CurrentNode = l1CurrentNode.next;
        }
        else {
            mergedList = l2CurrentNode;
            l2CurrentNode = l2CurrentNode.next;
        }

        ListNode currentNode = mergedList;
        while(l1CurrentNode != null && l2CurrentNode != null) {
            if(l1CurrentNode.val <= l2CurrentNode.val) {
                currentNode.next = l1CurrentNode;
                l1CurrentNode = l1CurrentNode.next;
            }
            else {
                currentNode.next = l2CurrentNode;
                l2CurrentNode = l2CurrentNode.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = (l1CurrentNode != null) ? l1CurrentNode : l2CurrentNode;
        return mergedList;
    }

    // Time Complexity: O(n+m) , 'n' and 'm' are lengths of list1 and list2 respectively; Space Complexity: O(1)
    // LeetCode - Runtime: 0 ms ; Memory : 41.9 MB
    public static ListNode solutionNewObj(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode currentNode = mergedList;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            }
            else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = (list1 != null) ? list1 : list2;
        return mergedList.next;
    }
}
