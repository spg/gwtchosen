package com.watopi.chosen.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.watopi.chosen.client.ChosenImpl;

public class KeyUpEvent extends ChosenEvent<KeyUpEvent.KeyUpEventHandler> {
    public interface KeyUpEventHandler extends EventHandler {
        void onKeyUp(KeyUpEvent event);
    }

    public static Type<KeyUpEventHandler> TYPE = new Type<KeyUpEventHandler>();

    public KeyUpEvent(ChosenImpl chosen) {
        super(chosen);
    }

    public static Type<KeyUpEventHandler> getType() {
        return TYPE;
    }

    @Override
    public Type<KeyUpEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(KeyUpEventHandler handler) {
        handler.onKeyUp(this);
    }
}
