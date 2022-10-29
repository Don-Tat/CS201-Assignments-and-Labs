public class SongCard {
    private int songs;
    private boolean activated;

    public SongCard(int n) {
        this.songs = n;
    }

    public void activate() throws Exception {
        if (!activated) {
            activated = true;
            System.out.println("Gift card activated.");
        } else {
            throw new Exception("Gift card has already been activated.");
        }
    }

    public void buySongs() throws Exception {
        if (songs == 0) {
            throw new CardEmptyException("The card is completely used.");
        } else if (!activated) {
            throw new CardNotActivatedException("Card is not activated yet.");
        } else {
            this.songs--;
            System.out.println("One song has been purchased.");
        }
    }

    public int songsRemaining() {
        return this.songs;
    }

    class CardNotActivatedException extends Exception {
        public CardNotActivatedException(String s) {
            super(s);
        }
    }

    class CardEmptyException extends Exception {
        public CardEmptyException(String s) {
            super(s);
        }
    }
}
