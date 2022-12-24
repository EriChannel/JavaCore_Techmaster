package org.example.service;

import org.example.model.ResultTest;
import org.example.model.Type;

import java.util.List;

public interface ResultService {
    List<ResultTest> getAllResultTests();
    void addNewResult(ResultTest result);
    List<ResultTest> getListResultTestByLevel(Type type);

}
