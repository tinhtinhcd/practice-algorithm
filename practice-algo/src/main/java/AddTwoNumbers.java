import Util.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int memorize = 0;
        int val = l1.val + l2.val + memorize;
        memorize = val / 10;
        ListNode rs = new ListNode(val % 10);
        next(l1.next, l2.next, memorize, rs);
        return rs;
    }

    private ListNode next(ListNode l1, ListNode l2, int memorize, ListNode rs) {

        if (l1 == null && l2 == null) {
            if (memorize != 0)
                rs.next = new ListNode(memorize);
            return rs;
        }
        if (l1 != null && l2 != null) {
            int val = l1.val + l2.val + memorize;
            memorize = val / 10;
            rs.next = new ListNode(val % 10);
            next(l1.next, l2.next, memorize, rs.next);
        }
        else if (l1 != null) {
            int val = (l1.val + memorize);
            l1.val = val % 10;
            memorize = val / 10;
            rs.next = l1;
            next(l1.next, null, memorize, rs.next);
        }
        else if (l2 != null) {
            int val = (l2.val + memorize);
            l2.val = val % 10;
            memorize = val / 10;
            rs.next = l2;
            next(null, l2.next, memorize, rs.next);
        }

        return rs;
    }


}
