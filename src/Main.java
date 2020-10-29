//class Solution {
//    public static void main(String[] args) {
//   testAbtract ta=new testAbtract(){} ;
//        System.out.println(ta.shit());
//    }
//}


import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String strSource1 = "\"asd\"=[52,45], vass=[53,34],vas=[45,35],vdas=[45,35], das=[45,45]";
//String strSource=strSource1.replaceAll(",[^0-9]",":");

//        System.out.println(strSource1.replaceAll("(?!.[0-9]),",":"));
        System.out.println(strSource1);
        Map<String, String> hMapData = Arrays.stream( strSource1.split("(?!.[0-9]),") )
                .map(s -> s.split("="))
                .collect(Collectors.toMap(s -> s[0].trim(), s -> s[1].trim()));

        System.out.println(hMapData);
    }
}