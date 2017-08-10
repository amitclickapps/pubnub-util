### PubnubConfiguration
```
        PubnubConfiguration pubnubConfiguration = new PubnubConfiguration.Builder()
                .keys("publish_key", "subscribe_key")
                .gcm(true, "senderId")
                .build();
```
### PubnubManager Subscribe
```
        String[] channel = new String[]{"channel1", "channel2"};
        PubNubParam pubNubParam = PubNubManager.with(this, PubNubParam.Event.SUB, pubnubConfiguration)
                .channels(channel)
                .callback(new PubNubParam.OnPushMessageListener() {
                    @Override
                    public void onSuccess(String channel, Object data) {

                    }

                    @Override
                    public void onFailure(String channel, String exception) {

                    }
                })
                .build();
```
### PubnubManager publish
```
        String[] channel = new String[]{"channel1", "channel2"};
        PubNubParam pubNubParam = PubNubManager.with(this, PubNubParam.Event.PUB, pubnubConfiguration)
                .channels(channel)
                .message("pojoModel")
                .callback(new PubNubParam.OnPushMessageListener() {
                    @Override
                    public void onSuccess(String channel, Object data) {

                    }

                    @Override
                    public void onFailure(String channel, String exception) {

                    }
                })
                .build();
```
### PubnubManager unSubscribe Channel
```
        String[] channel = new String[]{"channel1", "channel2"};
        PubNubParam pubNubParam = PubNubManager.with(this, PubNubParam.Event.UNSUB, pubnubConfiguration)
                .channels(channel)
                .callback(new PubNubParam.OnPushMessageListener() {
                    @Override
                    public void onSuccess(String channel, Object data) {

                    }

                    @Override
                    public void onFailure(String channel, String exception) {

                    }
                })
                .build();
```
### PubnubManager unSubscribeAllChannel
```
        PubNubParam pubNubParam = PubNubManager.with(this, PubNubParam.Event.UNSUBALL, pubnubConfiguration)
                .callback(new PubNubParam.OnPushMessageListener() {
                    @Override
                    public void onSuccess(String channel, Object data) {

                    }

                    @Override
                    public void onFailure(String channel, String exception) {

                    }
                })
                .build();
```
### PubnubManager SubscribedList
```
        List<String> list = PubNubManager.with(this, PubNubParam.Event.SUB_LIST, pubnubConfiguration)
                .getSubscribedList();
```
### PubnubManager history
```
        String[] channel = new String[]{"channel1"};
        PubNubParam pubNubParam = PubNubManager.with(this, PubNubParam.Event.CHAT_HISTORY, pubnubConfiguration)
                .channels(channel)
                .progressDialog("ProgressDailogShowLoader")
                .callback(new PubNubParam.OnPushMessageListener() {
                    @Override
                    public void onSuccess(String channel, Object data) {

                    }

                    @Override
                    public void onFailure(String channel, String exception) {

                    }
                })
                .fetchHistory().historyCount(100)
                .build();
```