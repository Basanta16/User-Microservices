package com.basanta.hotel.service.HotelService.entities;





public class BinarySearchAlgorithm {

    public BinarySearchAlgorithm(int floor) {
        this.floor = floor;
    }

    int floor;


    public void findMiddle(int floor){
      floor = floor/2;
    }

    public boolean doesBreak(){
        return true;
    }



}

public static void main(String[] args){

    BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm(1000);


    for(int i=0; i<floor; i++){



        if(binarySearchAlgorithm.doesBreak()){
            System.out.println("Crack");
        }
        else{
            binarySearchAlgorithm.findMiddle(floor);
        }
    }

}
