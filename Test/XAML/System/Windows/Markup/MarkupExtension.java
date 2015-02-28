package System.Windows.Markup;

import System.IServiceProvider;

//
// Summary:
// Provides a base class for XAML markup extension implementations that can be
// supported
// by .NET Framework XAML Services and other XAML readers and XAML writers.
public abstract class MarkupExtension {
	//
	// Summary:
	// Initializes a new instance of a class derived from
	// System.Windows.Markup.MarkupExtension.
	protected MarkupExtension() {

	}

	//
	// Summary:
	// When implemented in a derived class, returns an object that is provided
	// as the
	// value of the target property for this markup extension.
	//
	// Parameters:
	// serviceProvider:
	// A service provider helper that can provide services for the markup
	// extension.
	//
	// Returns:
	// The object value to set on the property where the extension is applied.
	public abstract Object ProvideValue(IServiceProvider serviceProvider);
}