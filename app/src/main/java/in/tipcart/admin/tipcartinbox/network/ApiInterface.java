package in.tipcart.admin.tipcartinbox.network;

import java.util.List;

import in.tipcart.admin.tipcartinbox.model.Message;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by TIPCART on 15-Aug-17.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
