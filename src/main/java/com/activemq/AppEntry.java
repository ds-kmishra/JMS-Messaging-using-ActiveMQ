package com.activemq;

import com.activemq.MessageSender.*;
import act.Act;
import act.inject.DefaultValue;
import act.util.Output;
import org.osgl.logging.LogManager;
import org.osgl.logging.Logger;
import org.osgl.mvc.annotation.GetAction;
import osgl.version.Version;
import osgl.version.Versioned;
@SuppressWarnings("unused")
@Versioned
public class AppEntry {

    public static final Version VERSION = Version.of(AppEntry.class);
    public static final Logger LOGGER = LogManager.get(AppEntry.class);

    public static void main(String[] args) throws Exception {
        MessageSender.msgSender();
        MessageReceiver.msgReceiver();
    }
}
