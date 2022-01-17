package Model;

import java.util.List;

public class Board {
    private int size;
    private List<Cell> cellList;

    public Board(int size, List<Cell> cellList) {
        this.size = size;
        this.cellList = cellList;
    }

    public int getSize() {
        return size;
    }

    public List<Cell> getCellList() {
        return cellList;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCellList(List<Cell> cellList) {
        this.cellList = cellList;
    }
}
