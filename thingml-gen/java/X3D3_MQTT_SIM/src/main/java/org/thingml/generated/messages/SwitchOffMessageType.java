/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.messages;

import no.sintef.jasm.*;
import no.sintef.jasm.ext.*;

import java.util.*;
import java.nio.*;

public class SwitchOffMessageType extends EventType {
public SwitchOffMessageType(short code) {super("SwitchOff", code);
}

public SwitchOffMessageType() {
super("SwitchOff", (short) 0);
}

public Event instantiate(final int did) { return new SwitchOffMessage(this, did); }
public Event instantiate(Map<String, Object> params) {return instantiate((Integer) params.get("did"));
}

public class SwitchOffMessage extends Event implements java.io.Serializable {

public final int did;
public String toString(){
return "SwitchOff (" + "did: " + did + ")";
}

protected SwitchOffMessage(EventType type, final int did) {
super(type);
this.did = did;
}
public Event clone() {
return instantiate(this.did);
}}

}

