class BinarySearch2DArray{
    public static void main(String[] args) {
        int [] [] arr = { {1,2,13,4,5},
                          {6,7,8,9,10},
                          {11,12,33,14,15},
                        };
        System.out.println(binarySearch(arr, 33));
    }

    public static boolean binarySearch(int [] [] arr , int target){
        int row=0 , col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
      return false;
    }
}