package com.company;

public class BinarySearchController {
    private String data;
    private char target;
    public BinarySearchController(String data) {
        this.data = data;
    }
    public void setTarget(char target) {
        this.target = target;
    }
    public boolean isTargetFound(){
        char[] resultSorting = sortingData();
        int low = 0;
        int high = resultSorting.length - 1;
        while(high >= low){
            int middle = (low + high)/2;
            if(resultSorting[middle] == target){
                return true;
            }
            if (resultSorting[middle]<target){
                low = middle + 1;

            }
            if (resultSorting[middle]>target){
                high = middle - 1;
            }
        }
        return false;
    }
    private char[] sortingData(){
        char[] dataToSort = data.replace(" ","").toCharArray();
        int idxI, idxJ, length = dataToSort.length;
        for (idxI = 0; idxI < length; idxI++){
            for (idxJ = 0; idxJ < length; idxJ++){
                if (dataToSort[idxJ] > dataToSort[idxI]){
                    swap(idxI, idxJ, dataToSort);
                }
            }
        }
        return dataToSort;
    }
    private void swap(int idxI, int idxJ,char[] dataToSort) {
        char c = dataToSort[idxI];
        dataToSort[idxI] = dataToSort[idxJ];
        dataToSort[idxJ] = c;
    }
}
