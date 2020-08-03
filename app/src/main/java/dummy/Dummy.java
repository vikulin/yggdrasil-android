// Code generated by gobind. DO NOT EDIT.

// Java class dummy.Dummy is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/vikulin/yggdrasil-extras/src/dummy
package dummy;

import go.Seq;

public abstract class Dummy {
	static {
		Seq.touch(); // for loading the native library
		yggdrasil.Yggdrasil.touch();
		config.Config.touch();
		_init();
	}
	
	private Dummy() {} // uninstantiable
	
	// touch is called from other bound packages to initialize this package
	public static void touch() {}
	
	private static native void _init();
	
	
	
	public static native Conduit createConduit();
	public static native ConduitEndpoint createConduitEndpoint(Conduit c);
	/**
	 * DefaultIsTAP returns true if the default adapter mode for the current
	platform is TAP (Layer 2) and returns false for TUN (Layer 3).
	 */
	public static native boolean defaultIsTAP();
	/**
	 * DefaultMTU gets the default Dummy interface MTU for your platform. This can
	be as high as MaximumMTU(), depending on platform, but is never lower than 1280.
	 */
	public static native long defaultMTU();
	/**
	 * DefaultName gets the default Dummy interface name for your platform.
	 */
	public static native String defaultName();
	/**
	 * MaximumMTU returns the maximum supported Dummy interface MTU for your
	platform. This can be as high as 65535, depending on platform, but is never
	lower than 1280.
	 */
	public static native long maximumMTU();
}
