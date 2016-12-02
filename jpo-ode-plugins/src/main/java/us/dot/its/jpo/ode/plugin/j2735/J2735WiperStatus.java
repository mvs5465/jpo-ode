package us.dot.its.jpo.ode.plugin.j2735;

import us.dot.its.jpo.ode.plugin.asn1.Asn1Object;

public enum J2735WiperStatus implements Asn1Object {
	unavailable,
	off,
	intermittent,
	low,
	high,
	washerInUse,
	automaticPresent

}