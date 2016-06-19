package osgi.enroute.examples.vaadin.addressbook.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import com.vaadin.server.UICreateEvent;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.examples.vaadin.api.Application;

@Designate(ocd = Config.class)
@RequireConfigurerExtender
@Component(name = "osgi.enroute.examples.vaadin.addressbook", property = {
		"alias=/addr" }, configurationPolicy = ConfigurationPolicy.OPTIONAL)
public class AddressbookApplication implements Application<AddressbookUI> {

	@Reference
	ContactService contacts;

	@Override
	public Class<AddressbookUI> getUIClass() {
		return AddressbookUI.class;
	}

	@Override
	public AddressbookUI getInstance(UICreateEvent event) {
		return new AddressbookUI(contacts);
	}

}
