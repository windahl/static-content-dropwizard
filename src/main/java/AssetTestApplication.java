import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class AssetTestApplication extends Application<AssetTestConfiguration> {

    public static void main(String[] args) throws Exception {
        new AssetTestApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<AssetTestConfiguration> bootstrap) {
        AssetsBundle assetsBundle = new AssetsBundle("/assets/", "/", "index.html", "static");
        bootstrap.addBundle(assetsBundle);
    }

    @Override
    public void run(AssetTestConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().setUrlPattern("/service/*");
        environment.jersey().register(new AssetTestResource());
    }
}
