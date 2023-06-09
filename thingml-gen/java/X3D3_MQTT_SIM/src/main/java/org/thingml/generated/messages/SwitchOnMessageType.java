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

public class SwitchOnMessageType extends EventType {
public SwitchOnMessageType(short code) {super("SwitchOn", code);
}

public SwitchOnMessageType() {
super("SwitchOn", (short) 0);
}

public Event instantiate(final int did) { return new SwitchOnMessage(this, did); }
public Event instantiate(Map<String, Object> params) {return instantiate((Integer) params.get("did"));
}

public class SwitchOnMessage extends Event implements java.io.Serializable {

public final int did;
public String toString(){
return "SwitchOn (" + "did: " + did + ")";
}

protected SwitchOnMessage(EventType type, final int did) {
super(type);
this.did = did;
}
public Event clone() {
return instantiate(this.did);
}}

}

