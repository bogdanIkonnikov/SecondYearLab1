public class Vector3DArray {
    private int length;
    public Vector3DArray(int length) {
        this.length = length;
        Vector3D[] arr = new Vector3D[length];
        for (int i = 0;i < length; i++) {
            arr[i] = new Vector3D();
        }
    }

    public Vector3D getElement() {
        Vector3D[] arr = new Vector3D[length];
        arr[0] = new Vector3D(1,2,3);
        return arr[0];
    }

    public int getLength() {
        return length;
    }
}
