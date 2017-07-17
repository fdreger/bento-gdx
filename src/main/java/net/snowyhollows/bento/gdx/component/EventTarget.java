package net.snowyhollows.bento.gdx.component;

import com.badlogic.ashley.core.Component;
import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Family;

/**
 * Created by efildre on 2016-06-04.
 */
public class EventTarget implements Component{
    public static final Family all = Family.all(EventTarget.class).get();
    public final static ComponentMapper<EventTarget> mapper = ComponentMapper.getFor(EventTarget.class);

    public String event;

    public EventTarget(String event) {
        this.event = event;
    }

    public interface Observer {
        void onEvent(String string);
    }
}
