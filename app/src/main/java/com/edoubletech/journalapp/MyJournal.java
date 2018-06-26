/*
 * Copyright (C) 2018 Eton Otieno Oboch
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.edoubletech.journalapp;

import android.app.Application;

import com.edoubletech.journalapp.di.ApplicationComponent;
import com.edoubletech.journalapp.di.DaggerApplicationComponent;
import com.edoubletech.journalapp.di.RoomModule;

public class MyJournal extends Application {

    private ApplicationComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerApplicationComponent
                .builder()
                .roomModule(new RoomModule(this))
                .build();
    }

    public ApplicationComponent getAppComponent() {
        return appComponent;
    }
}