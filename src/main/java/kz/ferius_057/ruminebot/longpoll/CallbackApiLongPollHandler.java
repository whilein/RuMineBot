package kz.ferius_057.ruminebot.longpoll;

import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import kz.ferius_057.ruminebot.VkData;
import kz.ferius_057.ruminebot.command.Command;

public class CallbackApiLongPollHandler extends CallbackApiLongPoll {

    public CallbackApiLongPollHandler(VkApiClient client, GroupActor actor) {
        super(client, actor);
    }

    @Override
    public void messageNew(Integer groupId, final Message message) {
        System.out.println("\nNew message: " + message.getText());
        try {
            Command.command(message);
        } catch (ClientException | ApiException e) {
            e.printStackTrace();
        }
    }
}