public class PBTSMain {
    public static void main(String[] args) {
        // Facade Pattern called
        Utility.setFolderName();
        PbtsFacade pbtsFacade = new PbtsFacade();
        pbtsFacade.startFacade();
        Utility.newscan.close();
    }
}