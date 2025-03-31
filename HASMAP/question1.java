// Given an array , find the most frequent element in it .
// if there are multiple elements that appear a maximum number of times , print any one of them

import java.util.*;

public class question1 {
    public static void main(String[] args) {

        int [] arr = {1,1,2,2,2,3,4,5,5,6,2,2,4,5,3,3};
        Map<Integer,Integer> freq = new HashMap<>();

        // making frequency of every el present in arr
        for(var el : arr){
            if(!freq.containsKey(el)){ // if the new ele is not present in hasmap 
                freq.put(el, 1);

            }else{ // if the ele exist in hasmap then update the value 
                freq.put(el, freq.get(el)+1);  // here new key will not enter because it already exist but it will update
            }
        }
        System.out.println(freq.entrySet()); 
        // now need to find the maximum frequency
        int maxFreq = 0 , anskey=0;
        for(var e : freq.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey);
    }
}
