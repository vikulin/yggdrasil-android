// Code generated by gobind. DO NOT EDIT.

// Java class dummy.ConduitEndpoint is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/vikulin/yggdrasil-extras/src/dummy
package dummy;

import go.Seq;

public final class ConduitEndpoint implements Seq.Proxy {
	static { Dummy.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	ConduitEndpoint(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public ConduitEndpoint() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	public native byte[] recv();
	public native void send(byte[] p0);
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof ConduitEndpoint)) {
		    return false;
		}
		ConduitEndpoint that = (ConduitEndpoint)o;
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("ConduitEndpoint").append("{");
		return b.append("}").toString();
	}
}

