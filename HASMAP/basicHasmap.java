// basic implitation of hasmap 
// read this for better understand about hashmap in java


import java.util.*;

public class basicHasmap {

    static void HasMapMethods(){
        // creating hasmap // santax
        Map<String, Integer> mp = new HashMap<>();
        mp.put("abhay", 21);
        mp.put("ankit", 23);
        mp.put("akash", 51);
        mp.put("priya", 31);
        mp.put("yash", 26);
        
        mp.put("sachin", 21);
        mp.put("sachin", 46); // beacuse sachin key already exist so it will not add another key but  it will update the value 

        System.out.println(mp.get("abhay"));// will return value
        System.out.println(mp.get("abhi")); // will return null because this key does not exist

        System.out.println(mp.remove("abhay"));
        System.out.println(mp.remove("gaurav"));// this will print null beacuse it does not exist

        System.out.println(mp.containsKey("abhay"));// print false beacuse we have already removed it

        // adding a new entry only if the new key does not exist already in hasmap
        mp.putIfAbsent("neetu", 21);// this will add this beacuse this entry does not exist
        // getting all key only
        System.out.println(mp.keySet());
        // getting all value only
        System.out.println(mp.values());
        // getting all key value pair in a set format
        System.out.println(mp.entrySet()); // set view of all entry

        // traverse all the entry and print them
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
            System.out.println();
        }

    }
    
    
    
    
    public static void main(String[] args) {
        HasMapMethods();
    }
}
