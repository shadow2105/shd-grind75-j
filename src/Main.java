import linkedlist.ListNode;
import linkedlist.MergeTwoSortedLists;

public class Main {
    public static void main(String[] args) {
        System.out.println("MergeTwoSortedLists");

        ListNode node13 = new ListNode(4);
        ListNode node12 = new ListNode(2, node13);
        ListNode list1 = new ListNode(1, node12);

        ListNode node23 = new ListNode(4);
        ListNode node22 = new ListNode(3, node23);
        ListNode list2 = new ListNode(1, node22);

        printList(list1);
        printList(list2);

        printList(MergeTwoSortedLists.solution(list1, list2));
        //printList(MergeTwoSortedLists.solutionNewObj(list1, list2));
    }

    public static void printList(ListNode head) {
        ListNode currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.getVal() + " -> ");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }
}