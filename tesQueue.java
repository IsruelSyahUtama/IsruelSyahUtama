package tugas_strukdat2;

public class tesQueue {
    private int tail;
    private int head;
    private int size;
    private String data[];

    public static void main(String[] args) {
        
    
    tesQueue a = new tesQueue(5);
        a.add("Pak Purnomo");
        a.add("Pak Agus");
        a.add("Pak Supri");
        a.add("Nanda");
        a.add("Bu Ika");
        System.out.println("");
        a.infoQueue();
        System.out.println("");
        a.remove();
        System.out.println("");
        a.infoQueue();

    }
    
    public tesQueue(int kapasitas) {
        tail = -1;
        head = -1;
        size = kapasitas;
        data = new String[size];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return tail >= size - 1;
    }

    public void add(String input) {
        if (isEmpty()) {
            data[++head] = input;
            tail++;

        } else {
            if (isFull()) {
                System.out.println(" Antrian pembayaran Token Listrik ");
            } else {
                data[++tail] = input;
            }
        }
        System.out.println(input + " Antri pembayaran Token Listrik ");
}

    public void remove() {
        if (isEmpty()) {
            System.out.println("Konsumen kosong kosong");
        } else {
            String temp = data[head];
            for (int i = 0; i < tail; i++) {
                data[i] = data[i + 1];
            }
            tail--;
            System.out.println(temp + " Membayar Tagihan ");
        }
    }

    public void infoQueue() {
        System.out.println("Konsumen selanjutnya");
        for (int i = 0; i <= tail; i++) {
            System.out.println(i + ")" + data[i]);
        }
    }
    
    
}

