package _2stream;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class _12StreamAveragingSummarizing {

    public static void main(String[] args) {

        Set<Integer> numSet = new HashSet<>();
        numSet.add(11);
        numSet.add(12);
        numSet.add(13);
        numSet.add(224);
        numSet.add(15);
        numSet.add(105);

        Double avg = numSet.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("avg = " + avg);

        IntSummaryStatistics summaryStatistics = numSet.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("summaryStatistics = " + summaryStatistics); //{count=5, sum=65, min=11, average=13.000000, max=15}
        System.out.println("Average = " + summaryStatistics.getAverage());


        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(11);
        numSet2.add(12);
        numSet2.add(13);
        numSet2.add(224);
        numSet2.add(15);
        numSet2.add(105);

        IntSummaryStatistics summaryStatistics2 = numSet2.stream().collect(Collectors.summarizingInt(x -> x));

        summaryStatistics.combine(summaryStatistics2); // this should combine both the summary => add the elements of summaryStatistics2 to summaryStatistics

        System.out.println(summaryStatistics); // output of combined summary
    }
}
