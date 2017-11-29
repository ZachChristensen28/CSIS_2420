/*
* @author  Daniel Taylor
* @version 1.0
* @since   13 November 2017


Finish the methods of set Union, Intersection and Difference we began in class. 
Test these methods using our data set from awmt.txt by first inserting the words
into a List data structure then transforming this into a TreeSet. Use an 
iterator to walk through the TreeSet creating two sets A and B. A should contain
the unique words of length 7 or less and B should contain all words of length 4 
or greater. Use these sets to test your implementation of the set operators by 
forming (A union B), (A intersect B) and (A difference B).

*/

import java.io.*;
import java.util.*;


public class SpecialAssignment {
    public static void main(String[] args) throws IOException{
        
        //Create a List then a TreeSet out of awmt.txt
        String[] wordArray = utilities.fileToStringArray("./awmt.txt");
        java.util.List<String> wordList = Arrays.asList(wordArray);
        TreeSet<String> wordSet = new TreeSet<String>(wordList);
        
        //Create Iterator and walk through TreeSet, create setA (<7 char words)
        Iterator<String> ity = wordSet.iterator();
        TreeSet<String> setA = new TreeSet<String>();
        while (ity.hasNext()){
            String ele = ity.next();
            if(setACondition(ele)){ //adds to setA if str < 7
                setA.add(ele);
            }
        }
       
        //Create Iterator and walk through TreeSet, create setB (>3 char words)
        Iterator<String> it = wordSet.iterator();
        TreeSet<String> setB = new TreeSet<String>();
        while (it.hasNext()){
            String elem = it.next();
            if(setBCondition(elem)){ //adds to setA if str < 7
                setB.add(elem);
            }
        }
        
        //Use setA and setB to test implementation of (A Union B)
        TreeSet<String> unionAB = union(setA, setB);
        System.out.println("setA size = " + setA.size() + ", setB size = " + setB.size() + ", union size.........." + unionAB.size());
    
        //Use setA and setB to test implementation of (A Intersection B)
        TreeSet<String> intersectionAB = intersection(setA, setB);
        System.out.println("setA size = " + setA.size() + ", setB size = " + setB.size() + ", intersection size..." + intersectionAB.size());
        
        //Use setA and setB to test implementation of (A Difference B)
        TreeSet<String> differenceAB = difference(setA, setB);
        System.out.println("setA size = " + setA.size() + ", setB size = " + setB.size() + ", difference size....." + differenceAB.size());
    }
    
    public static boolean setACondition (String str) {
        return (str.length() < 8);
    }
    
    public static boolean setBCondition (String str) {
        return (str.length() > 3);
    }
    
    public static TreeSet<String> union (TreeSet<String> inputTreeSet, TreeSet<String> inputTreeSet2) { 
        
        
        TreeSet<String> aCopy = new TreeSet<String>(inputTreeSet);
        TreeSet<String> bCopy = new TreeSet<String>(inputTreeSet2);
        TreeSet<String> union = aCopy;
        union.addAll(bCopy);
        
        return union;
    }
    
    public static TreeSet<String> intersection (TreeSet<String> inputTreeSet, TreeSet<String> inputTreeSet2) { 
        
        TreeSet<String> aCopy = new TreeSet<String>(inputTreeSet);
        TreeSet<String> bCopy = new TreeSet<String>(inputTreeSet2);
        TreeSet<String> intersection = aCopy;
        intersection.retainAll(bCopy);
        
        return intersection;
    }
    
    public static TreeSet<String> difference (TreeSet<String> inputTreeSet, TreeSet<String> inputTreeSet2) { 
        
        TreeSet<String> aCopy = new TreeSet<String>(inputTreeSet);
        TreeSet<String> bCopy = new TreeSet<String>(inputTreeSet2);
        TreeSet<String> difference = aCopy;
        difference.removeAll(bCopy);
        
        return difference;
    }
}