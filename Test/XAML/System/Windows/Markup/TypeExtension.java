package System.Windows.Markup;

import System.IServiceProvider;

//
// Summary:
//     Implements a markup extension that returns a System.Type based on a string input.
//[MarkupExtensionReturnType(typeof(Type))]
//[TypeConverter(typeof(TypeExtensionConverter))]
public class TypeExtension extends MarkupExtension
{
    //
    // Summary:
    //     Initializes a new instance of the System.Windows.Markup.TypeExtension class.
    public TypeExtension(){
    	
    }
    //
    // Summary:
    //     Initializes a new instance of the System.Windows.Markup.TypeExtension class,
    //     declaring the type directly.
    //
    // Parameters:
    //   type:
    //     The type to be represented by this System.Windows.Markup.TypeExtension.
    //
    // Exceptions:
    //   T:System.ArgumentNullException:
    //     type is null
    public TypeExtension(Type type){
    	
    }
    //
    // Summary:
    //     Initializes a new instance of the System.Windows.Markup.TypeExtension class,
    //     initializing the System.Windows.Markup.TypeExtension.TypeName value based on
    //     the provided typeName string.
    //
    // Parameters:
    //   typeName:
    //     A string that identifies the type to make a reference to. This string uses the
    //     format prefix:className. prefix is the mapping prefix for a XAML namespace, and
    //     is only required to reference types that are not mapped to the default XAML namespace.
    //
    // Exceptions:
    //   T:System.ArgumentNullException:
    //     Attempted to specify typeName as null.
    public TypeExtension(String typeName){
    	
    }

    //
    // Summary:
    //     Gets or sets the type information for this extension.
    //
    // Returns:
    //     The established type. For runtime purposes, this may be null for get access,
    //     but cannot be set to null.
    //
    // Exceptions:
    //   T:System.ArgumentNullException:
    //     Attempted to set to null.
//    [ConstructorArgument("type")]
//    [DefaultValue(null)]
//    public Type Type { get; set; }
    //
    // Summary:
    //     Gets or sets the type name represented by this markup extension.
    //
    // Returns:
    //     A string that identifies the type. This string uses the format prefix:className. (prefix
    //     is the mapping prefix for an XML namespace, and is only required to reference
    //     types that are not mapped to the default XML namespace for WPF (http://schemas.microsoft.com/winfx/2006/xaml/presentation).
    //
    // Exceptions:
    //   T:System.ArgumentNullException:
    //     Attempted to set to null.
//    [DesignerSerializationVisibility(DesignerSerializationVisibility.Hidden)]
//    public String TypeName { get; set; }

    //
    // Summary:
    //     Returns an object that should be set on the property where this extension is
    //     applied. For System.Windows.Markup.TypeExtension , this is the System.Type value
    //     as evaluated for the requested type name.
    //
    // Parameters:
    //   serviceProvider:
    //     Object that can provide services for the markup extension. The provider is expected
    //     to provide a service for System.Windows.Markup.IXamlTypeResolver.
    //
    // Returns:
    //     The System.Type to set on the property where the extension is applied.
    //
    // Exceptions:
    //   T:System.InvalidOperationException:
    //     member value for the extension is null.
    //
    //   T:System.ArgumentException:
    //     Some part of the typeName string did not parse properly.-or-serviceProvider did
    //     not provide a service for System.Windows.Markup.IXamlTypeResolver-or-typeName
    //     value did not resolve to a type.
    //
    //   T:System.ArgumentNullException:
    //     serviceProvider is null
    public /*override*/ Object ProvideValue(IServiceProvider serviceProvider){
		return serviceProvider;
    	
    }
}