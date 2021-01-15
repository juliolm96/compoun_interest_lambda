package com.compoundinterest;

import java.text.DecimalFormat;

public class MainClass {
	
	public static void main(String args[]) {
		CompoundInterestHandler handler = new CompoundInterestHandler();
		LambdaRequest req = new LambdaRequest();
		
		req.setMontoInicial(1000);
		req.setPeriodos(5);
		req.setTasaInteres(12);
		
		LambdaResponse res = handler.handleRequest(req, null);
		
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Response: "+ df.format(res.getMontoFinal()));
	}

}
