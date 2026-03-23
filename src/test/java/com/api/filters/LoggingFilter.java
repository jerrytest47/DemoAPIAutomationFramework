package com.api.filters;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.message.Message;

import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {
    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

    public Response filter(FilterableRequestSpecification requestSpec,
                         FilterableResponseSpecification responseSpec,
                         FilterContext ctx) {
// Log request
        logRequest(requestSpec);

// Get response
        Response response = ctx.next(requestSpec, responseSpec);

// Log response
        logResponse(response);

        return response; //test for assertion
    }

    private void logRequest(FilterableRequestSpecification requestSpec) {
        logger.info("BASE URI:"+ requestSpec.getBaseUri());
        logger.info("Request Header:"+ requestSpec.getHeaders());
        logger.info("Request PayloadI:"+ requestSpec.getBody());

    }

    private void logResponse(Response response) {
    	 logger.info("STATUS CODE:"+ response.getStatusCode());
         logger.info("Response Header:"+ response.headers());
         logger.info("Request Body:"+ response.getBody().prettyPrint());
    }

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStopped() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Result getOnMismatch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result getOnMatch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String msg,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, String message,
			Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8,
			Object p9) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, Object msg,
			Throwable t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(org.apache.logging.log4j.core.Logger logger, Level level, Marker marker, Message msg,
			Throwable t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result filter(LogEvent event) {
		// TODO Auto-generated method stub
		return null;
	}
}

