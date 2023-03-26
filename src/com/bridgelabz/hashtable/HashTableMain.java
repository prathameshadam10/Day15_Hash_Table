package com.bridgelabz.hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        String paraGraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

//        for (String word : wordsArray) {
//            System.out.print(word + " => ");
//            System.out.println(word.hashCode());
//        }
        HashTable<String, Integer> hashTable = new HashTable<>(6);

//        System.out.println(hashTable.bucketArray);
//        for(MyLinkedList<String, Integer> list : hashTable.bucketArray)
//        System.out.println(list);

        String[] wordsArray = paraGraph.split(" ");
        for (String word : wordsArray){
//        int index = hashTable.getIndex(word);
//            System.out.println(word + " -> " + word.hashCode() + " -> " + index);
//        }
    Integer currentFrequency = hashTable.getIndex(word);
    if(currentFrequency == null)
        currentFrequency = 1;
    else
        currentFrequency++;
    hashTable.addOrUpdate(word, currentFrequency);

        }
        System.out.println(hashTable);


    }
}