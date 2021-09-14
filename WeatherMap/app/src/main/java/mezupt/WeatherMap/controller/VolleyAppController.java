package mezupt.WeatherMap.controller;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyAppController extends Application {

    private static VolleyAppController instance;
    private RequestQueue requestQueue;

    public static synchronized VolleyAppController getInstance() {
        return instance;
    }

    public RequestQueue getRequestQueue() {

        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(getApplicationContext());
        }

        return requestQueue;

    }

    public <T> void addToRequestQueue(Request<T> request) {

        getRequestQueue().add(request);

    }

    @Override
    public void onCreate() {

        super.onCreate();

        instance = this;

    }

}
