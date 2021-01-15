package com.compoundinterest;

public class LambdaRequest {
	private float montoInicial;
	private float periodos;
	private float tasaInteres;

	@Override
	public String toString() {
		return "LambdaRequest [montoInicial=" + montoInicial + ", periodo=" + periodos + ", tasaInteres=" + tasaInteres
				+ "]";
	}

	public LambdaRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LambdaRequest(float montoInicial, float periodos, float tasaInteres) {
		super();
		this.montoInicial = montoInicial;
		this.periodos = periodos;
		this.tasaInteres = tasaInteres;
	}

	public float getMontoInicial() {
		return montoInicial;
	}

	public void setMontoInicial(float montoInicial) {
		this.montoInicial = montoInicial;
	}

	public float getPeriodos() {
		return periodos;
	}

	public void setPeriodos(float periodos) {
		this.periodos = periodos;
	}

	public float getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

}
