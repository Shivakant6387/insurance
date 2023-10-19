package com.example.icici.lombard.dto.reliance.request.gcv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListValues {
    List<Value> values;
}
