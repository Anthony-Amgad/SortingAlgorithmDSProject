package com.example.datastructurefinalproject;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("randomNum.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("insertionSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("selectionSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("mergeSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("heapSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("quickSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("countingSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("radixSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("bubbleSorted.txt");
            myFile.delete();
        }catch(Exception e){

        }

        try {
            File myFile = new File("insertionStep.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("selectionStep.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("mergeStep.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("heapStep.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("quickStep.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("countingStep.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("radixStep.txt");
            myFile.delete();
        }catch(Exception e){

        }
        try {
            File myFile = new File("bubbleStep.txt");
            myFile.delete();
        }catch(Exception e){

        }

        DataStructureApplication.main(args);
    }
}
