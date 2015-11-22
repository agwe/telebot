package com;

import com.Models.Message;
import com.Models.ResponseGetMe;
import com.Models.ResponseGetUpdates;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by lara on 19/11/15.
 */
public interface TelegramService {
    @GET("/bot{bot}/getMe")
    Call<ResponseGetMe> getMe(@Path("bot") String bot);

    @GET("/bot{bot}/getUpdates")
    Call<ResponseGetUpdates> getUpdates(@Path("bot") String bot);

    @GET("/bot{bot}/getUpdates")
    Call<ResponseGetUpdates> getUpdatesOffset(@Path("bot") String bot, @Query("offset") Integer offset);

    @POST("/bot{bot}/forwardMessage")
    Call<Message> forwardMessage(@Path("bot") String bot, @Query("chat_id") Integer chatId, @Query("from_chat_id") Integer fromChatId, @Query("message_id") Integer messageId);

    @POST("/bot{bot}/sendMessage")
    Call<Message> sendMessage(@Path("bot") String bot, @Query("chat_id") Integer chatId, @Query("text") String text);
}
