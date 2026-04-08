package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

    @Override
    public Response filter(FilterableRequestSpecification requestSpec,
                           FilterableResponseSpecification responseSpec,
                           FilterContext ctx) {

        logRequest(requestSpec);

        Response response = ctx.next(requestSpec, responseSpec);

        logResponse(response);

        return response;
    }

    private void logRequest(FilterableRequestSpecification requestSpec) {
        logger.info("Request method: {}", requestSpec.getMethod());
        logger.info("Request URI: {}", requestSpec.getURI());
        logger.info("Request headers: {}", requestSpec.getHeaders());
        Object body = requestSpec.getBody();
        logger.info("Request body: {}", body != null ? body.toString() : "null");
    }

    private void logResponse(Response response) {
        logger.info("Response status code: {}", response.getStatusCode());
        logger.info("Response headers: {}", response.getHeaders());
        logger.info("Response body: {}", response.asString());
    }
}