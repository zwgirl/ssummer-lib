module org.w3c.html;

import org.w3c.dom.DOMStringList;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.css.CSSStyleDeclaration;
import org.w3c.event.Event;
import org.w3c.event.EventTarget;
import org.w3c.event.MouseEvent;
import org.w3c.file.File;
import org.w3c.range.Range;
import org.w3c.views.AbstractView;
import org.w3c.webstorage.Storage;

/*
 * Copyright 2004-2009 Apple Computer, Inc., Mozilla Foundation, and Opera Software ASA.
 * You are granted a license to use, reproduce and create derivative works of this document.
 *
 * See HTML 5 Draft Recommendation 鈥� 30 March 2009 for more details:
 * http://www.whatwg.org/specs/web-apps/current-work/
 */

//#ifndef _HTML5_IDL_
//#define _HTML5_IDL_
//
//#include "w3c/dom.idl"
//#include "w3c/events.idl"
//#include "w3c/css.idl"
//#include "w3c/ranges.idl"
//
//module webstorage {
//  public native interface Database;
//  public native interface Storage;
//};
//
//module html5 {
//
//  typedef dom::Node Node;
//  typedef dom::Document Document;
//  typedef dom::NodeList NodeList;
//  typedef dom::Element Element;
//  typedef dom::DOMStringList DOMStringList;
//  typedef views::AbstractView AbstractView;
//  typedef events::Event Event;
//  typedef events::EventTarget EventTarget;
//  typedef events::MouseEvent MouseEvent;
//  typedef css::CSSStyleDeclaration CSSStyleDeclaration;
//  typedef ranges::Range Range;
//  typedef webstorage::Database Database;
//  typedef webstorage::Storage Storage;
//
//  typedef sequence<MessagePort> MessagePortArray;
//
//  // XXX
//  typedef any Date;

  public native interface HTMLCollection {
//    readonly attribute unsigned 
	  long length{}
//    getter Element item(final unsigned long index);
//    caller getter Element namedItem(in String name);
	  Element this[long index];
	  Element this[String name];
  }	

  public native interface HTMLFormControlsCollection {
//    readonly attribute unsigned 
	  long length{}
//    getter HTMLElement item(in unsigned long index);
//    caller getter object namedItem(in String name);
	  Element this[long index];
	  Object this[String name];
  }

  public native interface HTMLOptionsCollection {
//             attribute unsigned 
	  long length{}
//    getter HTMLOptionElement item(in unsigned long index);
//    caller getter object namedItem(in String name);
	  HTMLOptionElement this[long index];
	  Object this[String name];
	  void add(final HTMLElement element);
	  void add(final HTMLElement element, final HTMLElement before);
	  void add(final HTMLElement element, final long before);
	  void remove(final long index);
  }

  public native interface DOMTokenList {
//    stringifier;
//    readonly attribute unsigned long length;
//    getter String item(in unsigned long index);
	  String this[long index];
	  boolean has(final String token);
	  void add(final String token);
	  void remove(final String token);
	  boolean toggle(final String token);
  }

//  [NameCreator, NameDeleter, NameGetter, NameSetter]
  public native interface DOMStringMap {}

//  Document implements HTMLDocument
//  [NameGetter=OverrideBuiltins]
  public native interface HTMLDocument {
    // resource metadata management
//    [PutForwards=href] readonly attribute 
	  Location location{}
//    readonly attribute 
	  String URL{}
//             attribute 
	  String domain{}
//    readonly attribute 
	  String referrer{}
//             attribute 
	  String cookie{}
//    readonly attribute 
	  String lastModified{}
//    readonly attribute 
	  String compatMode{}
//             attribute 
	  String charset{}
//    readonly attribute 
	  String characterSet{}
//    readonly attribute 
	  String defaultCharset{}
//    readonly attribute 
	  String readyState{}

    // DOM tree accessors
//             attribute 
	  String title{}
//             attribute 
	  String dir{}
//             attribute 
	  HTMLElement body{}
//    readonly attribute 
	  HTMLCollection images{}
//    readonly attribute 
	  HTMLCollection embeds{}
//    readonly attribute 
	  HTMLCollection plugins{}
//    readonly attribute
	  HTMLCollection links{}
//    readonly attribute 
	  HTMLCollection forms{}
//    readonly attribute 
	  HTMLCollection anchors{}
//    readonly attribute 
	  HTMLCollection scripts{}
	  NodeList getElementsByName(final String elementName);
	  NodeList getElementsByClassName(final String classNames);

	  // dynamic markup insertion
//             attribute 
	  String innerHTML{}
	  HTMLDocument open();
	  HTMLDocument open(final String type);
	  HTMLDocument open(final String type, final String replace);
	  /*WindowProxy*/Window  open(final String url, final String name, final String features);
	  /*WindowProxy*/Window  open(final String url, final String name, final String features, final boolean replace);
	  void close();
	  void write(final String... text);
	  void writeln(final String... text);

	  // user interaction
	  Selection getSelection();
//	  readonly attribute 
	  Element activeElement{}
	  boolean hasFocus();
//      attribute 
	  String designMode{}
      boolean execCommand(final String commandId);
      boolean execCommand(final String commandId, final boolean showUI);
      boolean execCommand(final String commandId, final boolean showUI, final String value);
      boolean queryCommandEnabled(final String commandId);
      boolean queryCommandIndeterm(final String commandId);
      boolean queryCommandState(final String commandId);
      boolean queryCommandSupported(final String commandId);
      String queryCommandValue(final String commandId);
//      readonly attribute 
      HTMLCollection commands{}
  }

  public native interface HTMLElement extends Element {
    // DOM tree accessors
    NodeList getElementsByClassName(final String classNames);

    // dynamic markup insertion
//             attribute 
    String innerHTML{}
//             attribute 
    String outerHTML{}
    void insertAdjacentHTML(final String position, final String text);

    // metadata attributes
//             attribute 
    String id{}
//             attribute 
    String title{}
//             attribute 
    String lang{}
//             attribute 
    String dir{}
//             attribute 
    String className{}
//    readonly attribute 
    DOMTokenList classList{}
//    readonly attribute 
    DOMStringMap dataset{}

    // user interaction
//             attribute
    boolean hidden{}
    void click();
    void scrollIntoView();
    void scrollIntoView(final boolean top);
//             attribute 
    long tabIndex{}
    void focus();
    void blur();
//             attribute 
    boolean draggable{}
//             attribute 
    String contentEditable{}
//    readonly attribute 
    boolean isContentEditable{}
//             attribute 
    HTMLMenuElement contextMenu{}
//             attribute 
    boolean spellcheck{}

    // styling
//    readonly attribute 
    CSSStyleDeclaration style{}

    // event handler DOM attributes
//             attribute 
    Function onabort{}
//             attribute 
    Function onblur{}
//             attribute 
    Function onchange{}
//             attribute 
    Function onclick{}
//             attribute 
    Function oncontextmenu{}
//             attribute 
    Function ondblclick{}
//             attribute 
    Function ondrag{}
//             attribute 
    Function ondragend{}
//             attribute 
    Function ondragenter{}
//             attribute 
    Function ondragleave{}
//             attribute 
    Function ondragover{}
//             attribute
    Function ondragstart{}
//             attribute 
    Function ondrop{}
//             attribute
    Function onerror{}
//             attribute 
    Function onfocus{}
//             attribute 
    Function onkeydown{}
//             attribute
    Function onkeypress{}
//             attribute 
    Function onkeyup{}
//             attribute 
    Function onload{}
//             attribute 
    Function onmousedown{}
//             attribute 
    Function onmousemove{}
//             attribute 
    Function onmouseout{}
//             attribute 
    Function onmouseover{}
//             attribute 
    Function onmouseup{}
//             attribute 
    Function onmousewheel{}
//             attribute 
    Function onscroll{}
//             attribute 
    Function onselect{}
//             attribute 
    Function onsubmit{}
  }

  public native interface HTMLBaseElement extends HTMLElement {
//             attribute 
	  String href{}
//             attribute 
	  String target{}
  }

  public native interface HTMLLinkElement extends HTMLElement {
//             attribute 
	  boolean disabled{}
//             attribute 
	  String href{}
//             attribute 
	  String rel{}
//    readonly attribute 
	  DOMTokenList relList{}
//             attribute 
	  String media{}
//             attribute 
	  String hreflang{}
//             attribute 
	  String type{}
//             attribute 
	  String sizes{}
  }

  public native interface HTMLMetaElement extends HTMLElement {
//             attribute 
	  String content{}
//             attribute 
	  String name{}
//             attribute 
	  String httpEquiv{}
  };

  public native interface HTMLStyleElement extends HTMLElement {
//             attribute 
	  boolean disabled{}
//             attribute 
	  String media{}
//             attribute 
	  String type{}
//             attribute 
	  boolean scoped{}
  }

  public native interface HTMLScriptElement extends HTMLElement {
//             attribute
	  String src{}
//             attribute 
	  boolean async{}
//             attribute 
	  boolean defer{}
//             attribute 
	  String type{}
//             attribute 
	  String charset{}
//             attribute 
	  String text{}
  }

  public native interface HTMLBodyElement extends HTMLElement {
//    attribute 
	  Function onbeforeunload{}
//      attribute 
      Function onerror{}     // XXX defined in HTMLDocument
//     attribute 
	  Function onhashchange{}
//    attribute 
	  Function onload{}      // XXX defined in HTMLDocument
//             attribute 
	  Function onmessage{}
//             attribute
	  Function onoffline{}
//     attribute 
	  Function ononline{}
//     attribute 
	  Function onpopstate{}
//      attribute 
      Function onresize{}
//      attribute 
      Function onstorage{}
//      attribute 
      Function onunload{}
  }

  public native interface HTMLQuoteElement extends HTMLElement {
//       attribute 
	  String cite{}
  }

  public native interface HTMLOListElement extends HTMLElement {
//      attribute 
	  boolean reversed{}
//    attribute 
    long start{}
  }

  public native interface HTMLLIElement extends HTMLElement {
//  	attribute 
	  long value{}
  }

  public native interface HTMLAnchorElement extends HTMLElement {
//	  stringifier attribute 
	  String href{}
//  attribute 
	  String target{}
//             attribute 
	  String ping{}
//             attribute 
	  String rel{}
//    readonly attribute 
	  DOMTokenList relList{}
//             attribute 
	  String media{}
//             attribute 
	  String hreflang{}
//             attribute 
	  String type{}
  }

  public native interface HTMLTimeElement extends HTMLElement {
//    attribute 
	  String dateTime{}
//    readonly attribute 
	  /*Date*/long date{}
//    readonly attribute 
	  /*Date*/long time{}
//    readonly attribute 
	  /*Date*/long timezone{}
  }

  public native interface HTMLProgressElement extends HTMLElement {
//   	attribute
	  float value{}
//    	attribute 
	  float max{}
//    readonly attribute 
	  float position{}
	  
//	  readonly attribute 
	  NodeList labels{}
  }

  public native interface HTMLMeterElement extends HTMLElement {
//  	attribute
	  float value{}
//	attribute
	  float min{}
//    attribute 
	  float max{}
//    attribute 
	  float low{}
//    attribute 
	  float high{}
//    attribute 
	  float optimum{}
//	  readonly attribute
	  NodeList labels{}
  }

  public native interface HTMLModElement extends HTMLElement {
//             attribute 
	  String cite{}
//             attribute 
	  String dateTime{}
  }

//  [NamedConstructor=Image(),
//   NamedConstructor=Image(final unsigned long width),
//   NamedConstructor=Image(final unsigned long width, final unsigned long height)]
  public native interface HTMLImageElement extends HTMLElement {
//             attribute 
	  String alt{}
//             attribute 
	  String src{}
//             attribute 
	  String useMap{}
//             attribute 
	  boolean isMap{}
//             attribute unsigned 
	  long width{}
//             attribute unsigned 
	  long height{}
//    readonly attribute
	  boolean complete{}
	  
//      attribute 
      String crossOrigin{}
//readonly attribute unsigned 
      long naturalWidth{}
//readonly attribute unsigned 
      long naturalHeight{}
  }

  public native interface HTMLIFrameElement extends HTMLElement {
//             attribute 
	  String src{}
//             attribute 
	  String name{}
//             attribute 
	  String sandbox{}
//             attribute 
	  boolean seamless{}
//             attribute 
	  String width{}
//             attribute
	  String height{}
	  
//      attribute 
	  String srcdoc{}
//      [PutForwards=value] readonly attribute 
//      DOMSettableTokenList sandbox{}
//readonly attribute 
      Document contentDocument{}
//readonly attribute 
      Window contentWindow{}
  }

  public native interface HTMLEmbedElement extends HTMLElement {
//             attribute 
	  String src{}
//             attribute 
	  String type{}
//             attribute 
	  String width{}
//             attribute
	  String height{}
  }

  public native interface HTMLObjectElement extends HTMLElement {
//             attribute 
	  String data{}
//             attribute 
	  String type{}
//             attribute
	  String name{}
//             attribute 
	  String useMap{}
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute 
	  String width{}
//             attribute
	  String height{}
	  
//      attribute 
	  boolean typeMustMatch{}
//readonly attribute 
	  Document/*?*/ contentDocument{}
//	  readonly attribute 
	  Window/*?*/ contentWindow{}

//	  readonly attribute 
	  boolean willValidate{}
//	  readonly attribute 
	  ValidityState validity{}
//	  readonly attribute 
	  String validationMessage{}
	  boolean checkValidity();
	  void setCustomValidity(String error);
  }

  public native interface HTMLParamElement extends HTMLElement {
//             attribute 
	  String name{}
//             attribute 
	  String value{}
  }

  public native interface HTMLSourceElement extends HTMLElement {
//             attribute
	  String src{}
//             attribute 
	  String type{}
//             attribute
	  String media{}
  }

  public native interface HTMLMediaElement extends HTMLElement {

    // error state
//    readonly attribute 
	  MediaError error{}

    // network state
//             attribute 
	  String src{}
//    readonly attribute 
	  String currentSrc{}
//    const unsigned 
	  static final short NETWORK_EMPTY = 0;
//    const unsigned 
	  static final short NETWORK_IDLE = 1;
//    const unsigned 
	  static final short NETWORK_LOADING = 2;
//    const unsigned
	  static final short NETWORK_LOADED = 3;
//    const unsigned 
	  static final short NETWORK_NO_SOURCE = 4;
//    readonly attribute unsigned 
	  short networkState{}
//             attribute
	  boolean autobuffer{}

//    readonly attribute 
	  TimeRanges buffered{}
	  void load();
	  String canPlayType(final String type);

    // ready state
//    const unsigned 
	  static final short HAVE_NOTHING = 0;
//    const unsigned 
	  static final short HAVE_METADATA = 1;
//    const unsigned 
	  static final short HAVE_CURRENT_DATA = 2;
//    const unsigned 
	  static final short HAVE_FUTURE_DATA = 3;
//    const unsigned 
	  static final short HAVE_ENOUGH_DATA = 4;
//    readonly attribute unsigned 
	  short readyState{}
//    readonly attribute 
	  boolean seeking{}

    // playback state
//             attribute 
	  float currentTime{}
//    readonly attribute
	  float duration{}
//    readonly attribute 
	  boolean paused{}
//             attribute
	  float defaultPlaybackRate{}
//             attribute 
	  float playbackRate{}
//    readonly attribute 
	  TimeRanges played{}
//    readonly attribute 
	  TimeRanges seekable{}
//    readonly attribute
	  boolean ended{}
//             attribute 
	  boolean autoplay{}
//             attribute 
	  boolean loop{}
	  void play();
	  void pause();

	  // cue ranges
	  void addCueRange(final String className, final String id, final float start, final float end, final boolean pauseOnExit, final CueRangeCallback enterCallback, final CueRangeCallback exitCallback);
	  void removeCueRanges(final String className);

	  // controls
//             attribute 
	  boolean controls{}
//             attribute 
	  float volume{}
//             attribute 
	  boolean muted{}
  }

  public native interface HTMLVideoElement extends HTMLMediaElement {
//             attribute 
	  String width{}
//             attribute 
	  String height{}
//    readonly attribute unsigned
	  long videoWidth{}
//    readonly attribute unsigned
	  long videoHeight{}
//             attribute 
	  String poster{}
  }

//  [NamedConstructor=Audio(),
//   NamedConstructor=Audio(final String src)]
  public native interface HTMLAudioElement extends HTMLMediaElement {
    // no members
  }

//  [Callback=FunctionOnly, NoInterfaceObject]
  public native interface CueRangeCallback {
    void handleEvent(final String id);
  }

  public native interface MediaError {
//    const unsigned 
	  static final short MEDIA_ERR_ABORTED = 1;
//    const unsigned 
	  static final short MEDIA_ERR_NETWORK = 2;
//    const unsigned 
	  static final short MEDIA_ERR_DECODE = 3;
//    const unsigned 
	  static final short MEDIA_ERR_NONE_SUPPORTED = 4;
//    readonly attribute  unsigned 
	  short code{}
  }

  public native interface TimeRanges {
//    readonly attribute unsigned 
	  long length{}
	  float start(final /*unsigned*/ long index);
	  float end(final /*unsigned*/ long index);
  }

  public native interface HTMLCanvasElement extends HTMLElement {
//             attribute unsigned 
	  long width{}
//             attribute unsigned 
	  long height{}

	  String toDataURL(final Object... args);
	  String toDataURL(final String type, final Object... args);
	  
	  void toBlob(FileCallback/*?*/ _callback, Object... arguments);
	  void toBlob(FileCallback/*?*/ _callback, String type, Object... arguments);

	  CanvasRenderingContext2D /*?*/ getContext(final String contextId);
  }
  
  interface FileCallback {
	  	void callback(File file);
  }

  public native interface CanvasRenderingContext2D {

    // back-reference to the canvas
//    readonly attribute 
	  HTMLCanvasElement canvas{}

    // state
    void save(); // push state on state stack
    void restore(); // pop state stack and restore state

    // transformations (default transform is the identity matrix)
    void scale(final float x, final float y);
    void rotate(final float angle);
    void translate(final float x, final float y);
    void transform(final float m11, final float m12, final float m21, final float m22, final float dx, final float dy);
    void setTransform(final float m11, final float m12, final float m21, final float m22, final float dx, final float dy);

    // compositing
//             attribute 
    float globalAlpha{} // (default 1.0)
//             attribute 
    String globalCompositeOperation{} // (default source-over)

    // colors and styles
//             attribute 
    Object strokeStyle{} // (default black)
//             attribute 
    Object fillStyle{} // (default black)
    CanvasGradient createLinearGradient(final float x0, final float y0, final float x1, final float y1);
    CanvasGradient createRadialGradient(final float x0, final float y0, final float r0, final float x1, final float y1, final float r1);
    CanvasPattern createPattern(final HTMLImageElement image, final String repetition);
    CanvasPattern createPattern(final HTMLCanvasElement image, final String repetition);

    // line caps/joins
//             attribute 
    float lineWidth{} // (default 1)
//             attribute 
    String lineCap{} // "butt", "round", "square" (default "butt")
//             attribute 
    String lineJoin{} // "round", "bevel", "miter" (default "miter")
//             attribute 
    float miterLimit{} // (default 10)

    // shadows
//             attribute 
    float shadowOffsetX{} // (default 0)
//             attribute
    float shadowOffsetY{} // (default 0)
//             attribute 
    float shadowBlur{} // (default 0)
//             attribute 
    String shadowColor{} // (default transparent black)

    // rects
    void clearRect(final float x, final float y, final float w, final float h);
    void fillRect(final float x, final float y, final float w, final float h);
    void strokeRect(final float x, final float y, final float w, final float h);

    // path API
    void beginPath();
    void closePath();
    void moveTo(final float x, final float y);
    void lineTo(final float x, final float y);
    void quadraticCurveTo(final float cpx, final float cpy, final float x, final float y);
    void bezierCurveTo(final float cp1x, final float cp1y, final float cp2x, final float cp2y, final float x, final float y);
    void arcTo(final float x1, final float y1, final float x2, final float y2, final float radius);
    void rect(final float x, final float y, final float w, final float h);
    void arc(final float x, final float y, final float radius, final float startAngle, final float endAngle, final boolean anticlockwise);
    void fill();
    void stroke();
    void clip();
    boolean isPointInPath(final float x, final float y);

    // text
//             attribute 
    String font{} // (default 10px sans-serif)
//             attribute 
    String textAlign{} // "start", "end", "left", "right", "center" (default: "start")
//             attribute 
    String textBaseline{} // "top", "hanging", "middle", "alphabetic", "ideographic", "bottom" (default: "alphabetic")
    void fillText(final String text, final float x, final float y);
    void fillText(final String text, final float x, final float y, final float maxWidth);
    void strokeText(final String text, final float x, final float y);
    void strokeText(final String text, final float x, final float y, final float maxWidth);
    TextMetrics measureText(final String text);

    // drawing images
    void drawImage(final HTMLImageElement image, final float dx, final float dy, final float dh);
    void drawImage(final HTMLImageElement image, final float dx, final float dy, final float dw, final float dh);
    void drawImage(final HTMLImageElement image, final float sx, final float sy, final float sw, final float sh, final float dx, final float dy, final float dw, final float dh);
    void drawImage(final HTMLCanvasElement image, final float dx, final float dy, final float dh);
    void drawImage(final HTMLCanvasElement image, final float dx, final float dy, final float dw, final float dh);
    void drawImage(final HTMLCanvasElement image, final float sx, final float sy, final float sw, final float sh, final float dx, final float dy, final float dw, final float dh);
    void drawImage(final HTMLVideoElement image, final float dx, final float dy, final float dh);
    void drawImage(final HTMLVideoElement image, final float dx, final float dy, final float dw, final float dh);
    void drawImage(final HTMLVideoElement image, final float sx, final float sy, final float sw, final float sh, final float dx, final float dy, final float dw, final float dh);

    // pixel manipulation
    ImageData createImageData(final float sw, final float sh);
    ImageData getImageData(final float sx, final float sy, final float sw, final float sh);
    void putImageData(final ImageData imagedata, final float dx, final float dy, final float dirtyY, final float dirtyWidth, final float dirtyHeight);
    void putImageData(final ImageData imagedata, final float dx, final float dy, final float dirtyX, final float dirtyY, final float dirtyWidth, final float dirtyHeight);
  }

  public native interface CanvasGradient {
    // opaque object
    void addColorStop(final float offset, final String color);
  }

  public native interface CanvasPattern {
    // opaque object
  }

  public native interface TextMetrics {
//    readonly attribute 
	  float width{}
  }

  public native interface ImageData {
//    readonly attribute unsigned 
	  long width{}
//    readonly attribute unsigned 
	  long height{}
//    readonly attribute 
	  CanvasPixelArray data{}
  }

//  [IndexGetter, IndexSetter]
  public native interface CanvasPixelArray {
//    readonly attribute unsigned 
	  long length{}
  }

  public native interface HTMLMapElement extends HTMLElement {
//             attribute 
	  String name{}
//    readonly attribute 
      HTMLCollection areas{}
//    readonly attribute 
      HTMLCollection images{}
  }

  public native interface HTMLAreaElement extends HTMLElement {
//    attribute 
	  String alt{}
//     attribute 
	  String coords{}
//     attribute 
	  String shape{}
//     attribute 
	  String href{}
//     attribute 
	  String target{}
//     attribute 
	  String ping{}
//     attribute 
//	  
	  String rel{}
//    readonly attribute 
	  DOMTokenList relList{}
//             attribute 
	  String media{}
//             attribute 
	  String hreflang{}
//             attribute 
	  String type{}
  }

  public native interface HTMLTableElement extends HTMLElement {
//             attribute 
	  HTMLTableCaptionElement caption{}
	  HTMLElement createCaption();
	  void deleteCaption();
//             attribute 
	  HTMLTableSectionElement tHead{}
	  HTMLElement createTHead();
	  void deleteTHead();
//             attribute 
	  HTMLTableSectionElement tFoot{}
	  HTMLElement createTFoot();
	  void deleteTFoot();
//    readonly attribute 
	  HTMLCollection tBodies{}
	  HTMLElement createTBody();
//    readonly attribute 
	  HTMLCollection rows{}
	  HTMLElement insertRow();
	  HTMLElement insertRow(final /*optional*/ long index);
	  void deleteRow(final long index);
  }

  public native interface HTMLTableCaptionElement extends HTMLElement {
//             attribute
	  String       align{}
  }

  public native interface HTMLTableColElement extends HTMLElement {
//             attribute unsigned
	  long span{}
  }

  public native interface HTMLTableSectionElement extends HTMLElement {
//    readonly attribute 
	  HTMLCollection rows{}
	  HTMLElement insertRow();
	  HTMLElement insertRow(final /*optional*/ long index);
	  void deleteRow(final long index);
  }

  public native interface HTMLTableRowElement extends HTMLElement {
//    readonly attribute 
	  long rowIndex{}
//    readonly attribute 
	  long sectionRowIndex{}
//    readonly attribute 
	  HTMLCollection cells{}
	  HTMLElement insertCell();
	  HTMLElement insertCell(final long index);
	  void deleteCell(final long index);
  }

  public native interface HTMLTableCellElement extends HTMLElement {
//             attribute 
	  long colSpan{}
//             attribute 
	  long rowSpan{}
//             attribute 
	  String headers{}
//    readonly attribute 
	  long cellIndex{}
  }

  public native interface HTMLTableDataCellElement extends HTMLTableCellElement {};

  public native interface HTMLTableHeaderCellElement extends HTMLTableCellElement {
//             attribute 
	  String scope{}
  }

  public native interface HTMLFormElement extends HTMLElement {
//             attribute 
	  String acceptCharset{}
//             attribute
	  String action{}
//             attribute
	  boolean autocomplete{}
//             attribute 
	  String enctype{}
//             attribute 
	  String method{}
//             attribute
	  String name{}
//             attribute 
	  boolean novalidate{}
//             attribute 
	  String target{}

//    readonly attribute 
	  HTMLFormControlsCollection elements{}
//    readonly attribute 
	  long length{}
//	  getter any item(final unsigned long index);
//	  [OverrideBuiltins] caller getter any namedItem(final String name);
	  Object this[long index];
	  Object this[String name];
	  void submit();
	  void reset();
	  boolean checkValidity();

    void dispatchFormInput();
    void dispatchFormChange();
  }

  public native interface HTMLFieldSetElement extends HTMLElement {
//             attribute 
	  boolean disabled{}
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute 
	  String name{}

//    readonly attribute 
	  String type{}

//    readonly attribute 
	  HTMLFormControlsCollection elements{}

//    readonly attribute 
	  boolean willValidate{}
//    readonly attribute 
	  ValidityState validity{}
//    readonly attribute 
	  String validationMessage{}
	  boolean checkValidity();
	  void setCustomValidity(final String error);
  }

  public native interface HTMLLabelElement extends HTMLElement {
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute 
	  String htmlFor{}
//    readonly attribute
	  HTMLElement control{}
  }

  public native interface HTMLInputElement extends HTMLElement {
//             attribute
	  String accept{}
//             attribute 
	  String alt{}
//             attribute 
	  boolean autocomplete{}
//             attribute 
	  boolean autofocus{}
//             attribute 
	  boolean defaultChecked{}
//             attribute 
	  boolean checked{}
//             attribute 
	  boolean disabled{}
//    readonly attribute 
      HTMLFormElement form{}
//             attribute 
      String formAction{}
//             attribute 
      String formEnctype{}
//             attribute 
      String formMethod{}
//             attribute 
      boolean formNoValidate{}
//             attribute 
      String formTarget{}
//             attribute 
      String height{}
//             attribute 
      boolean indeterminate{}
//    readonly attribute 
      HTMLElement list{}
//             attribute 
      String max{}
//             attribute 
      long maxLength{}
//             attribute 
      String min{}
//             attribute 
      boolean multiple{}
//             attribute 
      String name{}
//             attribute 
      String pattern{}
//             attribute 
      String placeholder{}
//             attribute 
      boolean readOnly{}
//             attribute 
      boolean required{}
//             attribute unsigned 
      long size{}
//             attribute 
      String src{}
//             attribute 
      String step{}
//             attribute 
      String type{}
//             attribute 
      String defaultValue{}
//             attribute 
      String value{}
//             attribute 
      /*Date*/long valueAsDate{}
//             attribute
      float valueAsNumber{}
//    readonly attribute 
      HTMLOptionElement selectedOption{}
//             attribute 
      String width{}

      void stepUp(final long n);
      void stepDown(final long n);

//    readonly attribute 
      boolean willValidate{}
//    readonly attribute 
      ValidityState validity{}
//    readonly attribute 
      String validationMessage{}
      boolean checkValidity();
      void setCustomValidity(final String error);

//      readonly attribute
      NodeList labels{}

      void select();
//             attribute unsigned 
      long selectionStart{}
//             attribute unsigned 
      long selectionEnd{}
      void setSelectionRange(final /*unsigned*/ long start, final /*unsigned*/ long end);
  }

  public native interface HTMLButtonElement extends HTMLElement {
//             attribute 
	  boolean autofocus{}
//             attribute 
	  boolean disabled{}
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute 
	  String formaction{}
//             attribute 
	  String formenctype{}
//             attribute 
	  String formmethod{}
//             attribute 
	  String formnoValidate{}
//             attribute 
	  String formtarget{}
//             attribute 
	  String name{}
//             attribute 
	  String type{}
//             attribute 
	  String value{}

//    readonly attribute 
	  boolean willValidate{}
//    readonly attribute 
	  ValidityState validity{}
//    readonly attribute 
	  String validationMessage{}
	  boolean checkValidity();
	  void setCustomValidity(final String error);

//	  readonly attribute 
	  NodeList labels{}
  }

  public native interface HTMLSelectElement extends HTMLElement {
//             attribute 
	  boolean autofocus{}
//             attribute 
	  boolean disabled{}
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute 
	  boolean multiple{}
//             attribute 
	  String name{}
//             attribute 
	  boolean size{}

//    readonly attribute 
	  String type{}

//    readonly attribute 
	  HTMLOptionsCollection options{}
//             attribute unsigned 
	  long length{}
//	  getter any item(final unsigned long index);
//	  caller getter any namedItem(final String name);
	  Object this[long index];
	  Object this[String name];
	  void add(final HTMLElement element);
	  void add(final HTMLElement element, final HTMLElement before);
	  void add(final HTMLElement element, final long before);
	  void remove(final long index);

//	  readonly attribute 
	  HTMLCollection selectedOptions{}
//             attribute 
	  long selectedIndex{}
//             attribute 
      String value{}

//             readonly attribute 
      boolean willValidate{}
//    readonly attribute 
      ValidityState validity{}
//    readonly attribute 
      String validationMessage{}
      boolean checkValidity();
      void setCustomValidity(final String error);

//      readonly attribute 
      NodeList labels{}
  }

  public native interface HTMLDataListElement extends HTMLElement {
//    readonly attribute 
	  HTMLCollection options{}
  }

  public native interface HTMLOptGroupElement extends HTMLElement {
//             attribute
	  boolean disabled{}
//             attribute 
	  String label{}
  }

//  [NamedConstructor=Option(),
//   NamedConstructor=Option(final String text),
//   NamedConstructor=Option(final String text, final String value),
//   NamedConstructor=Option(final String text, final String value, final boolean defaultSelected),
//   NamedConstructor=Option(final String text, final String value, final boolean defaultSelected, final boolean selected)]
  public native interface HTMLOptionElement extends HTMLElement {
//             attribute 
	  boolean disabled{}
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute 
	  String label{}
//             attribute 
	  boolean defaultSelected{}
//             attribute 
	  boolean selected{}
//             attribute 
	  String value{}

//    readonly attribute 
	  String text{}
//    readonly attribute 
	  long index{}
  }

  public native interface HTMLTextAreaElement extends HTMLElement {
//             attribute 
	  boolean autofocus{}
//             attribute unsigned 
	  long cols{}
//             attribute 
	  boolean disabled{}
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute
	  long maxLength{}
//             attribute 
	  String name{}
//             attribute 
	  String placeholder{}
//             attribute 
	  boolean readOnly{}
//             attribute 
	  boolean required{}
//             attribute unsigned 
	  long rows{}
//             attribute 
	  String wrap{}

//    readonly attribute 
	  String type{}
//             attribute 
	  String defaultValue{}
//             attribute 
	  String value{}

//    readonly attribute 
	  boolean willValidate{}
//    readonly attribute 
	  ValidityState validity{}
//    readonly attribute 
	  String validationMessage{}
	  boolean checkValidity();
	  void setCustomValidity(final String error);

//	  readonly attribute 
	  NodeList labels{}

	  void select();
//             attribute unsigned 
	  long selectionStart{}
//             attribute unsigned 
	  long selectionEnd{}
	  void setSelectionRange(final /*unsigned*/ long start, final /*unsigned*/ long end);
  }

  public native interface HTMLOutputElement extends HTMLElement {
//             attribute 
	  String htmlFor{}
//    readonly attribute 
	  HTMLFormElement form{}
//             attribute 
	  String name{}

//    readonly attribute
	  String type{}
//             attribute 
	  String defaultValue{}
//             attribute 
	  String value{}

//    readonly attribute 
	  boolean willValidate{}
//    readonly attribute 
	  ValidityState validity{}
//    readonly attribute 
	  String validationMessage{}
	  boolean checkValidity();
	  void setCustomValidity(final String error);
  }

  public native interface ValidityState {
//    readonly attribute 
	  boolean valueMissing{}
//    readonly attribute 
	  boolean typeMismatch{}
//    readonly attribute 
	  boolean patternMismatch{}
//    readonly attribute 
	  boolean tooLong{}
//    readonly attribute 
	  boolean rangeUnderflow{}
//    readonly attribute 
	  boolean rangeOverflow{}
//    readonly attribute 
	  boolean stepMismatch{}
//    readonly attribute 
	  boolean customError{}
//    readonly attribute 
	  boolean valid{}
  }

  public native interface HTMLDetailsElement extends HTMLElement {
//             attribute 
	  boolean open{}
  }

  public native interface HTMLDataGridElement extends HTMLElement {
//             attribute 
	  DataGridDataProvider data{}
//    readonly attribute
	  DataGridSelection selection{}
//             attribute 
	  boolean multiple{}
//             attribute
	  boolean disabled{}
	  void updateEverything();
	  void updateRowsChanged(final RowSpecification row, final /*unsigned*/ long count);
	  void updateRowsInserted(final RowSpecification row, final /*unsigned*/ long count);
	  void updateRowsRemoved(final RowSpecification row, final /*unsigned*/ long count);
	  void updateRowChanged(final RowSpecification row);
	  void updateColumnChanged(final /*unsigned*/ long column);
	  void updateCellChanged(final RowSpecification row, final /*unsigned*/ long column);
  }

//  [NoInterfaceObject] 
  public native interface RowSpecification {
    // binding-specific public native interface
  }

  // To be implemented by Web authors as a JS object
//  [NoInterfaceObject] 
  public native interface DataGridDataProvider {
    void initialize(final HTMLDataGridElement datagrid);
    /*unsigned*/ long getRowCount(final RowSpecification row);
    /*unsigned*/ long getChildAtPosition(final RowSpecification parentRow, final /*unsigned*/ long position);
    /*unsigned*/ long getColumnCount();
    String getCaptionText(final /*unsigned*/ long column);
    void getCaptionClasses(final /*unsigned*/ long column, final DOMTokenList classes);
    String getRowImage(final RowSpecification row);
    HTMLMenuElement getRowMenu(final RowSpecification row);
    void getRowClasses(final RowSpecification row, final DOMTokenList classes);
    String getCellData(final RowSpecification row, final /*unsigned*/ long column);
    void getCellClasses(final RowSpecification row, final /*unsigned*/ long column, final DOMTokenList classes);
    void toggleColumnSortState(final /*unsigned*/ long column);
    void setCellCheckedState(final RowSpecification row, final /*unsigned*/ long column, final long state);
    void cycleCell(final RowSpecification row, final /*unsigned*/ long column);
    void editCell(final RowSpecification row, final /*unsigned*/ long column, final String data);
  }

  public native interface DataGridSelection {
//    readonly attribute unsigned 
	  long length{}
//	  getter RowSpecification item(final unsigned long index);
	  RowSpecification this[long index];
	  boolean isSelected(final RowSpecification row);
	  void setSelected(final RowSpecification row, final boolean selected);

	  void selectAll();
	  void invert();
	  void clear();
  }

  public native interface HTMLCommandElement extends HTMLElement {
//             attribute 
	  String type{}
//             attribute 
	  String label{}
//             attribute 
	  String icon{}
//             attribute
	  boolean disabled{}
//             attribute 
	  boolean checked{}
//             attribute 
	  String radiogroup{}
//             attribute 
	  boolean defaultValue{}  // XXX default
    // XXX void click(); // shadows HTMLElement.click()
  }

  public native interface HTMLBrowserButtonElement extends HTMLElement {
//             attribute 
	  String type{}
//    readonly attribute 
	  boolean supported{}
//    readonly attribute 
	  boolean disabled{}
  }

  public native interface HTMLMenuElement extends HTMLElement {
//             attribute 
	  String type{}
//             attribute 
	  String label{}
  }

//  [NoInterfaceObject] 
  public native interface Command {
//	  readonly attribute 
	  String commandType{}
//	  readonly attribute 
	  String id{}
//	  readonly attribute 
	  String label{}
//	  readonly attribute 
	  String title{}
//	  readonly attribute 
	  String icon{}
//	  readonly attribute 
	  boolean hidden{}
//	  readonly attribute 
	  boolean disabled{}
//	  readonly attribute
	  boolean checked{}
	  void click();
  }

  public native interface HTMLLegendElement extends HTMLElement {
//	  readonly attribute 
	  HTMLFormElement form{}
  }

//  typedef Window /*WindowProxy*/Window ;
//  [IndexGetter, NameGetter=OverrideBuiltins]
  public native interface Window {
    // the current browsing context
//    readonly attribute
	  /*WindowProxy*/Window  window{}
//    readonly attribute 
	  /*WindowProxy*/Window  self{}
//             attribute 
	  String name{}
//    [PutForwards=href] readonly attribute 
	  Location location{}
//    readonly attribute 
	  History history{}
//    readonly attribute 
	  UndoManager undoManager{}
	  Selection getSelection();
//    [Replaceable] readonly attribute 
	  BarProp locationbar{}
//    [Replaceable] readonly attribute 
	  BarProp menubar{}
//    [Replaceable] readonly attribute 
	  BarProp personalbar{}
//    [Replaceable] readonly attribute 
	  BarProp scrollbars{}
//    [Replaceable] readonly attribute
	  BarProp statusbar{}
//    [Replaceable] readonly attribute 
	  BarProp toolbar{}
	  void close();
	  void focus();
	  void blur();

    // other browsing contexts
//    readonly attribute 
	  /*WindowProxy*/Window  frames{}
//    readonly attribute unsigned 
	  long length{}
//    readonly attribute 
	  /*WindowProxy*/Window  top{}
//    [Replaceable] readonly attribute 
	  /*WindowProxy*/Window  opener{}
//    readonly attribute 
	  /*WindowProxy*/Window  parent{}
//    readonly attribute 
	  Element frameElement{}
	  /*WindowProxy*/Window  open();
	  /*WindowProxy*/Window  open(final String url);
	  /*WindowProxy*/Window  open(final String url, final String target);
	  /*WindowProxy*/Window  open(final String url, final String target, final String features);
	  /*WindowProxy*/Window  open(final String url, final String target, final String features, final String replace);

    // the user agent
//    readonly attribute 
	  Navigator navigator{}
//    readonly attribute 
	  Storage localStorage{}
//    readonly attribute 
	  Storage sessionStorage{}
//	  Database openDatabase(final String name, final String version, final String displayName, final /*unsigned*/ long estimatedSize);
//	  readonly attribute 
	  ApplicationCache applicationCache{}

	  // user prompts
	  void alert(final String message);
	  boolean confirm(final String message);
	  String prompt(final String message);
	  String prompt(final String message, final /*optional*/ String defaultValue);
	  void print();
	  Object showModalDialog(final String url);
	  Object showModalDialog(final String url, final /*optional*/ Object argument);

    // cross-document messaging
	  void postMessage(final Object message, final String targetOrigin);
	  void postMessage(final Object message, final /*MessagePortArray*/MessagePort[] ports, final String targetOrigin);

    // event handler DOM attributes
//	  attribute 
	  Function onabort{}
//	  attribute
	  Function onbeforeunload{}
//	     attribute 
	  Function onblur{}
//	     attribute 
	  Function onchange{}
//	     attribute 
	  Function onclick{}
//	     attribute 
	  Function oncontextmenu{}
//	     attribute 
	  Function ondblclick{}
//	     attribute 
	  Function ondrag{}
//	     attribute 
	  Function ondragend{}
//	     attribute 
	  Function ondragenter{}
//	     attribute 
	  Function ondragleave{}
//	     attribute 
	  Function ondragover{}
//	     attribute
	  Function ondragstart{}
//	     attribute
	  Function ondrop{}
//	     attribute 
	  Function onerror{}
//	     attribute 
	  Function onfocus{}
//	     attribute 
	  Function onhashchange{}
//	     attribute 
	  Function onkeydown{}
//	     attribute 
	  Function onkeypress{}
//	     attribute 
	  Function onkeyup{}
//	     attribute
	  Function onload{}
//	     attribute 
	  Function onmessage{}
//	     attribute 
	  Function onmousedown{}
//	     attribute 
	  Function onmousemove{}
//	     attribute 
	  Function onmouseout{}
//	     attribute 
	  Function onmouseover{}
//	     attribute
	  Function onmouseup{}
//	     attribute 
	  Function onmousewheel{}
//	     attribute 
	  Function ononline{}
//	     attribute 
	  Function onoffline{}
//	     attribute 
	  Function onpopstate{}
//	     attribute 
	  Function onresize{}
//	     attribute 
	  Function onscroll{}
//	     attribute 
	  Function onselect{}
//	     attribute 
	  Function onstorage{}
//	     attribute
	  Function onsubmit{}
//	     attribute 
	  Function onunload{}
  }

  public native interface BarProp {
//             attribute 
	  boolean visible{}
  }

//  [Callback=FunctionOnly, NoInterfaceObject]
  public native interface Function {
	  Object call(final Object... arguments);
  }

//  Window implements WindowModal;
//  [NoInterfaceObject,  XXX] 
  public native interface WindowModal {
//    readonly attribute 
	  Object dialogArguments{}
//             attribute 
	  String returnValue{}
  }

  public native interface Navigator {
    // objects implementing this public native interface also implement the interfaces given below
  }

//  Navigator implements NavigatorID;
//  [NoInterfaceObject] 
  public native interface NavigatorID {
//    readonly attribute 
	  String appName{}
//    readonly attribute 
	  String appVersion{}
//    readonly attribute 
	  String platform{}
//    readonly attribute 
	  String userAgent{}
  }

//  Navigator implements NavigatorOnLine;
//  [NoInterfaceObject] 
public native interface NavigatorOnLine {
//    readonly attribute 
	boolean onLine{}
  }

//  Navigator implements NavigatorAbilities;
//  [NoInterfaceObject] 
public native interface NavigatorAbilities {
    // content handler registration
    void registerProtocolHandler(final String protocol, final String url, final String title);
    void registerContentHandler(final String mimeType, final String url, final String title);
    void getStorageUpdates();
  }

  public native interface ApplicationCache {

    // update status
//    const unsigned 
	  static final short UNCACHED = 0;
//    const unsigned 
	  static final short IDLE = 1;
//    const unsigned 
	  static final short CHECKING = 2;
//    const unsigned 
	  static final short DOWNLOADING = 3;
//    const unsigned 
	  static final short UPDATEREADY = 4;
//    const unsigned 
	  static final short OBSOLETE = 5;
//    readonly attribute unsigned 
	  short status{}

	  // updates
	  void update();
	  void swapCache();

    // events
//             attribute 
	  Function onchecking{}
//             attribute 
	  Function onerror{}
//             attribute 
	  Function onnoupdate{}
//             attribute
	  Function ondownloading{}
//             attribute 
	  Function onprogress{}
//             attribute 
	  Function onupdateready{}
//             attribute 
	  Function oncached{}
//             attribute 
	  Function onobsolete{}

  }

  public native interface History {
//    readonly attribute
	  long length{}
	  void go();
	  void go(final /*optional*/ long delta);
	  void back();
	  void forward();
	  void pushState(final Object data, final String title);
	  void pushState(final Object data, final String title, final /*optional*/ String url);
	  void clearState();
  }

  public native interface PopStateEvent extends Event {
//    readonly attribute 
	  Object state{}
	  void initPopStateEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg, final Object stateArg);
	  void initPopStateEventNS(final String namespaceURIArg, final String typeArg, final boolean canBubbleArg, final boolean cancelableArg, final Object stateArg);
  }

  public native interface Location {
//    readonly attribute 
	  String href{}
	  void assign(final String url);
	  void replace(final String url);
	  void reload();

    // URL decomposition attributes
//             attribute 
	  String protocol{}
//             attribute 
	  String host{}
//             attribute
	  String hostname{}
//             attribute 
	  String port{}
//             attribute
	  String pathname{}
//             attribute 
	  String search{}
//             attribute 
	  String hash{}

	  // resolving relative URLs
	  String resolveURL(final String url);
  }

  public native interface BeforeUnloadEvent extends Event {
//             attribute 
	  String returnValue{}
  }

  public native interface Selection {
//    stringifier;
//    readonly attribute 
	  Node anchorNode{}
//    readonly attribute
	  long anchorOffset{}
//    readonly attribute 
	  Node focusNode{}
//    readonly attribute 
	  long focusOffset{}
//    readonly attribute 
	  boolean isCollapsed{}
	  void collapse(final Node parentNode, final long offset);
	  void collapseToStart();
	  void collapseToEnd();
	  void selectAllChildren(final Node parentNode);
	  void deleteFromDocument();
//	  readonly attribute 
	  long rangeCount{}
	  Range getRangeAt(final long index);
	  void addRange(final Range range);
	  void removeRange(final Range range);
	  void removeAllRanges();
  }

  public native interface DragEvent extends MouseEvent {
//    readonly attribute 
	  DataTransfer dataTransfer{}

    void initDragEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg, final AbstractView viewArg, final long detailArg, final long screenXArg, final long screenYArg, final long clientXArg, final long clientYArg, final boolean ctrlKeyArg, final boolean altKeyArg, final boolean shiftKeyArg, final boolean metaKeyArg, final /*unsigned*/ short buttonArg, final EventTarget relatedTargetArg, final DataTransfer dataTransferArg);
    void initDragEventNS(final String namespaceURIArg, final String typeArg, final boolean canBubbleArg, final boolean cancelableArg, final AbstractView viewArg, final long detailArg, final long screenXArg, final long screenYArg, final long clientXArg, final long clientYArg, final /*unsigned*/ short buttonArg, final EventTarget relatedTargetArg, final String modifiersListArg, final DataTransfer dataTransferArg);
  }

  public native interface DataTransfer {
//             attribute 
	  String dropEffect{}
//             attribute 
	  String effectAllowed{}
//    readonly attribute 
	  DOMStringList types{}
	  void clearData();
	  void clearData(final /*optional*/ String format);
	  void setData(final String format, final String data);
	  String getData(final String format);
	  void setDragImage(final Element image, final long x, final long y);
	  void addElement(final Element element);
  }

  public native interface UndoManager {
//    readonly attribute unsigned 
	  long length{}
//	  getter any item(final unsigned long index);
	  Object this[final /*unsigned*/ long index];
//	  readonly attribute unsigned
	  long position{}
	  /*unsigned*/ long add(final Object data, final String title);
	  void remove(final /*unsigned*/ long index);
	  void clearUndo();
	  void clearRedo();
  }

  public native interface UndoManagerEvent extends Event {
//    readonly attribute 
	  Object data{}
	  void initUndoManagerEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg, final Object dataArg);
	  void initUndoManagerEventNS(final String namespaceURIArg, final String typeArg, final boolean canBubbleArg, final boolean cancelableArg, final Object dataArg);
  }

  public native interface MessageEvent extends Event {
//    readonly attribute
	  Object data{}
//    readonly attribute 
	  String origin{}
//    readonly attribute 
	  String lastEventId{}
//    readonly attribute 
	  /*WindowProxy*/Window  source{}
//    readonly attribute 
	  /*MessagePortArray*/MessagePort[] ports{}
	  void initMessageEvent(final String typeArg, final boolean canBubbleArg, final boolean cancelableArg, final Object dataArg, final String originArg, 
			  final String lastEventIdArg, final /*WindowProxy*/Window  sourceArg, final /*MessagePortArray*/MessagePort[] portsArg);
	  void initMessageEventNS(final String namespaceURI, final String typeArg, final boolean canBubbleArg, 
			  final boolean cancelableArg, final Object dataArg, final String originArg, final String lastEventIdArg,
			  final /*WindowProxy*/Window  sourceArg, final /*MessagePortArray*/MessagePort[] portsArg);
  }

//  [Constructor]
  public native interface MessageChannel {
//    readonly attribute 
	  MessagePort port1{}
//    readonly attribute 
	  MessagePort port2{}
  }

  public native interface MessagePort {
//    readonly attribute 
	  boolean active{}
	  void postMessage(final Object message);
	  void postMessage(final Object message, final /*optional*/ /*MessagePortArray*/MessagePort[] ports);
	  void start();
	  void close();

    // event handler attributes
//             attribute 
	  Function onmessage{}
  }

//  Window implements WindowTimers;
//  [NoInterfaceObject] 
public native interface WindowTimers {
    // timers
    long setTimeout(final TimeoutHandler handler, final long timeout, final Object... arguments);
    long setTimeout(final String code, final long timeout);
    long setTimeout(final String code, final long timeout, final String language);
    void clearTimeout(final long handle);
    long setInterval(final TimeoutHandler handler, final long timeout, final Object... arguments);
    long setInterval(final String code, final long timeout);
    long setInterval(final String code, final long timeout, final String language);
    void clearInterval(final long handle);
  }

//  [Callback=FunctionOnly, NoInterfaceObject]
  public native interface TimeoutHandler {
    void handleEvent(final any... args);
  }

//  AbstractView implements MediaModeAbstractView;
//  [NoInterfaceObject] 
public native interface MediaModeAbstractView {
//    readonly attribute 
	String mediaMode{}
}

public native interface HTMLDivElement extends HTMLElement {
	
}

public native interface HTMLSpanElement  extends HTMLElement {}
public native interface HTMLPreElement extends HTMLElement {}
public native interface HTMLHRElement extends HTMLElement {}
public native interface HTMLParagraphElement extends HTMLElement {}
public native interface HTMLDListElement extends HTMLElement {}
public native interface HTMLHeadingElement extends HTMLElement {}
public native interface HTMLDataElement extends HTMLElement {
//    attribute 
	String value{}
}

public native interface HTMLTrackElement extends HTMLElement {
//    attribute 
	String kind{}
//    attribute 
	String src{}
//    attribute 
	String srclang{}
//    attribute 
	String label{}
//    attribute
//	boolean default{}

//    const unsigned 
	short NONE = 0;
//    const unsigned 
	short LOADING = 1;
//    const unsigned 
	short LOADED = 2;
//    const unsigned 
	short ERROR = 3;
//    readonly attribute unsigned 
	short readyState{}

//    readonly attribute 
	TextTrack track{}
}

//enum 
public final class TextTrackMode { 
	public static final String disabled = "disabled";
	public static final String hidden = "hidden";
	public static final String showing = "showing";
}
//enum 
public final class TextTrackKind { 
	public static final String subtitles = "subtitles";
	public static final String captions = "captions";
	public static final String descriptions = "descriptions";
	public static final String chapters = "chapters";
	public static final String metadata = "metadata" ;
}
interface TextTrack extends EventTarget {
//  readonly attribute 
	TextTrackKind kind{}
//  readonly attribute 
	String label{}
//  readonly attribute 
	String language{}

//  readonly attribute 
	String id{}
//  readonly attribute 
	String inBandMetadataTrackDispatchType{}

//           attribute 
	TextTrackMode mode{}

//  readonly attribute 
	TextTrackCueList/*?*/ cues{}
//  readonly attribute 
	TextTrackCueList/*?*/ activeCues{}

	void addCue(TextTrackCue cue);
	void removeCue(TextTrackCue cue);

	//           attribute 
	EventHandler oncuechange{}
}

interface TextTrackCueList {
//	  readonly attribute unsigned 
	long length{}
//	  getter TextTrackCue (unsigned long index);
	TextTrackCue this[long index];
	TextTrackCue/*?*/ getCueById(String id);
}

interface TextTrackCue extends EventTarget {
//	  readonly attribute 
	TextTrack/*?*/ track{}

//	           attribute 
	String id{}
//	           attribute 
	double startTime{}
//	           attribute 
	double endTime{}
//	           attribute 
	boolean pauseOnExit{}

//	           attribute 
	EventHandler onenter{}
//	           attribute 
	EventHandler onexit{}
}

interface HTMLKeygenElement extends HTMLElement {
//    attribute 
	boolean autofocus{}
//    attribute  
	String challenge{}
//    attribute 
	boolean disabled{}
//    readonly attribute 
	HTMLFormElement/*?*/ form{}
//    attribute 
	String keytype{}
//    attribute 
	String name{}

//    readonly attribute 
	String type{}

//    readonly attribute 
	boolean willValidate{}
//    readonly attribute 
	ValidityState validity{}
//    readonly attribute 
	String validationMessage{}
    boolean checkValidity();
    void setCustomValidity(String error);

//    readonly attribute 
    NodeList labels{}
}

interface HTMLTemplateElement extends HTMLElement {
//	  readonly attribute 
	DocumentFragment content{}
}

public  interface figure extends HTMLElement {}
public interface figcaption extends HTMLElement {}
public interface main extends HTMLElement {}
public  interface article extends HTMLElement {}
public  interface section extends HTMLElement {} 
public  interface nav extends HTMLElement {}
public  interface aside extends HTMLElement {} 
public  interface header extends HTMLElement {} 
public  interface footer extends HTMLElement {} 
public  interface address extends HTMLElement {} 

public  interface em extends HTMLElement {} 
public  interface strong extends HTMLElement {} 
public  interface small extends HTMLElement {} 
public  interface s extends HTMLElement {}
public  interface cite extends HTMLElement {}
public  interface q extends HTMLElement {}
public  interface dfn extends HTMLElement {} 
public  interface abbr extends HTMLElement {}

public  interface code extends HTMLElement {} 

public  interface var extends HTMLElement {} 
public  interface samp extends HTMLElement {} 
public  interface kbd extends HTMLElement {} 
public  interface sub extends HTMLElement {} 
public  interface sup extends HTMLElement {}
public  interface i extends HTMLElement {}
public  interface b extends HTMLElement {}
public  interface u extends HTMLElement {}
public  interface mark extends HTMLElement {} 
public  interface ruby extends HTMLElement {} 
public  interface rb extends HTMLElement {} 
public  interface rt extends HTMLElement {}
public  interface rtc extends HTMLElement {}
public  interface rp extends HTMLElement {}
public  interface bdi extends HTMLElement {}
public  interface bdo extends HTMLElement {}
public  interface span extends HTMLElement {}
public  interface ins extends HTMLModElement{}
public  interface del extends HTMLModElement{}

public  interface tbody extends HTMLTableSectionElement {}
public  interface thead  extends HTMLTableSectionElement {}
public  interface tfoot  extends HTMLTableSectionElement {}



