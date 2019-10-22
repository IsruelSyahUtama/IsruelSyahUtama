package tugas_strukdat;

public class tesStack {
    
    private String data[];
    private int Size;
    private int Top;

    
    public static void main(String[] args) {
        tesStack s = new tesStack(4);
        s.push("Ikan Lele");
        s.push("Ikan Nila");
        s.push("Ikan Bawal");
        s.pop();
        s.pop();
        System.out.println("");
        s.infoStack();
    }

    public tesStack (int kapasitas){
        Size = kapasitas;
        Top = -1;
        data = new String [Size];


    }

    public boolean isEmpty(){
        return Top==-1;

    }
    public boolean isFull(){
        return Top == Size-1;
    }
    public void push (String input){
        if(isFull()){
            System.out.println("Kolam telah penuh");
        } else {
            data[++Top]= input;
            System.out.println(input+ " Masuk ke dalam Kolam ");


        }

    }
    public void pop () {
        if(isEmpty()){
            System.out.println(" Kolam kosong");
        } else {

            String temp = data[Top];
            data[Top]= data[Top--];
            System.out.println(temp+ " Dikeluarkan dari Kolam");

        }
    }

    public void infoStack(){
        System.out.println(" Ikan yang tersisa di dalam kolam: ");
        for(int i =0; i<=Top;i++){

            System.out.println("*" +data[i]);
        }






    }
    
}