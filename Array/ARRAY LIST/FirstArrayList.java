// basic operation of array list 
// how to make an array list by defing the type and also by not defining 




import java.util.ArrayList;
public class FirstArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);

        System.out.println(l);
        System.out.println(l.get(2));

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        l.add(2,123);  // inserting an element at spacific position 
        System.out.println("Adding element at some given index "+l);

        l.remove(2);
        System.out.println("After removing an element from spacific index :  "+l);

        l.remove(Integer.valueOf(33));
        System.out.println("removed element by giving element value : "+l);

        // creating an array list without teeling the type so in this
        //  type of arraylist we can add any type of element  including all type 


        ArrayList l1 = new ArrayList<>();

        l1.add("Abhay ");
        l1.add(23);
        l1.add(45.5f);
        l1.add("A");
        System.out.println(l1);

    }
}












/* 
[1, 11, 22, 33, 44]
22
1
11
22
33
44
Adding element at some given index [1, 11, 123, 22, 33, 44]
After removing an element from spacific index :  [1, 11, 22, 33, 44]
removed element by giving element value : [1, 11, 22, 44]
[Abhay , 23, 45.5, A]
*/