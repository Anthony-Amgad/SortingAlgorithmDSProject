package com.example.datastructurefinalproject;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;


public class MainViewController {

    private static boolean insertionFlag = false;
    private static boolean mergeFlag = false;
    private static boolean selectionFlag = false;
    private static boolean heapFlag = false;
    private static boolean quickFlag = false;
    private static boolean countingFlag = false;
    private static boolean radixFlag = false;
    private static boolean bubbleFlag = false;
    private static boolean sortAsympFlag = false;
    private int step;




    @FXML
    private LineChart<String,Number> lineChart;
    @FXML
    private TextField largestElem;
    @FXML
    private TextField arrSize;
    @FXML
    private TextField stepSize;
    @FXML
    private Label labelAnt;
    @FXML
    private TableView tableList;
    @FXML
    private TableView stepTableList;


    @FXML
    protected void onCredits(){
        Alert a = new Alert(Alert.AlertType.NONE, "Project by: \n Anthony Amgad Fayek       19P9880 \n Youssef George Fouad       19P9824 \n Mostafa Nasrat Metwally   19P4619 \n Kerollos Wageeh Youssef   19P3468", ButtonType.CLOSE);
        a.setTitle("Credits");
        Stage stage = (Stage) a.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("/img.png")); // To add an icon
        stage.showAndWait();
    }

    @FXML
    protected void drawSort(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> xrr = new ArrayList<Integer>();
        Random rand = new Random();
        XYChart.Series<String,Number> insertionSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> selectionSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> mergeSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> heapSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> quickSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> countingSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> radixSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> bubbleSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> nsquaredSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> nlgnSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> npluskSeries = new XYChart.Series<String, Number>();
        XYChart.Series<String,Number> dnpluskSeries = new XYChart.Series<String, Number>();
        insertionSeries.setName("Insertion");
        selectionSeries.setName("Selection");
        mergeSeries.setName("Merge");
        heapSeries.setName("Heap");
        quickSeries.setName("Quick");
        countingSeries.setName("Counting");
        radixSeries.setName("Radix");
        bubbleSeries.setName("Bubble");
        nsquaredSeries.setName("n^2");
        nlgnSeries.setName("nlg(n)");
        npluskSeries.setName("n + k");
        dnpluskSeries.setName("d(n + k)");

        ArrayList<Integer> steparr = new ArrayList<Integer>();
        ArrayList<Integer> insertionStep = new ArrayList<Integer>();
        ArrayList<Integer> selectionStep = new ArrayList<Integer>();
        ArrayList<Integer> mergeStep = new ArrayList<Integer>();
        ArrayList<Integer> heapStep = new ArrayList<Integer>();
        ArrayList<Integer> quickStep = new ArrayList<Integer>();
        ArrayList<Integer> countingStep = new ArrayList<Integer>();
        ArrayList<Integer> radixStep = new ArrayList<Integer>();
        ArrayList<Integer> bubbleStep = new ArrayList<Integer>();


        if(largestElem.textProperty().get().equals("")||arrSize.textProperty().get().equals("")||stepSize.textProperty().get().equals("")){
            labelAnt.textProperty().setValue("Please make sure you entered all info");
        }else{
            try{
                if(Integer.parseInt(stepSize.textProperty().get())<=0 || Integer.parseInt(arrSize.textProperty().get())<0){
                    Exception e = new Exception();
                    throw e;
                }
                FileWriter myWriter = new FileWriter("randomNum.txt");
                for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                    arr.add(rand.nextInt(Integer.parseInt(largestElem.textProperty().get())+1));
                    myWriter.write(arr.get(i) + "\n");
                }
                myWriter.close();
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


                for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                    xrr.add(0);
                }
                for(int i = 0; i<Integer.parseInt(arrSize.textProperty().get());i+=Integer.parseInt(stepSize.textProperty().get())){
                    steparr.add(i);
                    if(insertionFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        insertionSort(xrr,i);
                        insertionSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        insertionStep.add(step);
                    }
                    if(selectionFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        selectionSort(xrr,i);
                        selectionSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        selectionStep.add(step);
                    }
                    if(mergeFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        mergeSort(xrr,0,i-1);
                        mergeSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        mergeStep.add(step);
                    }
                    if(heapFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        heapSort(xrr,i);
                        heapSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        heapStep.add(step);
                    }
                    if(quickFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        quickSort(xrr,0,i-1);
                        quickSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        quickStep.add(step);
                    }
                    if(countingFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        countingSort(xrr,i);
                        countingSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        countingStep.add(step);
                    }
                    if(radixFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        radixSort(xrr,i);
                        radixSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        radixStep.add(step);
                    }
                    if(bubbleFlag){
                        for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                            xrr.set(j,arr.get(j));
                        }
                        step = 0;
                        bubbleSort(xrr,i);
                        bubbleSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),step));
                        bubbleStep.add(step);
                    }
                    if(sortAsympFlag){
                        if(insertionFlag||selectionFlag||bubbleFlag){
                            nsquaredSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),i*i));
                        }
                        if(mergeFlag||quickFlag||heapFlag){
                            nlgnSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),i*(int)(Math.log(i)/Math.log(2))));
                        }
                        if(countingFlag){
                            npluskSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),i+Integer.parseInt(largestElem.textProperty().get()) ));
                        }
                        if(radixFlag){
                            dnpluskSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),(largestElem.textProperty().get().length())*(i+Integer.parseInt(largestElem.textProperty().get()))));
                        }
                    }
                }

                lineChart.getData().clear();
                tableList.getColumns().clear();
                stepTableList.getColumns().clear();
                tableList.getItems().clear();
                stepTableList.getItems().clear();

                steparr.add(Integer.parseInt(arrSize.textProperty().get()));

                for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                    tableList.getItems().add(j);
                }
                for(int j=0;j<steparr.size();j++){
                    stepTableList.getItems().add(j);
                }

                TableColumn<Integer, Number> randomColumn = new TableColumn<>("Random Numbers");
                randomColumn.setCellValueFactory(cellData -> {
                    Integer rowIndex = cellData.getValue();
                    return new ReadOnlyIntegerWrapper(arr.get(rowIndex));
                });
                tableList.getColumns().add(randomColumn);

                TableColumn<Integer, Number> stepColumn = new TableColumn<>("Array Size (n)");
                stepColumn.setCellValueFactory(cellData -> {
                    Integer rowIndex = cellData.getValue();
                    return new ReadOnlyIntegerWrapper(steparr.get(rowIndex));
                });
                stepTableList.getColumns().add(stepColumn);

                if(insertionFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step = 0;
                    insertionSort(xrr,Integer.parseInt(arrSize.textProperty().get()));
                    insertionSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(insertionSeries);
                    insertionStep.add(step);

                    TableColumn<Integer, Number> insertionColumn = new TableColumn<>("Insertion Sorted");
                    insertionColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> insertionStepColumn = new TableColumn<>("Insertion Step");
                    insertionStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(insertionStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("insertionSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("insertionStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + insertionStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(insertionColumn);
                    stepTableList.getColumns().add(insertionStepColumn);
                }

                if(selectionFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step=0;
                    selectionSort(xrr,Integer.parseInt(arrSize.textProperty().get()));
                    selectionSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(selectionSeries);
                    selectionStep.add(step);

                    TableColumn<Integer, Number> selectionColumn = new TableColumn<>("Selection Sorted");
                    selectionColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> selectionStepColumn = new TableColumn<>("Selection Step");
                    selectionStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(selectionStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("selectionSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("selectionStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + selectionStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(selectionColumn);
                    stepTableList.getColumns().add(selectionStepColumn);
                }

                if(mergeFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step = 0;
                    mergeSort(xrr,0,Integer.parseInt(arrSize.textProperty().get())-1);
                    mergeSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(mergeSeries);
                    mergeStep.add(step);

                    TableColumn<Integer, Number> mergeColumn = new TableColumn<>("Merge Sorted");
                    mergeColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> mergeStepColumn = new TableColumn<>("Merge Step");
                    mergeStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(mergeStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("mergeSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("mergeStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + mergeStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(mergeColumn);
                    stepTableList.getColumns().add(mergeStepColumn);
                }

                if(heapFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step = 0;
                    heapSort(xrr,Integer.parseInt(arrSize.textProperty().get()));
                    heapSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(heapSeries);
                    heapStep.add(step);

                    TableColumn<Integer, Number> heapColumn = new TableColumn<>("Heap Sorted");
                    heapColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> heapStepColumn = new TableColumn<>("Heap Step");
                    heapStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(heapStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("heapSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("heapStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + heapStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(heapColumn);
                    stepTableList.getColumns().add(heapStepColumn);
                }

                if(quickFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step=0;
                    quickSort(xrr,0,Integer.parseInt(arrSize.textProperty().get())-1);
                    quickSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(quickSeries);
                    quickStep.add(step);

                    TableColumn<Integer, Number> quickColumn = new TableColumn<>("Quick Sorted");
                    quickColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> quickStepColumn = new TableColumn<>("Quick Step");
                    quickStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(quickStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("quickSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("quickStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + quickStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(quickColumn);
                    stepTableList.getColumns().add(quickStepColumn);
                }

                if(countingFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step=0;
                    countingSort(xrr,Integer.parseInt(arrSize.textProperty().get()));
                    countingSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(countingSeries);
                    countingStep.add(step);

                    TableColumn<Integer, Number> countingColumn = new TableColumn<>("Counting Sorted");
                    countingColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> countingStepColumn = new TableColumn<>("Counting Step");
                    countingStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(countingStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("countingSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("countingStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + countingStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(countingColumn);
                    stepTableList.getColumns().add(countingStepColumn);
                }

                if(radixFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step = 0;
                    radixSort(xrr,Integer.parseInt(arrSize.textProperty().get()));
                    radixSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(radixSeries);
                    radixStep.add(step);

                    TableColumn<Integer, Number> radixColumn = new TableColumn<>("Radix Sorted");
                    radixColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> radixStepColumn = new TableColumn<>("Radix Step");
                    radixStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(radixStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("radixSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("radixStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + radixStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(radixColumn);
                    stepTableList.getColumns().add(radixStepColumn);
                }

                if(bubbleFlag){
                    for(int j=0;j<Integer.parseInt(arrSize.textProperty().get());j++){
                        xrr.set(j,arr.get(j));
                    }
                    step = 0;
                    bubbleSort(xrr,Integer.parseInt(arrSize.textProperty().get()));
                    bubbleSeries.getData().add(new XYChart.Data<String, Number>(arrSize.textProperty().get(),step));
                    lineChart.getData().add(bubbleSeries);
                    bubbleStep.add(step);

                    TableColumn<Integer, Number> bubbleColumn = new TableColumn<>("Bubble Sorted");
                    bubbleColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(xrr.get(rowIndex));
                    });

                    TableColumn<Integer, Number> bubbleStepColumn = new TableColumn<>("Bubble Step");
                    bubbleStepColumn.setCellValueFactory(cellData -> {
                        Integer rowIndex = cellData.getValue();
                        return new ReadOnlyIntegerWrapper(bubbleStep.get(rowIndex));
                    });

                    FileWriter Writer = new FileWriter("bubbleSorted.txt");
                    for(int i=0;i<Integer.parseInt(arrSize.textProperty().get());i++){
                        Writer.write(xrr.get(i) + "\n");
                    }
                    Writer.close();

                    FileWriter stepWriter = new FileWriter("bubbleStep.txt");
                    for(int i=0;i<steparr.size();i++){
                        stepWriter.write(steparr.get(i) + "," + bubbleStep.get(i) + "\n");
                    }
                    stepWriter.close();

                    tableList.getColumns().add(bubbleColumn);
                    stepTableList.getColumns().add(bubbleStepColumn);
                }

                if(sortAsympFlag){
                    int i = Integer.parseInt(arrSize.textProperty().get());
                    if(insertionFlag||selectionFlag||bubbleFlag){
                        nsquaredSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),i*i));
                        lineChart.getData().add(nsquaredSeries);
                    }
                    if(mergeFlag||quickFlag||heapFlag){
                        nlgnSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),i*(int)(Math.log(i)/Math.log(2))));
                        lineChart.getData().add(nlgnSeries);
                    }
                    if(countingFlag){
                        npluskSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),i+Integer.parseInt(largestElem.textProperty().get()) ));
                        lineChart.getData().add(npluskSeries);
                    }
                    if(radixFlag){
                        dnpluskSeries.getData().add(new XYChart.Data<String, Number>(String.valueOf(i),(largestElem.textProperty().get().length())*(i+Integer.parseInt(largestElem.textProperty().get()))));
                        lineChart.getData().add(dnpluskSeries);
                    }
                }

                labelAnt.textProperty().setValue("");
            }catch(Exception e){
                labelAnt.textProperty().setValue("Please make sure you entered valid info");
            }
        }

    }

    @FXML
    protected void onStepTxt(){
        try{
            File tempfile = new File("insertionStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe insertionStep.txt");
            }
        }catch (Exception e){
            System.out.println("insertion not found");
        }
        try{
            File tempfile = new File("selectionStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe selectionStep.txt");
            }
        }catch (Exception e){
            System.out.println("selection not found");
        }
        try{
            File tempfile = new File("bubbleStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe bubbleStep.txt");
            }
        }catch (Exception e){
            System.out.println("bubble not found");
        }
        try{
            File tempfile = new File("mergeStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe mergeStep.txt");
            }
        }catch (Exception e){
            System.out.println("merge not found");
        }
        try{
            File tempfile = new File("heapStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe heapStep.txt");
            }
        }catch (Exception e){
            System.out.println("heap not found");
        }
        try{
            File tempfile = new File("quickStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe quickStep.txt");
            }
        }catch (Exception e){
            System.out.println("quick not found");
        }
        try{
            File tempfile = new File("countingStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe countingStep.txt");
            }
        }catch (Exception e){
            System.out.println("counting not found");
        }
        try{
            File tempfile = new File("radixStep.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe radixStep.txt");
            }
        }catch (Exception e){
            System.out.println("radix not found");
        }
    }


    @FXML
    protected void onTxt() {
        try{
            File tempfile = new File("randomNum.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe randomNum.txt");
            }
        }catch (Exception e){
            System.out.println("random not found");
        }
        try{
            File tempfile = new File("insertionSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe insertionSorted.txt");
            }
        }catch (Exception e){
            System.out.println("insertion not found");
        }
        try{
            File tempfile = new File("selectionSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe selectionSorted.txt");
            }
        }catch (Exception e){
            System.out.println("selection not found");
        }
        try{
            File tempfile = new File("bubbleSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe bubbleSorted.txt");
            }
        }catch (Exception e){
            System.out.println("bubble not found");
        }
        try{
            File tempfile = new File("mergeSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe mergeSorted.txt");
            }
        }catch (Exception e){
            System.out.println("merge not found");
        }
        try{
            File tempfile = new File("heapSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe heapSorted.txt");
            }
        }catch (Exception e){
            System.out.println("heap not found");
        }
        try{
            File tempfile = new File("quickSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe quickSorted.txt");
            }
        }catch (Exception e){
            System.out.println("quick not found");
        }
        try{
            File tempfile = new File("countingSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe countingSorted.txt");
            }
        }catch (Exception e){
            System.out.println("counting not found");
        }
        try{
            File tempfile = new File("radixSorted.txt");
            if(tempfile.exists()){
                Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe radixSorted.txt");
            }
        }catch (Exception e){
            System.out.println("radix not found");
        }

    }

//###################FLAG SETTING FUNCTIONS#########################################

    @FXML
    protected void insertionAct(){
        insertionFlag = !insertionFlag;
    }
    @FXML
    protected void selectionAct(){
        selectionFlag = !selectionFlag;
    }
    @FXML
    protected void mergeAct(){
        mergeFlag = !mergeFlag;
    }
    @FXML
    protected void heapAct(){
        heapFlag = !heapFlag;
    }
    @FXML
    protected void quickAct(){
        quickFlag = !quickFlag;
    }
    @FXML
    protected void countingAct(){
        countingFlag = !countingFlag;
    }
    @FXML
    protected void radixAct(){
        radixFlag = !radixFlag;
    }
    @FXML
    protected void bubbleAct(){
        bubbleFlag = !bubbleFlag;
    }
    @FXML
    protected void sortAsympAct(){
        sortAsympFlag = !sortAsympFlag;
    }

    /////////////////////////SORTING FUNCTIONS/////////////////////////
//###################INSERTION SORT FUNCTIONS#########################################

    void insertionSort(ArrayList<Integer> arr, int len){
        for(int i =1;i<len;i++){
            int key = arr.get(i);
            int j = i-1;
            while(j >= 0 && arr.get(j)>key){
                arr.set(j+1,arr.get(j));
                j--;
                step+=2;
            }
            arr.set(j+1,key);
            step += 3;
        }
    }

//###################SELECTION SORT FUNCTIONS#########################################

    void selectionSort(ArrayList<Integer> arr, int len){
        int min,temp;
        for(int i =0;i<len-1;i++){
            min = i;
            for(int j =i+1;j<len;j++){
                if(arr.get(j)<arr.get(min)){
                    min =j;
                    step++;
                }
                step++;
            }
            temp = arr.get(i);
            arr.set(i,arr.get(min));
            arr.set(min,temp);
            step+=4;
        }
    }

//###################MERGE SORT FUNCTIONS#########################################

    void mergeSort(ArrayList<Integer> arr, int s, int l){
        if(s>=l){
            return;
        }
        int mid = (s+l)/2;
        step++;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,l);
        merge(arr,s,mid,l);
    }

    void merge(ArrayList<Integer> arr, int s, int m, int l){
        step += 3;
        ArrayList<Integer> firstarr = new ArrayList<Integer>();
        ArrayList<Integer> secondarr = new ArrayList<Integer>();
        for(int i=0;i<m-s+1;i++){
            firstarr.add(arr.get(s+i));
            step++;
        }
        for(int i=0;i<l-m;i++){
            secondarr.add(arr.get(m+i+1));
            step++;
        }
        int i=0, j=0, k=s;

        while(i<m-s+1 && j<l-m){
            if(firstarr.get(i)<secondarr.get(j)){
                arr.set(k, firstarr.get(i));
                i++;
            }else{
                arr.set(k,secondarr.get(j));
                j++;
            }
            k++;
            step+=3;
        }
        while(i<m-s+1){
            arr.set(k,firstarr.get(i));
            i++; k++; step+=3;
        }
        while(j<l-m){
            arr.set(k,secondarr.get(j));
            j++; k++; step+=3;
        }
    }

//###################HEAP SORT FUNCTIONS#########################################

    void heapSort(ArrayList<Integer> arr, int len){
        int temp;
        buildMaxHeap(arr,len);
        for(int i = len-1;i>0;i--){
            temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);
            maxHeapify(arr, 0, i);
            step+=3;
        }
    }

    void buildMaxHeap(ArrayList<Integer> arr, int len){
        for(int i = len/2;i>=0;i--){
            maxHeapify(arr,i,len);
            step++;
        }
    }

    void maxHeapify(ArrayList<Integer> arr, int i, int len){
        step += 4;
        int l = (2*i)+1;
        int r = (2*i)+2;
        int largest;
        if(l<len && arr.get(l)>arr.get(i)){
            largest = l;
        }else{
            largest = i;
        }
        if(r<len && arr.get(r)>arr.get(largest)){
            largest = r;
            step++;
        }
        if(largest != i){
            int temp = arr.get(i);
            arr.set(i,arr.get(largest));
            arr.set(largest, temp);
            step+=3;
            maxHeapify(arr, largest, len);
        }
    }

//###################QUICK SORT FUNCTIONS#########################################

    void quickSort(ArrayList<Integer> arr, int s, int l){
        if(s<l){
            int pi = partition(arr, s, l);
            quickSort(arr, s, pi-1);
            quickSort(arr, pi+1, l);
            step+= 3 ;
        }
    }

    int partition(ArrayList<Integer> arr, int s, int l){
        step += 5;
        int temp;
        int pivot = arr.get(l);
        int i = s-1;
        for(int j = s; j<=l-1;j++){
            if(arr.get(j)<pivot){
                i++;
                temp = arr.get(j);
                arr.set(j,arr.get(i));
                arr.set(i, temp);
                step+=4;
            }
        }
        temp = arr.get(l);
        arr.set(l,arr.get(i+1));
        arr.set(i+1,temp);
        return i+1;
    }

//###################COUNTING SORT FUNCTIONS#########################################

    void countingSort(ArrayList<Integer> arr, int len){
        step += 3;
        ArrayList<Integer> outarr = new ArrayList<Integer>();
        for(int j=0;j<len;j++){
            outarr.add(0);
            //step++;
        }
        int max = arr.get(0);
        for(int i = 1; i < len; i++){
            if(arr.get(i)>max){
                max = arr.get(i);
                step++;
            }
        }
        ArrayList<Integer> count = new ArrayList<Integer>();
        for(int j=0;j<=max;j++){
            count.add(0);
           // step++;
        }
        for(int i = 0;i<len;i++){
            count.set(arr.get(i),count.get(arr.get(i))+1);
            step++;
        }
        for(int i = 1;i <= max;i++){
            count.set(i,count.get(i)+count.get(i-1));
            step++;
        }
        for(int i = len-1;i>=0;i--){
            outarr.set(count.get(arr.get(i))-1,arr.get(i));
            count.set(arr.get(i),count.get(arr.get(i))-1);
            step+=2;
        }
        for(int i = 0; i<len;i++){
            arr.set(i,outarr.get(i));
            step++;
        }

    }

//###################RADIX SORT FUNCTIONS#########################################

    void radixSort(ArrayList<Integer> arr, int len){
        int max = arr.get(0);
        step++;
        for(int i = 1; i < len; i++){
            if(max < arr.get(i)){
                max = arr.get(i);
                step++;
            }
        }
        for(int d = 1; max / d > 0; d *= 10){
            countingRadix(arr, d, len);
        }
    }

    void countingRadix(ArrayList<Integer> arr, int d, int len){
        int[] count = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i<len; i++){
            count[(arr.get(i) / d) % 10]++;
            step++;
        }
        for(int i = 1; i<10; i++){
            count[i]+=count[i-1];
            step++;
        }
        ArrayList<Integer> outarr = new ArrayList<Integer>();
        step += 2;
        for(int j=0;j<len;j++){
            outarr.add(0);
            step++;
        }
        for(int i = len-1;i>=0; i--){
            outarr.set(--count[(arr.get(i)/d) % 10],arr.get(i));
            step++;
        }
        for(int i = 0; i<len; i++){
            arr.set(i,outarr.get(i));
            step++;

        }
    }

//###################BUBBLE SORT FUNCTIONS#########################################

    void bubbleSort(ArrayList<Integer> arr, int len){
        for(int i =0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                step++;
                if(arr.get(j)> arr.get(j+1)){
                    step+=3;
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }


}
