package com.company;


public class Partition {

    private int numberToPartition;
    private int size;
    private int[] table = new int[size];
    private int[] boundaryTable = new int[size];

    public int getNumberToPartition() {
        return numberToPartition;
    }

    public void setNumberToPartition(int numberToPartition) {
        this.numberToPartition = numberToPartition;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getTable() {
        return table;
    }

    public void setTable(int[] table) {
        this.table = table;
    }

    public int[] getBoundaryTable() {
        return boundaryTable;
    }

    public void setBoundaryTable(int[] boundaryTable) {
        this.boundaryTable = boundaryTable;
    }

    public void printTable() {
        for (int i : this.table) {
            System.out.print(i + " ");
        }
    }

    public void printBoundaryTable() {
        for (int i : this.boundaryTable) {
            System.out.print(i + " ");
        }
    }


    public void allocate() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += boundaryTable[i];
        }
        int remainder = numberToPartition;

        if (numberToPartition <= sum) {
                for (int i = 0; i < size; i++) {
                    if (remainder > 0) {
                        if (remainder >= boundaryTable[i]) {
                            this.table[i] = boundaryTable[i];
                            remainder -= boundaryTable[i];
                        } else {
                            table[i] = remainder;
                            remainder = 0;
                        }
                    } else {
                        table[i] = 0;
                    }
                }
        } else {
            System.out.println("can't allocate, numberToPartition greater then sum of limits of elements by " + (numberToPartition - sum));
        }
    }



}