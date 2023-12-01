package com.example.hyperversedemo;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.UUID;

import co.hyperverge.hyperkyc.HyperKyc;
import co.hyperverge.hyperkyc.data.models.HyperKycConfig;
import co.hyperverge.hyperkyc.data.models.result.HyperKycResult;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityResultLauncher<HyperKycConfig> hyperKycLauncher =
                registerForActivityResult(new HyperKyc.Contract(), result -> {
                    Log.e("hyper result---", new Gson().toJson(result));

                    // handle result post workflow finish/exit
                  /*  switch (result.getStatus()) {
                        case HyperKycResult.Status.USER_CANCELLED:
                            // user cancelled
                            break;
                        case HyperKycResult.Status.ERROR:
                            // failure
                            break;
                        case HyperKycResult.Status.AUTO_APPROVED:
                        case HyperKycResult.Status.AUTO_DECLINED:
                        case HyperKycResult.Status.NEEDS_REVIEW:
                            // workflow success
                            break;
                    }*/
                });

        hyperKycLauncher.launch(getHyperVergeConfigData());
    }

    private HyperKycConfig getHyperVergeConfigData() {
        String uniqueHyperVergeTransactionId = UUID.randomUUID().toString();
        HyperKycConfig config = new HyperKycConfig(
                "dux92q",
                "fskgi6t80xwkgqc2x6m9",
                "DigilockerUser",
                uniqueHyperVergeTransactionId
        );
        return config;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }


}