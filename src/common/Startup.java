package common;

import java.util.*;

public class Startup {

    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "Mr.", "222-22-2222");
        Employee e2 = new Employee("Crocket", "Davie", "111-11-1111");
        Employee e3 = new Employee("Jennings", "Barbra", "333-33-3333");
        Employee e4 = new Employee("Nuzak", "Sara", "111-11-1111");
          /**
           * List with out generics
           * Lab 2
           */
//        List list = new ArrayList();
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        System.out.println("The size of the list is: " + list.size());
//        for(int i = 0; i < list.size(); i++){
//            Employee a = (Employee)list.get(i);
//            if(i == 1){
//            System.out.println(a.toString());
//            }
//       
//        }
//        
//        System.out.println("----------------------------");
//        System.out.println("The size of the list is: " + list.size());
//        for(int i = 0; i < list.size(); i++){
//            Employee a = (Employee)list.get(i);
//                        
//            
//            System.out.println(a.toString());
//        }
        
        /**
         * List with generics
         * Lab 3
         */
//        List<Employee> list = new ArrayList<Employee>();
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        
//        for(Employee e : list){
//            System.out.println(e);
//        }
//        
         /**
          * List with generics converted to set
          * and back to list to remove duplicates
          * Lab 4
          */
//        List<Employee> list = new ArrayList<Employee>();
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        
//        for(Employee e : list){
//            System.out.println(e);
//        }
//        Set<Employee> set = new HashSet<Employee>(list);
//        List<Employee> addvisedList = new ArrayList<Employee>(set);
//        System.out.println("---------");
//        for(Employee e : addvisedList){
//            System.out.println(e);
//        }
        
        
          /**
           * Using a map to store data
           * SSN used as key employee used as value
           * Lab 5
           */
//        Map<String, Employee> map = new HashMap<String, Employee>();
//        map.put("111-11-1111", e1);
//        map.put("222-22-2222", e2);
//        map.put("333-33-3333", e3);
//        map.put("111-11-1111", e4);
//        
//        System.out.println(map.get("222-22-2222"));
//        System.out.println("------------");
//        for(Employee e : map.values()){
//            System.out.println(e);
//        }
        
          /**
           * Using a map to store data
           * Employee used as key SSN used as value
           * Lab 5
           */
//        Map<Employee, String> map = new HashMap<Employee, String>();
//        map.put(e1, "111-11-1111");
//        map.put(e2, "222-22-2222");
//        map.put(e3, "333-33-3333");
//        map.put(e4, "111-11-1111");
//        
//        System.out.println(map.get(e2));
//        System.out.println("------------");
//        for(Employee e : map.keySet()){
//            System.out.println(e.toString());
//        }
        
        
          /**
           * Tree map using Comparable
           * Lab 6
           */
//        Map<Employee, String> map = new TreeMap<Employee, String>();
//        map.put(e1, "111-11-1111");
//        map.put(e2, "222-22-2222");
//        map.put(e3, "333-33-3333");
//        map.put(e4, "111-11-1111");
//        
//        for(Employee e : map.keySet()){
//            System.out.println(e);
//        }
        
        /**
         * Tree map using comparator
         * Lab 6
         */
//        
//        Map<Employee, String> map = new TreeMap<Employee, String>();
//        map.put(e1, "111-11-1111");
//        map.put(e2, "222-22-2222");
//        map.put(e3, "333-33-3333");
//        map.put(e4, "111-11-1111");
//        
//        for(Employee e : map.keySet()){
//            System.out.println(e);
//        }
        /**
         * Use treeSet to remove duplicates and sort
         * Lab 7
         */
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        
        Set<Employee> tSet = new TreeSet<Employee>(list);
        
        List<Employee> altList = new ArrayList<Employee>(tSet);
        
        for(Employee e : altList){
            System.out.println(e.toString());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    }
}
