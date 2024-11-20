// NetworkReader Implementation
package com.directi.training.dip.exercise;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements Reader {
    private final String protocol;
    private final String host;
    private final String path;

    public NetworkReader(String protocol, String host, String path) {
        this.protocol = protocol;
        this.host = host;
        this.path = path;
    }

    @Override
    public String read() throws Exception {
        URL url = new URL(protocol, host, path);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        return content.toString();
    }
}