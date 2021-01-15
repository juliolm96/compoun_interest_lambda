package com.compoundinterest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CompoundInterestHandler implements RequestHandler<LambdaRequest, LambdaResponse> {

	public LambdaResponse handleRequest(LambdaRequest req, Context context) {
		LambdaResponse res = new LambdaResponse();
		
		res.setMontoFinal(
							(req.getMontoInicial()*(
													Math.pow(
															 (1+(req.getTasaInteres()/100)),
															 req.getPeriodos()
															)
													)
							)
						 );
		

		return res;
	}

}
