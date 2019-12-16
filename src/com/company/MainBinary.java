package com.company;

public class MainBinary {
    public static void main(String[] args) {
        String dataKu = "Teknik Informatika";
        BinarySearchController binarySearchController = new BinarySearchController(dataKu);
        binarySearchController.setTarget('i');
        boolean isFound = binarySearchController.isTargetFound();
        if(isFound){
            System.out.println("Target Found");
        }
        else {
            System.out.println("Target Not Found");
        }
    }
}
