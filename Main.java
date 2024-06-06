package literacy;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rows = new ArrayList<>();
        List<Literacy> literacyData = new ArrayList<>();

        // Loading Data
        String file = "src/main/java/literacy/literacy.csv";
        try {
            Files.lines(Paths.get(file)).forEach(row->rows.add(row));
        } catch(Exception e) {
            System.out.println("error loading the file " + e.getMessage());
        }

        rows.stream().forEach(row-> System.out.println(row));
        rows.stream().map(row->row.split(",")).forEach(row-> System.out.println(row[5]));
        rows.stream()
                .map(row->row.split(","))
                .forEach(row->literacyData.add(new Literacy(row[3], Integer.parseInt(row[4]), row[2], Double.parseDouble(row[5]))));


        // Sorting data
        literacyData.stream().sorted((l1, l2)-> {
           if (l1.getLiteracyRate() > l2.getLiteracyRate()) {
               return 1;
           }
           else if (l1.getLiteracyRate() < l2.getLiteracyRate()) {
               return -1;
           }
           else {
               return 0;
           }
        }).forEach(l-> System.out.println(l));


    }

}

