// Code generated by gobind. DO NOT EDIT.

// Java class mobile.Mobile is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java github.com/vikulin/yggdrasil-extras/src/mobile
package mobile;

import go.Seq;

public abstract class Mobile {
	static {
		Seq.touch(); // for loading the native library
		dummy.Dummy.touch();
		config.Config.touch();
		yggdrasil.Yggdrasil.touch();
		_init();
	}
	
	private Mobile() {} // uninstantiable
	
	// touch is called from other bound packages to initialize this package
	public static void touch() {}
	
	private static native void _init();
	
	
	
	/**
	 * GenerateConfigJSON generates mobile-friendly configuration in JSON format
	 */
	public static native byte[] generateConfigJSON();
}
