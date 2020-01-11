package dzien3.drzewa;

public class Main {
    public static void main(String[] args) {

        MyBST myBST = new MyBST();

        myBST.add(6);
        myBST.add(4);
        myBST.add(8);
        myBST.add(3);
        myBST.add(5);
        myBST.add(7);
        myBST.add(9);

        System.out.println(myBST.preOrder());
    }
}
