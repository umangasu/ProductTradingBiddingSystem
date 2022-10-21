import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Utility {

    private static String folderName;
    public static Scanner newscan = new Scanner(System.in);
    public static void setFolderName() {
        String path = "";
        try {
            System.out.println("Enter the path where the below files exist \n" +
                    "BuyerInfo.txt \n" +
                    "SellerInfo.txt \n" +
                    "ProductInfo.txt \n" +
                    "UserProduct.txt"
            );
            path = newscan.nextLine();
            Path folder = Paths.get(path);
            System.out.println(folder);
        }
        catch(Exception ex) {
            System.out.println(ex);
            System.exit(1);
        }
        finally {
            folderName = path;
        }
    }

    public static String getFolderName() {
        return folderName;
    }

}
