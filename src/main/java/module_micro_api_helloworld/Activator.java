package module_micro_api_helloworld;

import com.github.microprograms.osgi_module_activator.ModuleActivator;

import module_micro_api_helloworld.api.Welcome;
import module_micro_api_helloworld.utils.Oss;

public class Activator extends ModuleActivator {

	@Override
	protected void onStart() throws Exception {
		Oss.init(Config.load(context));
		registerApi(new Welcome());
	}
}
