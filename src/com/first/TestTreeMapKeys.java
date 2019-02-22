package com.first;

import java.util.TreeMap;

public class TestTreeMapKeys{
public static void main(String ar[]){
 TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
 tree.put(1, "one");
 tree.put(2, "two");
 tree.put(3, "three");
 tree.put(4,"Four");
    System.out.println(tree.higherKey(3));
    System.out.println(tree.ceilingKey(3));
    System.out.println(tree.floorKey(0));
    System.out.println(tree.lowerKey(1));
}}
