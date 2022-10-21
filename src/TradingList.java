import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class TradingList {


    ArrayList<String> tradingList = new ArrayList<>();

    TradingList() {
        String tradingFileName = Utility.getFolderName() + "/UserProduct.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(tradingFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                tradingList.add(line);
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    public Iterator createIterator() {
        return this.tradingList.iterator();
    }

}
