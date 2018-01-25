package com.coderanch.messaging.templatebridge;

import com.coderanch.messaging.config.GenConfig;
import com.coderanch.messaging.templatebridge.exceptions.MessageTemplateException;

public class MessageTemplate {
    public static final int NAME_WIDTH;
    public static final int FAV_COLOUR_WIDTH;
    static {
        try {
            String version = GenConfig.isNewFeatureEnabled() ? "v2" : "v1";
            Class<?> messageTemplateClass = Class.forName("com.coderanch.messaging.template." + version + ".MessageTemplate");
            NAME_WIDTH = messageTemplateClass.getDeclaredField("NAME_WIDTH").getInt(null);
            FAV_COLOUR_WIDTH = messageTemplateClass.getDeclaredField("FAV_COLOUR_WIDTH").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException("Field assignment failure", e);
        }
    }
}
