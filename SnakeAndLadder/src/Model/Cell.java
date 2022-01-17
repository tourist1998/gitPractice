package Model;

public class Cell {
    private int cellNo;
    private CellType cellType;

    public Cell(int cellNo, CellType cellType) {
        this.cellNo = cellNo;
        this.cellType = cellType;
    }

    public int getCellNo() {
        return cellNo;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellNo(int cellNo) {
        this.cellNo = cellNo;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }
}
