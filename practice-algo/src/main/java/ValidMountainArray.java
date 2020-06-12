public class ValidMountainArray {

    public boolean validMountainArray(int[] A) {

        if(A.length < 3)
            return false;

        int i = 1;
        int j = A.length -1;

        while(i <= j-1 && A[i] > A[i-1] && A[j-1] > A[j]){
            if(A[i] > A[i-1])
                i++;
            if(A[j-1] > A[j])
                j--;
        }

        return i == j || i == j-1;
    }
}
