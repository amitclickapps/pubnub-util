package com.pubnubutil;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by clickapps on 5/9/17.
 */

public interface IPubnubHandler {

    IPubnubHandler subscribe();

    public interface ISubscribe {

    }

    IUnSubscribe unSubscribe();

    public interface IUnSubscribe {

    }

    IPubnubHandler unSubscribeAll();

    IPubnubHandler subScribeList();

    IPubnubHandler publish();

    public interface IChannel extends IPubnubHandler {

        ISubscribe channels(@NonNull String[] channels);

        ISubscribe channels(@NonNull String channels);

        ISubscribe channels(@NonNull List<String> channels);

        void build();
    }

//    public interface IMessage extends IPubnubHandler {
//
//        ICommon channels(@NonNull String[] channels);
//
//        ICommon channels(@NonNull String channels);
//
//        ICommon channels(@NonNull List<String> channels);
//
//        void build();
//    }


}
