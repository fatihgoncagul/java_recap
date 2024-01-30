package generics_more2;
//this main includes final challange of generics

import generics_more2.model.LPAStudent;
import generics_more2.model.LPAStudentComparator;
import generics_more2.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class AnotherMain {


    public static void main(String[] args) {
        QueryList<LPAStudent> queryList = new QueryList<>();
        for(int i = 0;i<25;i++){
            queryList.add(new LPAStudent());

        }
        System.out.println("ORDERED: ");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("MATCHES");
        var matches = queryList.getMatches("PercentComplete","50").getMatches("Course","python");
        matches.sort(new LPAStudentComparator());//matches ordered by percentComplete

        printList(matches);
        System.out.println("ORDERED ");
        matches.sort(null);
        printList(matches);
    }

    public static void printList(List<?> students){
        for (var student : students){
            System.out.println(student);
        }

    }
}
