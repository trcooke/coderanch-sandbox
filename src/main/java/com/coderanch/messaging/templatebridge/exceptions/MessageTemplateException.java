package com.coderanch.messaging.templatebridge.exceptions;

public class MessageTemplateException extends Exception {
    public MessageTemplateException(String msg, Exception e) {
        super(msg, e);
    }
}
