import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<Integer>();
        heap.add(0);
    }

    public void insert(int val) {
        heap.add(val);

        int p = heap.size() - 1;
        while (p > 1 && heap.get(p) > heap.get(p / 2)) {
            int tmp = heap.get(p / 2);
            heap.set(p / 2, heap.get(p));
            heap.set(p, tmp);
            p /= 2;
        }
    }

    public int delete() {
        if (heap.size() - 1 < 1) {
            return 0;
        }
        int deleteitem = heap.get(1);
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int pos = 1;
        while ((pos * 2) < heap.size()) {
            int max = heap.get(pos * 2);
            int maxPos = pos * 2;

            if ((pos * 2 + 1) < heap.size() && max < heap.get(pos * 2 + 1)) {
                max = heap.get(pos * 2 + 1);
                maxPos = pos * 2 + 1;
            }
            if (heap.get(pos) > max) {
                break;
            }
            int tmp = heap.get(pos);
            heap.set(pos, max);
            heap.set(maxPos, tmp);
            pos = maxPos;

        }
        return deleteitem;
    }

    public static void main(String[] args) {
        MaxHeap  maxheap = new MaxHeap();

        maxheap.insert(7);
        maxheap.insert(5);
        maxheap.insert(3);
        maxheap.insert(2);
        maxheap.insert(2);
        maxheap.insert(1);
        maxheap.insert(9);
        maxheap.insert(6);
        maxheap.insert(4);

        System.out.println(maxheap.delete());
        System.out.println(maxheap.delete());
    }
}