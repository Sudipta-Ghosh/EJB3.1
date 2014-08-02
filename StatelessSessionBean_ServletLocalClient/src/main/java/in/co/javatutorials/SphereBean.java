package in.co.javatutorials;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author javatutorials.co.in
 */
@Stateless
@LocalBean                            // declares HelloWorld as remote business interface
public class SphereBean {
public double computeVolume(double radius) {
	return (4.0/3.0)*Math.PI*(radius*radius*radius);
}
}
