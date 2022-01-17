package Model;

public class Player {
    private User user;
    private int current_cell;
    private PieceColor pieceColor;
    private boolean hasGameStarted;
    private boolean hasToSkipNextChance;

    public Player(User user, int current_cell, PieceColor pieceColor, boolean hasGameStarted, boolean hasToSkipNextChance) {
        this.user = user;
        this.current_cell = current_cell;
        this.pieceColor = pieceColor;
        this.hasGameStarted = hasGameStarted;
        this.hasToSkipNextChance = hasToSkipNextChance;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCurrent_cell(int current_cell) {
        this.current_cell = current_cell;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public void setHasGameStarted(boolean hasGameStarted) {
        this.hasGameStarted = hasGameStarted;
    }

    public void setHasToSkipNextChance(boolean hasToSkipNextChance) {
        this.hasToSkipNextChance = hasToSkipNextChance;
    }

    public User getUser() {
        return user;
    }

    public int getCurrent_cell() {
        return current_cell;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public boolean isHasGameStarted() {
        return hasGameStarted;
    }

    public boolean isHasToSkipNextChance() {
        return hasToSkipNextChance;
    }
}
