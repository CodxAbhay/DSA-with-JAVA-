import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    static void reversearray(ArrayList<Integer> list){
        int i =0, j=list.size()-1;
        while(i>j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(22);
        l.add(1);
        l.add(17);
        l.add(12);
        l.add(88);
        System.out.println("Original list: "+ l);

        Collections.reverse(l);
        System.out.println("After reversing by Collection classs : "+l);

        reversearray(l);
        System.out.println("By method reversing : "+l);
        
        Collections.sort(l);
        System.out.println("Assending order sort : "+l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Dessending order sort: "+l);


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Hello ");
        l1.add("Welcome");
        l1.add("Abhay");
        l1.add("Verma");

        Collections.sort(l);
        System.out.println("In Assending order : "+l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("In decending order : "+l1);
    }


}
