package com.carisma.roomlight;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;

/**
 * Created by aliyuabdullahi on 11/29/16.
 */

public class MainActivityViewModel extends BaseObservable {
    @Bindable
    public ObservableBoolean lightOn = new ObservableBoolean();
}
