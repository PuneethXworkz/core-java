package com.xworkz.springannotations;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.val;

@Data
public class Engine {

	//@Value("2022")
	private String model;
	//@Value("3500CC")
	private String power;
}
