package com.grupoTCC.servico;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Reconhecimento {

    public Interpreter(@NotNull File modelFile);

    try (Interpreter interpreter = new Interpreter(file_of_tensorflowlite_model)) {
        Map<String, Object> inputs = new HashMap<>();
        inputs.put("input_1", input1);
        inputs.put("input_2", input2);
        Map<String, Object> outputs = new HashMap<>();
        outputs.put("output_1", output1);
        interpreter.runSignature(inputs, outputs, "mySignature");
    }

}
