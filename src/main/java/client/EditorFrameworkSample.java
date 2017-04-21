package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * Created by s6n on 21-04-2017.
 */
public class EditorFrameworkSample implements EntryPoint {
    public void onModuleLoad() {
        Label l = new Label("Hello");
        RootPanel.get("lbl").add(l);
    }
}
