package org.example.controller;

import org.example.exception.InputData;
import org.example.model.ResultTest;
import org.example.model.Type;
import org.example.service.ResultServiceImpl;
import org.example.util.Menu;
import org.example.util.Util;

import javax.xml.transform.Result;
import java.util.List;

public class ResultController {
    ResultServiceImpl resultService;

    public ResultController() {
        resultService = new ResultServiceImpl();
    }

    public void getResultTest(){
        List<ResultTest> list = resultService.getAllResultTests();
        boolean isContinue = true;
        while (isContinue){
            if(list.size() == 0){
                System.out.println("Bạn chưa thực hiện trắc nghiệm");
                isContinue = false;
            }else{
                Menu.resultTestMenu();
                int option = InputData.inputOption();
                switch (option){
                    case 1:
                        //Xem tất cả
                        printResult(list);
                        break;
                    case 2:
                        //Dễ
                        getResultByLevel(Type.EASY);
                        break;
                    case 3:
                        //Trung bình
                        getResultByLevel(Type.MEDIUM);
                        break;
                    case 4:
                        //Khó
                        getResultByLevel(Type.HARD);
                        break;
                    case 0:
                        isContinue = false;
                }
            }
        }
    }

    public void getResultByLevel(Type type){
        List<ResultTest> list = resultService.getListResultTestByLevel(type);
        if(list.size() == 0){
            System.out.println("Bạn chưa thực hiện bài trắc nghiệm ở mức độ này");
        }else{
            System.out.println("Bạn đã thực hiện trắc nghiệm " + list.size() +" lần");
            printResult(list);
        }
    }



    private void printResult(List<ResultTest> testList){
        for(int i = 0; i < testList.size(); i++){
            ResultTest result = testList.get(i);
            System.out.println("TRẮC NGHIỆM THỨ " + (i+1) +": ");
            System.out.println("Tổng số câu hỏi: " + result.getNumberQuestion());
            System.out.println("Số câu trả lời đúng: " +result.getCorrectAnswer());
            System.out.println("Số câu trả lời sai: " + result.getWrongAnswer());
            System.out.println("Ngày làm trắc nghiệm: " + Util.formatDate(result.getTestDate()));
            System.out.println("Mức độ: " + result.getType());
            System.out.println("-------------------");
        }
    }
}
