
package com.company;

public class Main {

    public static void main(String[] args) {

        Partition example = new Partition();
        example.setSize(4);
        example.setNumberToPartition(1000);
        int[] table = {100,200,500,400};
        example.setBoundaryTable(table);
        example.printBoundaryTable();

        int[] table1 = {-1,-1,-1,-1};
        example.setTable(table1);

        example.allocate();

        System.out.println();
        example.printTable();



    }
}