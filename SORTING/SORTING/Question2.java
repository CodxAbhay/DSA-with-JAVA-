/* given an array of name of fruits : you are sopposd to sort the array in 
lexicographical oreder using selction sort
  To compare the string in lexiographical order we have a method called
  S1.compareTo(S2)  */


public class Question2 {
    static void sortFruit(String [] fruits){
        int n = fruits.length;
        for(int i=0; i<n-1; i++){
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }
    public static void main(String[] args) {

        String [] fruits = {"kiwi","apple","papaya","mango","Abhay"};
        sortFruit(fruits);
        for(String i : fruits){
            System.out.print(i+" ");
        }
        
    }
}
