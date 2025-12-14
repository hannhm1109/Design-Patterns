package ex1.q2;

/**
 * @author hanane
 **/
public class PluginFactory {
    public static Plugin getPlugin(String pluginName) {
        switch (pluginName) {
            case "a":
                return new PluginA();
            case "b":
                return new PluginB();
            default:
                throw new IllegalArgumentException("Plugin name not supported: " + pluginName);
        }
    }
}
