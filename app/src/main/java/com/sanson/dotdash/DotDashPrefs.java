package com.sanson.dotdash;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class DotDashPrefs extends PreferenceActivity {

    public static final String AUTOCAP = "autocap";
    public static final String NEWLINE_CODE = "newline";
    public static final String ENABLE_UTIL_KBD = "enableutilkbd";
    public static final String DIT_DAH_CHARS = "ditdahchars";
    public static final String DASH_KEY_ON_LEFT = "dashkeyonleft";

    /**
     * Put this string in the settings array to represent a setting where no
     * code group for newline is supported
     */
    public static final String NEWLINE_CODE_NONE = "X";

    @SuppressWarnings("deprecation")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//			getFragmentManager().beginTransaction()
//			.replace(android.R.id.content, new DotDashSettingsFragment())
//			.commit();
//		} else {
        addPreferencesFromResource(R.xml.prefs);
//		}
    }
}
