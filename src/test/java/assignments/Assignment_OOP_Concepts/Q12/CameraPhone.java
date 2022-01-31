package assignments.Assignment_OOP_Concepts.Q12;

public class CameraPhone extends Phone{
    private int imageSize;  // size in megapixels
    private int memorySize; // size in GB

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures() {
        return memorySize*1000/imageSize;
    }
}
