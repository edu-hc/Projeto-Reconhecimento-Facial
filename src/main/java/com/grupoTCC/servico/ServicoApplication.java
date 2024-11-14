package com.grupoTCC.servico;

import org.bytedeco.opencv.opencv_face.EigenFaceRecognizer;
import org.bytedeco.opencv.opencv_face.FaceRecognizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicoApplication {

	public static void main(String[] args) {

		FaceRecognizer r = EigenFaceRecognizer.create();
	}

}
