package osgi.enroute.examples.vaadin.addressbook.application;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Addressbook Application config", description = "Configure the addressbook application")
public @interface Config {
	@AttributeDefinition(name = "alias", defaultValue = "/addr", description = "Alias to access application")
	String alias() default "/addr";
}
