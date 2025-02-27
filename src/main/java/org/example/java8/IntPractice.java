package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntPractice {
    public static void main(String[] args){
        List<Transaction> trList = Arrays.asList(
                new Transaction(1,"Completed", 123.30),
                new Transaction(2,"Failed", 210.30),
                new Transaction(4,"Completed", 380.10),
                new Transaction(3,"Not Completed", 111.30)
        );
        //I might want to process only the completed transactions.
        List<Transaction> comList = trList.stream().
                filter(t -> "Completed".equals(t.getStatus())).collect(Collectors.toList());
        System.out.println(comList);

        //calculating the total amount of completed transactions
        double sum = trList.stream().
                filter(t -> "Completed".equals(t.getStatus())).
            mapToDouble(Transaction::getAmount).sum();
        System.out.println(sum);

        //group transaction by status
        Map<String, List<Transaction>> map = trList.stream().collect(
                Collectors.groupingBy(Transaction::getStatus));
        System.out.println(map);

        //group transaction by status and calculating the total amount for each group,
        Map<String, Double> hmap = trList.stream().collect(
                Collectors.groupingBy(Transaction::getStatus,
                Collectors.summingDouble(Transaction::getAmount)
                ));
        System.out.println(hmap);
    }
}
