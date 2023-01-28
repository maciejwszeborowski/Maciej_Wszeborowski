package devices;

import java.net.URL;
import java.util.ArrayList;

public class Phone extends Device {
    static final String defaultNameServer = "www.serverservant.com";
    static final String defaultProtocol = "https";
    static final String defaultnameVersion = "1.0";

    @Override
    public void turnOn() {
        mode = true;
        System.out.println("włączono telefon");
    }

    @Override
    public String toString() {
        return "Phone{}";
    }

    public void installAnnApp(String name) {
        System.out.println("Installing application " + defaultProtocol + "://" + defaultNameServer + "/" + name + "/" + defaultnameVersion);
    }

    public void installAnnApp(String name, String version) {
        System.out.println("Installing application:" + defaultProtocol + "://" + defaultNameServer + "/" + name + "/" + version);
    }

    public void installAnnApp(String name, String version, String nameServer) {
        System.out.println("Installing application: " + defaultProtocol + "://" + nameServer + "/" + name + "/" + version);
    }

    public void installAnnApp(ArrayList<String> appList) {
        for (String app : appList) {
            System.out.println("Installing application: " + defaultProtocol + "://" + defaultNameServer + "/" + app + "/" + defaultnameVersion);

        }
    }

    public void installAnnApp(URL appInfo) {
        System.out.println("Installing application: " + appInfo.getProtocol() + "://" + appInfo.getHost() + "/" + appInfo.getFile());
    }


}
