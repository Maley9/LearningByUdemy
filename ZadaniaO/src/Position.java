public class Position extends Order {
    String WareName;
    int PieceCount;
    double price;

    public Position(String wareName, int pieceCount, double price) {
        WareName = wareName;
        PieceCount = pieceCount;
        this.price = price;
    }

    double calcValue(){
        return price*PieceCount;
    }

    @Override
    public String toString() {
        return WareName + " " + PieceCount + " szt " +
                price + " zł" + "\n" +
                "RAZEM " + calcValue();

    }
}
