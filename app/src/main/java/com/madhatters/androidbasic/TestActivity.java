package com.madhatters.androidbasic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.madhatters.androidbasic.domain.City;

public class TestActivity extends AppCompatActivity {
    private String json = "{\"status\":true,\"data\":{\"content\":[{\"id\":\"5a95105c37823b4153f45dfc\",\"cityName\":\"مكة المكرمة\",\"latitude\":21.40316508843096,\"longitude\":39.79747519531247,\"location\":[39.79747519531247,21.40316508843096]},{\"id\":\"5ab39dda66ee5962d964ba5a\",\"cityName\":\"جدة\",\"latitude\":21.284329018248627,\"longitude\":39.238269008016914,\"location\":[39.238269008016914,21.284329018248627]},{\"id\":\"5ab39e2966ee5962d964ba5b\",\"cityName\":\"المجمعة\",\"latitude\":25.907269105872455,\"longitude\":45.348181215731415,\"location\":[45.348181215731415,25.907269105872455]},{\"id\":\"5ab39e4f66ee5962d964ba5c\",\"cityName\":\"الخرج\",\"latitude\":24.16088458784141,\"longitude\":47.315306357630675,\"location\":[47.315306357630675,24.16088458784141]},{\"id\":\"5ab39e9f66ee5962d964ba5d\",\"cityName\":\"الدوادمي\",\"latitude\":24.522209725711086,\"longitude\":44.41025498673321,\"location\":[44.41025498673321,24.522209725711086]},{\"id\":\"5ab39ecc66ee5962d964ba5e\",\"cityName\":\"وادي الدواسر\",\"latitude\":20.14149042652261,\"longitude\":44.853072191126216,\"location\":[44.853072191126216,20.14149042652261]},{\"id\":\"5ab39f2d66ee5962d964ba5f\",\"cityName\":\"الطائف\",\"latitude\":21.441831302808616,\"longitude\":40.4992790336737,\"location\":[40.4992790336737,21.441831302808616]},{\"id\":\"5ab39f4c66ee5962d964ba60\",\"cityName\":\"الرياض\",\"latitude\":24.750145839518552,\"longitude\":46.72620150679984,\"location\":[46.72620150679984,24.750145839518552]},{\"id\":\"5ab39f7366ee5962d964ba61\",\"cityName\":\"المدينة المنورة\",\"latitude\":24.46457928894808,\"longitude\":39.616263979831615,\"location\":[39.616263979831615,24.46457928894808]},{\"id\":\"5ab39f9066ee5962d964ba62\",\"cityName\":\"ينبع\",\"latitude\":24.02065417606544,\"longitude\":38.18339262159225,\"location\":[38.18339262159225,24.02065417606544]},{\"id\":\"5ab39fae66ee5962d964ba63\",\"cityName\":\"القصيم\",\"latitude\":26.30990414946352,\"longitude\":43.974483595521065,\"location\":[43.974483595521065,26.30990414946352]},{\"id\":\"5ab39fd666ee5962d964ba64\",\"cityName\":\"الدمام\",\"latitude\":26.43695760221532,\"longitude\":50.098267063481785,\"location\":[50.098267063481785,26.43695760221532]},{\"id\":\"5ab39ff166ee5962d964ba65\",\"cityName\":\"الخبر\",\"latitude\":26.182507885946904,\"longitude\":50.19878134765622,\"location\":[50.19878134765622,26.182507885946904]},{\"id\":\"5ab3a01366ee5962d964ba66\",\"cityName\":\"حفرالباطن\",\"latitude\":28.424208013493885,\"longitude\":45.97465000636578,\"location\":[45.97465000636578,28.424208013493885]},{\"id\":\"5ab3a04866ee5962d964ba67\",\"cityName\":\"النعيرية\",\"latitude\":27.472012302182527,\"longitude\":48.49781962409236,\"location\":[48.49781962409236,27.472012302182527]},{\"id\":\"5ab3a06f66ee5962d964ba68\",\"cityName\":\"الخفجي\",\"latitude\":28.424913362304007,\"longitude\":48.495321525015356,\"location\":[48.495321525015356,28.424913362304007]},{\"id\":\"5ab3a0a966ee5962d964ba69\",\"cityName\":\"الجبيل\",\"latitude\":27.018984442306486,\"longitude\":49.631005027872106,\"location\":[49.631005027872106,27.018984442306486]},{\"id\":\"5ab3a13866ee5962d964ba6a\",\"cityName\":\"ابها\",\"latitude\":18.212067601702174,\"longitude\":42.51502990722656,\"location\":[42.51502990722656,18.212067601702174]},{\"id\":\"5ab3a17766ee5962d964ba6b\",\"cityName\":\"خميس مشيط\",\"latitude\":18.312934756856897,\"longitude\":42.73965892029537,\"location\":[42.73965892029537,18.312934756856897]},{\"id\":\"5ab3a1a566ee5962d964ba6c\",\"cityName\":\"بيشة\",\"latitude\":20.014045113921558,\"longitude\":42.616622837565274,\"location\":[42.616622837565274,20.014045113921558]}],\"totalPages\":2,\"totalElements\":30,\"last\":false,\"numberOfElements\":20,\"first\":true,\"sort\":null,\"size\":20,\"number\":0},\"message\":\"success\"}";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_layout);
        City city = new Gson().fromJson(json, City.class);
        Log.d("cities", "onCreate: " + city);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
