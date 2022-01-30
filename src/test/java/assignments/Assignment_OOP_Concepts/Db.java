package assignments.Assignment_OOP_Concepts;

public class Db {
    private String data;
    private int yint;
    // Do not touch
    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }
    // Do not touch

    public void insertData(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
