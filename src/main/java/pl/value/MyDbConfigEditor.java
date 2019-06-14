package pl.value;

import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class MyDbConfigEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[]   split = text.split("\\|");
        if(split.length == 4) {
            MyDbConfig cfg = new MyDbConfig();
            cfg.setHostname(split[0]);
            cfg.setPort(split[1]);
            cfg.setUsername(split[2]);
            cfg.setPassword(split[3]);

            setValue(cfg);
        }
    }
}
