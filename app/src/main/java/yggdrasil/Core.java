// Code generated by gobind. DO NOT EDIT.

// Java class yggdrasil.Core is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/yggdrasil-network/yggdrasil-go/src/yggdrasil
package yggdrasil;

import go.Seq;

/**
 * The Core object represents the Yggdrasil node. You should create a Core
object for each Yggdrasil node you plan to run.
 */
public final class Core implements Seq.Proxy {
	static { Yggdrasil.touch(); }
	
	private final int refnum;
	
	@Override public final int incRefnum() {
	      Seq.incGoRef(refnum, this);
	      return refnum;
	}
	
	Core(int refnum) { this.refnum = refnum; Seq.trackGoRef(refnum, this); }
	
	public Core() { this.refnum = __New(); Seq.trackGoRef(refnum, this); }
	
	private static native int __New();
	
	// skipped field Core.Inbox with unsupported type: github.com/Arceliar/phony.Inbox
	
	// skipped method Core.Act with unsupported parameter or return types
	
	public native void addAllowedEncryptionPublicKey(String bstr) throws Exception;
	public native void addPeer(String addr, String sintf) throws Exception;
	// skipped method Core.Address with unsupported parameter or return types
	
	public native void callPeer(String addr, String sintf) throws Exception;
	public native Dialer connDialer() throws Exception;
	public native Listener connListen() throws Exception;
	// skipped method Core.Coords with unsupported parameter or return types
	
	// skipped method Core.DHTPing with unsupported parameter or return types
	
	// skipped method Core.DisconnectPeer with unsupported parameter or return types
	
	public native String encryptionPublicKey();
	// skipped method Core.GetAllowedEncryptionPublicKeys with unsupported parameter or return types
	
	// skipped method Core.GetDHT with unsupported parameter or return types
	
	// skipped method Core.GetMaximumSessionMTU with unsupported parameter or return types
	
	// skipped method Core.GetNodeInfo with unsupported parameter or return types
	
	// skipped method Core.GetPeers with unsupported parameter or return types
	
	// skipped method Core.GetSessions with unsupported parameter or return types
	
	// skipped method Core.GetSwitchPeers with unsupported parameter or return types
	
	// skipped method Core.GetSwitchQueues with unsupported parameter or return types
	
	public native TcpListener listenTCP(String uri) throws Exception;
	public native TcpListener listenTLS(String uri) throws Exception;
	// skipped method Core.MyNodeInfo with unsupported parameter or return types
	
	// skipped method Core.NodeID with unsupported parameter or return types
	
	public native void removeAllowedEncryptionPublicKey(String bstr) throws Exception;
	public native void removePeer(String addr, String sintf) throws Exception;
	// skipped method Core.SetLogger with unsupported parameter or return types
	
	// skipped method Core.SetMaximumSessionMTU with unsupported parameter or return types
	
	// skipped method Core.SetNodeInfo with unsupported parameter or return types
	
	// skipped method Core.SetSessionGatekeeper with unsupported parameter or return types
	
	public native String signingPublicKey();
	// skipped method Core.Start with unsupported parameter or return types
	
	/**
	 * Stop shuts down the Yggdrasil node.
	 */
	public native void stop();
	// skipped method Core.Subnet with unsupported parameter or return types
	
	// skipped method Core.TreeID with unsupported parameter or return types
	
	/**
	 * UpdateConfig updates the configuration in Core with the provided
	config.NodeConfig and then signals the various module goroutines to
	reconfigure themselves if needed.
	 */
	public native void updateConfig(config.NodeConfig config);
	@Override public boolean equals(Object o) {
		if (o == null || !(o instanceof Core)) {
		    return false;
		}
		Core that = (Core)o;
		// skipped field Core.Inbox with unsupported type: github.com/Arceliar/phony.Inbox
		
		return true;
	}
	
	@Override public int hashCode() {
	    return java.util.Arrays.hashCode(new Object[] {});
	}
	
	@Override public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("Core").append("{");
		return b.append("}").toString();
	}
}

