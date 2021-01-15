package com.compoundinterest;

public class LambdaResponse {
	private double montoFinal;

	public LambdaResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LambdaResponse(double montoFinal) {
		super();
		this.montoFinal = montoFinal;
	}

	public double getMontoFinal() {
		return montoFinal;
	}

	public void setMontoFinal(double montoFinal) {
		this.montoFinal = montoFinal;
	}

	@Override
	public String toString() {
		return "LambdaResponse [montoFinal=" + montoFinal + "]";
	}
	
	
}
