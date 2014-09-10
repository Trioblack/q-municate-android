package com.quickblox.q_municate.qb.commands;

import android.content.Context;
import android.content.Intent;

import com.quickblox.q_municate.core.command.CompositeServiceCommand;
import com.quickblox.q_municate.service.QBService;
import com.quickblox.q_municate.service.QBServiceConsts;

public class QBLoginAndJoinDialogsCommand extends CompositeServiceCommand {

    public QBLoginAndJoinDialogsCommand(Context context, String successAction, String failAction) {
        super(context, successAction, failAction);
    }

    public static void start(Context context) {
        Intent intent = new Intent(QBServiceConsts.LOGIN_AND_JOIN_CHAT_ACTION, null, context, QBService.class);
        context.startService(intent);
    }
}
