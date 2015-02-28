package System.Windows.Markup;

import System.IServiceProvider;

//
// Summary:
// Implements a XAML markup extension in order to return a null object, which
// you
// can use to explicitly set values to null in XAML.
// [MarkupExtensionReturnType(typeof(object))]
public class NullExtension extends MarkupExtension {
	//
	// Summary:
	// Initializes a new instance of the System.Windows.Markup.NullExtension
	// class.
	public NullExtension() {

	}

	//
	// Summary:
	// Provides null to use as a value as the output of this markup extension.
	//
	// Parameters:
	// serviceProvider:
	// An object that can provide services for the markup extension
	// implementation.
	//
	// Returns:
	// A null reference.
	public/* override */Object ProvideValue(IServiceProvider serviceProvider) {
		return null;

	}
}