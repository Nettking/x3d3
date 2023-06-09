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

public class Fetch_tempMessageType extends EventType {
public Fetch_tempMessageType(short code) {super("fetch_temp", code);
}

public Fetch_tempMessageType() {
super("fetch_temp", (short) 0);
}

public Event instantiate() { return new Fetch_tempMessage(this); }
public Event instantiate(Map<String, Object> params) {return instantiate();
}

public class Fetch_tempMessage extends Event implements java.io.Serializable {

public String toString(){
return "fetch_temp (" + ")";
}

protected Fetch_tempMessage(EventType type) {
super(type);
}
public Event clone() {
return instantiate();
}}

}

