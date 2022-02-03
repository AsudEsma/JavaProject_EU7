package assignments.Assignment_OOP_Concepts.Q08;

public class Value {
    private int val;
    private boolean modified;

    public Value() {
        setVal(0);
        this.modified = false;
    }

    public Value(int val) {
        this.val = val;
        this.modified = false;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        if(val!=this.val) {
            this.val=val;
            modified = true;
        }
    }

    public boolean wasModified() {
        return modified;
    }
}
