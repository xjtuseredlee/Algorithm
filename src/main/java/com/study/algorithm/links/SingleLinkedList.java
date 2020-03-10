package com.study.algorithm.links;


class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}

public class SingleLinkedList {
    ListNode head = null;

    public SingleLinkedList(){
        head = new ListNode(0);
    }

    /**
     * get(index)：获取链表中第index个节点的值。如果索引无效，则返回-1。
     *
     * addAtHead(val)：在链表的第一个元素之前添加一个值为val的节点。插入后，新节点将成为链表的第一个节点。
     *
     * addAtTail(val)：将值为val 的节点追加到链表的最后一个元素。
     *
     * addAtIndex(index,val)：在链表中的第index个节点之前添加值为val的节点。如果index等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。
     *
     * deleteAtIndex(index)：如果索引index 有效，则删除链表中的第index 个节点。
     *
     * 作者：crush_d872
     * 链接：https://www.jianshu.com/p/44eb34e017c3
     * 来源：简书
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param
     */
    public int get(int index) {
        ListNode cur = head.next;
        int num = -1;
        while(cur != null){
            num++;
            if(num == index){
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }

    /**
     *
     * @param val
     */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next=head.next;
    }

    /**
     *
     * @param val
     */
    public void addAtTail(int val) {
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new ListNode(val);
    }

    /**
     *
     * @param index
     * @param val
     */
    public void addAtIndex(int index, int val) {
        ListNode cur = head.next;
        int num = -1;
        while(cur != null){
        num++;
        if(num == index){
            ListNode node = new ListNode(index);
            node.next=cur.next;
            cur.next = node;
        }
        cur = cur.next;
        }
    }

    /**
     *
     * @param index
     */
    public void deleteAtIndex(int index) {
        ListNode cur = head;
        int num = -1;
        ListNode node = new ListNode(index);
        while(cur.next != null){
            num++;
            if(num == index){
                ListNode temp = cur.next;
                cur.next = temp.next;
                break;
            }
        }
    }

    public static void main(String args []) {

        SingleLinkedList list = new SingleLinkedList();
        int x = list.get(0);
        list.addAtHead(10);
        System.out.println("x..."+x);
        System.out.println("list..."+list.get(1));

    }
}

