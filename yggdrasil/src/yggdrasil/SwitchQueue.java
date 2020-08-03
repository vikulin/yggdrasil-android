// Code generated by gobind. DO NOT EDIT.

// Java class yggdrasil.SwitchQueue is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/yggdrasil-network/yggdrasil-go/src/yggdrasil
package yggdrasil;

import go.Seq;

/**
 * SwitchQueue represents a single switch queue. Switch queues are only created
in response to congestion on a given link and represent how much data has
been temporarily cached for sending once the congestion has cleared.
 */
public final class SwitchQueue implements Seq.Proxy {
	static { Yggdrasil.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	SwitchQueue(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public SwitchQueue() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	public final native String getID();
	public final native void setID(String v);
	
	// skipped field SwitchQueue.Size with unsupported type: uint64
	
	// skipped field SwitchQueue.Packets with unsupported type: uint64
	
	// skipped field SwitchQueue.Port with unsupported type: uint64
	
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof SwitchQueue)) {
		    return false;
		}
		SwitchQueue that = (SwitchQueue)o;
		String thisID = getID();
		String thatID = that.getID();
		if (thisID == null) {
			if (thatID != null) {
			    return false;
			}
		} else if (!thisID.equals(thatID)) {
		    return false;
		}
		// skipped field SwitchQueue.Size with unsupported type: uint64
		
		// skipped field SwitchQueue.Packets with unsupported type: uint64
		
		// skipped field SwitchQueue.Port with unsupported type: uint64
		
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {getID()});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("SwitchQueue").append("{");
		b.append("ID:").append(getID()).append(",");
		return b.append("}").toString();
	}
}

