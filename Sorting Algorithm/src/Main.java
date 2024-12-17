public class Main{
    //Bubble Sorting
    public static void BubbleSort(int[] array ){
        for(int turn=0;turn<array.length-1;turn++){
            for(int j=0;j<array.length-turn-1;j++){
                if(array[j] >array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    //Bubble Sorting with minimum iteration
    public static void BubbleSortWithLowIteration(int[] array ){
        int swap=0;
        int originalSwap=swap;
        for(int turn=0;turn<array.length-1;turn++){
            for(int j=0;j<array.length-turn-1;j++){
                if(array[j] >array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap += 1;
                }
            }
            if(swap==originalSwap){
                System.out.println(swap);
                break;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //Selection Sort
    public static void SelectionSort(int[] array ){
        for(int i=0;i<array.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<array.length;j++){
                if(array[minPos]>array[j]){
                    minPos=j;
                }
            }
            //Swapping
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
        //Output Printing
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //Insertion Sort
    public static void InsertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int curr = array[i];
            int prev = i-1;
            while(prev>=0 && array[prev]> curr){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    //Main Function
    public static void main(String[] args){
        int[] array={2,5,1,3,4};
        //BubbleSort(array);
        //int[] array={1,2,3,4,5};
        //BubbleSortWithLowIteration(array);
        //SelectionSort(array);
        InsertionSort(array);
    }
}