package _2stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _14StreamFileCaseStudy {
    public static void main(String[] args) throws IOException {

        Stream<String> rowData = Files.lines(Paths.get(System.getProperty("user.dir") + "/" + "salesdata.csv"));
        //System.out.println("rowData = " + rowData);
        // Get only those data which has sales info
        // Cheese,8000,2023 => ["Cheese","8000","2023"]
       /* long totalRows = rowData.map(x -> x.split(",")).filter(arr -> arr.length > 1).count();
        System.out.println("totalRows = " + totalRows); */

        // get all pizza names which have some sales data
       /* List<String[]> arrayOfSalesRowData = rowData.map(x -> x.split(",")).filter(arr -> arr.length > 1).toList();

        arrayOfSalesRowData.forEach(e -> {
            System.out.println(" Pizza name: " + e[0] + ", Sales Data: " + e[1]);
        }); */

      /*  for (String[] arr : arrayOfSalesRowData) {
            System.out.println(" Pizza name: " + arr[0] + ", Sales Data: " + arr[1]);
        }  */

        // Categorization of sales data for every pizza type
        // {"Cheese":"8000", "Veggie": "7000"}
       /* Map<String, String> salesMap = rowData.map(row -> row.split(","))
                .filter(arr -> arr.length > 1).collect(Collectors.toMap(x -> x[0], y -> y[1]));
        System.out.println("salesMap = " + salesMap);*/

        /*Map<String, Integer> salesMap2 = rowData.map(row -> row.split(","))
                .filter(arr -> arr.length > 1).collect(Collectors.toMap(x -> x[0], y -> Integer.parseInt(y[1])));
        System.out.println("salesMap2 = " + salesMap2);
        System.out.println("sales of Margherita = " + salesMap2.get("Margherita")); */

        // find the total sales for all pizza for 2023
        Optional<Integer> opTotalSales = rowData.map(row -> row.split(","))
                .filter(arr -> arr.length > 2).map(y -> Integer.parseInt(y[1])).reduce((a, b) -> a + b);
        System.out.println("Total sales data for year 2023: " + opTotalSales.get());

    }
}
