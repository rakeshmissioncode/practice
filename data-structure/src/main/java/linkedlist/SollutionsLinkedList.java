package linkedlist;
public class SollutionsLinkedList {

    public ListNode rotateRight(ListNode head, int k) {

        //first two if statement  for base case
        if(head==null){
            return head;
        }
        if(k==0){
            return head;
        }

        ListNode current = head;

        // next while llop for getting ny=umber of nodes
        int size = 0;
        while(current!=null){
            size++;
            current = current.next;
        }

        //modular operation inorder to prevent unneccessary rotation
        k = k%size;
        if(k==0){
            return head;
        }

        //next while loop traverse till less k nodes
        int travel  = size -k;
        ListNode newTail = head;

        while(newTail!=null&travel--!=1){
            newTail = newTail.next;
        }

        //next steps just to add the elements to front
        current = newTail.next;
        ListNode newhead = current;
        newTail.next = null;

        while(current!=null&&current.next!=null){
            current =  current.next;
        }
        current.next = head;
        return  newhead;
    }


}
