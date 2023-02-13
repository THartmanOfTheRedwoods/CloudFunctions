package edu.redwoods.gcp;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.Gson;

public class HelloWorld implements HttpFunction {
    @Override
    public void service(HttpRequest request, HttpResponse response)
            throws Exception {
        QueryTest qt;
        qt = new Gson().fromJson(request.getReader(), QueryTest.class);
        response.getWriter().write(String.format("Hello %s%n", qt.getQuery()));
    }
}
