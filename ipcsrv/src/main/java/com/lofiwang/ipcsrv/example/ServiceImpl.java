package com.lofiwang.ipcsrv.example;

import android.os.Message;
import android.os.Messenger;

import com.lofiwang.ipcsrv.base.MsgPoolService;


public class ServiceImpl extends MsgPoolService {
    private static final String TAG = "NewsService";

    public ServiceImpl() {
        super(TAG);
    }

    @Override
    protected void onHandleMessage(Messenger clientMessenger, Message msgFromClient) {

    }

    @Override
    protected void onCreated() {

    }

    @Override
    protected void onDestroyed() {

    }
}