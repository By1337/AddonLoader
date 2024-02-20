import org.by1337.addonloader.AddonLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.logging.Logger;

public class LoadTest {
    @Test
    public void run() {
        File file = new File("./src/test/module");
        Logger logger = Logger.getLogger("addon_load_test");

        AddonLoader loader = new AddonLoader(logger, file);

        loader.loadAll();
        Assert.assertNotNull(loader.getAddon("ExampleAddon"));

        loader.enableAll();

        loader.disableAll();
        loader.unloadAll();
    }
}
