public class SortArray {
    public static void main(String[] args) {
    int[] nos = {1,7,3,11,24,9};
    boolean swap = false;
    for(int i = 0; i < nos.length - 1 ; i++){
        for(int j = 0; j < nos.length - 1; j++) {
            if (nos[j] > nos[j+1]) {
                int temp = nos[j];
                nos[j] = nos[j+1];
                nos[j+1] = temp;
                swap = true;
            }
        }
        if(swap == false) break;
    }

    String Name =  Arrays.toString(nos);
        System.out.println(Name);
    }
}
