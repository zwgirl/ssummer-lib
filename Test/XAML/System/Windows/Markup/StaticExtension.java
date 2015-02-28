package System.Windows.Markup;

import System.IServiceProvider;

//
    // Summary:
    //     Implements a markup extension that returns static field and property references.
//    [MarkupExtensionReturnType(typeof(object))]
//    [TypeConverter(typeof(StaticExtensionConverter))]
    public class StaticExtension extends MarkupExtension
    {
        //
        // Summary:
        //     Initializes a new instance of the System.Windows.Markup.StaticExtension class.
        public StaticExtension(){
        	
        }
        //
        // Summary:
        //     Initializes a new instance of the System.Windows.Markup.StaticExtension class
        //     using the provided member String.
        //
        // Parameters:
        //   member:
        //     A String that identifies the member to make a reference to. This String uses
        //     the format prefix:typeName.fieldOrPropertyName. prefix is the mapping prefix
        //     for a XAML namespace, and is only required to reference static values that are
        //     not mapped to the default XAML namespace.
        //
        // Exceptions:
        //   T:System.ArgumentNullException:
        //     member is null.
        public StaticExtension(String member){
        	
        }
 
        //
        // Summary:
        //     Gets or sets a member name String that is used to resolve a static field or property
        //     based on the service-provided type resolver.
        //
        // Returns:
        //     A String that identifies the member to make a reference to. See Remarks.
        //
        // Exceptions:
        //   T:System.ArgumentNullException:
        //     Attempted to set System.Windows.Markup.StaticExtension.Member to null.
//        public String Member { get; set; }
        //
        // Summary:
        //     Gets or sets the System.Type that defines the static member to return.
        //
        // Returns:
        //     The System.Type that defines the static member to return.
        //
        // Exceptions:
        //   T:System.ArgumentNullException:
        //     Attempted to set System.Windows.Markup.StaticExtension.MemberType to null.
//        public Type MemberType { get; set; }
 
        //
        // Summary:
        //     Returns an object value to set on the property where you apply this extension.
        //     For System.Windows.Markup.StaticExtension, the return value is the static value
        //     that is evaluated for the requested static member.
        //
        // Parameters:
        //   serviceProvider:
        //     An object that can provide services for the markup extension. The service provider
        //     is expected to provide a service that implements a type resolver (System.Windows.Markup.IXamlTypeResolver).
        //
        // Returns:
        //     The static value to set on the property where the extension is applied.
        //
        // Exceptions:
        //   T:System.InvalidOperationException:
        //     The member value for the extension is null at the time of evaluation.
        //
        //   T:System.ArgumentException:
        //     Some part of the member String did not parse properly-or-serviceProvider did
        //     not provide a service for System.Windows.Markup.IXamlTypeResolver-or-member value
        //     did not resolve to a static member.
        //
        //   T:System.ArgumentNullException:
        //     serviceProvider is null.
        public /*override*/ Object ProvideValue(IServiceProvider serviceProvider){
			return serviceProvider;
        	
        }
    }