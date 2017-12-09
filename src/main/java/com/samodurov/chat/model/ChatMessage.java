package com.samodurov.chat.model;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by denissamodurov on 09/12/2017.
 */
@Setter @Getter
public class ChatMessage {
    public MessageType type;
    public String content;
    public String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

}
