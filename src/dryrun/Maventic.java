package dryrun;

import java.applet.Applet;
import java.awt.Button;

public class Maventic extends Applet{

	Button okButton = new Button("ok");
	@Override
	public void init() {
		add(okButton);
		add(okButton);
		add(okButton);
		add(okButton);
		add(new Button("cancelButton"));
		add(new Button("cancelButton"));
		add(new Button("cancelButton"));
		add(new Button("cancelButton"));
		setSize(300,300);
		
	}
}
