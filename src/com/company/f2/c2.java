package com.company.f2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class c2 {
    public static List<Integer> recurfill(int a, int b, List<Integer> l){
        if (a<b)
        {
            a+=1;
            l.add(a);
        }
        else
            return l;

        return recurfill(a, b, l);

    }
    public static List<Integer> recursive(int number, List<Integer> l1, List<Integer> l2, List<Integer> list_result, int i, int j){
        if (i<l1.size()){

            if(j<l2.size()){
                if (l1.get(i) + l2.get(j)==number){
                    list_result.add(l1.get(i));
                    list_result.add(l2.get(j));
                    return list_result;
                }
                j+=1;
            }
            else{
                i+=1;
                j=0;
            }

        }
        else {
            return list_result;
        }


        return recursive(number,l1,l2,list_result,i,j);
    }
    public static void main(String[] args) {
        //10. Фиксированная сумма
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String[] names = name.split(" ");

        int number = Integer.parseInt(names[0]);
        List<Integer> list_1 = new ArrayList<>();
        list_1.add((Integer.parseInt(names[1])));
        list_1 = recurfill(Integer.parseInt(names[1]),Integer.parseInt(names[2]),list_1);

        List<Integer> list_2 = new ArrayList<>();
        list_2.add((Integer.parseInt(names[3])));
        list_2 = recurfill(Integer.parseInt(names[3]),Integer.parseInt(names[4]),list_2);

        List<Integer> list_result = new ArrayList<>();
        list_result=recursive(number,list_1,list_2,list_result,0,0);
        if (list_result.size()!=0)
            System.out.println(list_result);

        else
            System.out.println("-1");
//        System.out.println(list_1);
//        System.out.println(list_2);




    }
}
