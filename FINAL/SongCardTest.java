public class SongCardTest {
    public static void main(String[] args)

    {
        SongCard songCard = new SongCard(2);
        System.out.println("Try buying a song before activating your gift card.");
        try {
            songCard.buySongs();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Try activating your gift card.");
        try {
            songCard.activate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Try buying a song after activating your gift card.");
        try {
            songCard.buySongs();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Try activating your gift card again.");
        try {
            songCard.activate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Try buying another song.");
        try {
            songCard.buySongs();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Try buying another song.");
        try {
            songCard.buySongs();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
