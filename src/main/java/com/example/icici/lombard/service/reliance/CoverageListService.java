package com.example.icici.lombard.service.reliance;

import com.example.icici.lombard.dto.reliance.request.gcv.CoverDetail;
import com.example.icici.lombard.dto.reliance.request.gcv.CoverageList;
import com.example.icici.lombard.dto.reliance.request.gcv.ListValues;
import com.example.icici.lombard.dto.reliance.request.gcv.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CoverageListService {
    public CoverageList getCoverageList(CoverageList coverageList) {
        List<Value>valueList=new ArrayList<>();
        valueList.add(new Value(10000.0));
        valueList.add(new Value(20000.0));
        valueList.add(new Value(30000.0));
        valueList.add(new Value(40000.0));
        valueList.add(new Value(50000.0));
        valueList.add(new Value(60000.0));
        valueList.add(new Value(70000.0));
        valueList.add(new Value(80000.0));
        valueList.add(new Value(90000.0));
        valueList.add(new Value(100000.0));
        valueList.add(new Value(110000.0));
        valueList.add(new Value(120000.0));
        valueList.add(new Value(130000.0));
        valueList.add(new Value(140000.0));
        valueList.add(new Value(150000.0));
        valueList.add(new Value(160000.0));
        valueList.add(new Value(170000.0));
        valueList.add(new Value(180000.0));
        valueList.add(new Value(190000.0));
        valueList.add(new Value(200000.0));
        coverageList.setCoverDetail(new CoverDetail("PA to Paid Driver",25,false,new ListValues(new ArrayList<Value>(valueList))));

       return coverageList;
    }
}
