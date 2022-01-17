package Module;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private Integer Number;
    List<Terminal> terminals = new ArrayList<Terminal>();
    List<Block> blocks = new ArrayList<Block>();

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<Terminal> terminals) {
        this.terminals = terminals;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }
}
